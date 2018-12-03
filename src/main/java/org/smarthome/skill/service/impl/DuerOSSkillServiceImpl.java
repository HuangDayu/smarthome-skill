package org.smarthome.skill.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.smarthome.skill.dto.ResultDTO;
import org.smarthome.skill.entity.DeviceEntity;
import org.smarthome.skill.enums.ResultEnum;
import org.smarthome.skill.enums.SkillPlatformEnum;
import org.smarthome.skill.jsonbean.dueros.request.BaiduRequestRoot;
import org.smarthome.skill.jsonbean.dueros.response.DuerOSResponseAdditionalApplianceDetails;
import org.smarthome.skill.jsonbean.dueros.response.DuerOSResponseAdditionalGroupDetails;
import org.smarthome.skill.jsonbean.dueros.response.DuerOSResponseDiscoveredAppliances;
import org.smarthome.skill.jsonbean.dueros.response.DuerOSResponseDiscoveredGroups;
import org.smarthome.skill.jsonbean.dueros.response.DuerOSResponsePayload;
import org.smarthome.skill.service.SkillService;
import org.smarthome.skill.service.SmartHomeSkillService;
import org.smarthome.skill.util.DuerOSSkillUtil;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.type.TypeReference;

public class DuerOSSkillServiceImpl implements SkillService {

	public Object skillOperation(SmartHomeSkillService shss, String json) {
		BaiduRequestRoot baiduRequest = null;
		try {
			// baiduRequest=JSON.parseObject(json,new TypeReference<BaiduRequestRoot>(){});
			baiduRequest = JSONObject.parseObject(json, BaiduRequestRoot.class);
		} catch (Exception e) {
			return ResultDTO.entiey(-5);
		}
		String namespace = baiduRequest.getHeader().getNamespace();
		if (namespace.equals("DuerOS.ConnectedHome.Discovery")) {
			return discovery(shss, baiduRequest);
		} else if (namespace.equals("DuerOS.ConnectedHome.Control")) {
			return control(shss, json);
		} else {
			return query(shss, json);
		}
	}

	/***
	 * 发现设备
	 * 
	 * @param shss
	 * @param json
	 * @return
	 */
	private Object discovery(SmartHomeSkillService shss, BaiduRequestRoot baiduRequest) {
		List<DeviceEntity> list = shss.discoveryDevice(baiduRequest.getPayload().getAccessToken());
		DuerOSResponsePayload duerOSResponsePayload = new DuerOSResponsePayload();
		List<DuerOSResponseDiscoveredAppliances> discoveredAppliancesList = new ArrayList<DuerOSResponseDiscoveredAppliances>();
		List<DuerOSResponseDiscoveredGroups> discoveredGroupsList = new ArrayList<DuerOSResponseDiscoveredGroups>();
		ArrayList<String> placeNameList = new ArrayList<String>();
		if (list != null && list.size() > 0) {
			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				DeviceEntity deviceEntity = (DeviceEntity) iterator.next();
				String deviceType = null;
				switch (deviceEntity.getDeviceType()) {
				case OMNIPOTENT_IR_AC:// 空调
					deviceType = "AIR_CONDITION";
					break;
				case OMNIPOTENT_IR_TV:// 电视
					deviceType = "TV_SET";
					break;
				case OMNIPOTENT_IR_STB:// 机顶盒
					deviceType = "SET_TOP_BOX";
					break;
				case OMNIPOTENT_IR_DVD:// DVD
					deviceType = "TV_SET";
					break;
				case OMNIPOTENT_IR_FAN:// 风扇
					deviceType = "FAN";
					break;
				case OMNIPOTENT_IR_AP:// 空气净化器
					deviceType = "AIR_PURIFIER";// :空气净化器
					break;
				case OMNIPOTENT_IR_IPTV:// 电视盒子
					deviceType = "TV_SET";
					break;
				case OMNIPOTENT_IR_PJ:// 投影仪
					deviceType = "TV_SET";
					break;
				case OMNIPOTENT_IR_AS:// 音响
					deviceType = "TV_SET";
					break;
				case OMNIPOTENT_IR_WH:// 热水器
					deviceType = "WATER_HEATER";
					break;
				default:
					deviceType = deviceEntity.getDeviceType().toString();
					break;
				}
				DuerOSResponseDiscoveredAppliances discoveredAppliances1 = new DuerOSResponseDiscoveredAppliances();
				DuerOSResponseAdditionalApplianceDetails additionalApplianceDetails2 = new DuerOSResponseAdditionalApplianceDetails();
				discoveredAppliances1.setActions(DuerOSSkillUtil.getBaiduCmdList(deviceType));
				List<String> applianceTypesList = new ArrayList<String>();
				applianceTypesList.add(deviceType);
				discoveredAppliances1.setApplianceTypes(applianceTypesList);
				additionalApplianceDetails2.setExtraDetail1("位置:" + deviceEntity.getPlace());// 可以为空
				additionalApplianceDetails2.setExtraDetail2("硬件ID:" + deviceEntity.getDeviceId());
				additionalApplianceDetails2.setExtraDetail3("类型:" + deviceEntity.getDeviceType());
				additionalApplianceDetails2.setExtraDetail4("状态:" + deviceEntity.isReachable());// 可以为空
				/** 有子设备则填子设备的ID */
				if (StringUtils.isBlank(deviceEntity.getSubDeviceId())) {
					discoveredAppliances1.setApplianceId(deviceEntity.getDeviceId());
				} else {
					discoveredAppliances1.setApplianceId(deviceEntity.getSubDeviceId());
				}
				if (!placeNameList.contains(deviceEntity.getPlace())) {
					placeNameList.add(deviceEntity.getPlace());
				}
				discoveredAppliances1.setModelName(deviceEntity.getModelName());
				discoveredAppliances1.setVersion(deviceEntity.getVersion());
				discoveredAppliances1.setFriendlyName(deviceEntity.getDeviceName());// 最重要:智能音箱识别的名称 由用户命名
				discoveredAppliances1.setFriendlyDescription("SN:" + deviceEntity.getHardwareSN());// 设备相关的描述
				discoveredAppliances1.setIsReachable(deviceEntity.isReachable());// 设备当前是否能够到达
				discoveredAppliances1.setAdditionalApplianceDetails(additionalApplianceDetails2);
				discoveredAppliances1.setManufacturerName(deviceEntity.getManufacturerName());
				discoveredAppliancesList.add(discoveredAppliances1);
			}
			for (Iterator iterator2 = placeNameList.iterator(); iterator2.hasNext();) {
				String placeName = (String) iterator2.next();
				DuerOSResponseDiscoveredGroups discoveredGroups = new DuerOSResponseDiscoveredGroups();
				DuerOSResponseAdditionalGroupDetails additionalGroupDetails = new DuerOSResponseAdditionalGroupDetails();
				ArrayList<String> applianceIdList = new ArrayList<String>();
				for (Iterator iterator = list.iterator(); iterator.hasNext();) {
					DeviceEntity deviceEntity = (DeviceEntity) iterator.next();
					if (placeName.equals(deviceEntity.getPlace())) {
						if (StringUtils.isBlank(deviceEntity.getSubDeviceId())) {
							applianceIdList.add(deviceEntity.getDeviceId());
						} else {
							applianceIdList.add(deviceEntity.getSubDeviceId());
						}
					}
				}
				discoveredGroups.setGroupName(placeName);
				discoveredGroups.setGroupNotes(placeName + "共有" + applianceIdList.size() + "个设备");
				discoveredGroups.setApplianceIds(applianceIdList);
				additionalGroupDetails.setExtraDetail1("用户:" + baiduRequest.getPayload().getOpenUid());
				additionalGroupDetails.setExtraDetail2("位置：" + placeName);
				additionalGroupDetails.setExtraDetail3("个数：" + applianceIdList.size());
				additionalGroupDetails.setExtraDetail4("列表：" + applianceIdList.toString());
				discoveredGroups.setAdditionalGroupDetails(additionalGroupDetails);
				discoveredGroupsList.add(discoveredGroups);
			}
		}
		duerOSResponsePayload.setDiscoveredAppliances(discoveredAppliancesList);
		duerOSResponsePayload.setDiscoveredGroups(discoveredGroupsList);
		placeNameList.clear();
		return duerOSResponsePayload;
	}

	/***
	 * 控制设备
	 * 
	 * @param shss
	 * @param json
	 * @return
	 */
	private Object control(SmartHomeSkillService shss, String json) {
		return null;
	}

	/**
	 * 查询设备状态
	 * 
	 * @param shss
	 * @param json
	 * @return
	 */
	private Object query(SmartHomeSkillService shss, String json) {
		return null;
	}

}
