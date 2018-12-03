package org.smarthome.skill.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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
import org.smarthome.skill.jsonbean.dueros.response.DuerOSResponseHeader;
import org.smarthome.skill.jsonbean.dueros.response.DuerOSResponsePayload;
import org.smarthome.skill.jsonbean.dueros.response.DuerOSResponseRoot;
import org.smarthome.skill.jsonbean.dueros.response.DuerOSResponseTemperature;
import org.smarthome.skill.jsonbean.dueros.response.DuerOSResponseTemperatureMode;
import org.smarthome.skill.service.SkillService;
import org.smarthome.skill.service.SmartHomeSkillService;
import org.smarthome.skill.util.DuerOSSkillUtil;
import org.smarthome.skill.util.SkillDevicesOrderUtil;
import org.smarthome.skill.util.SkillValueUtil;
import org.smarthome.skill.util.TypeUtil;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.type.TypeReference;

public class DuerOSImpl implements SkillService {

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
			return control(shss, baiduRequest);
		} else {
			return query(shss, baiduRequest);
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
		String accessToken = baiduRequest.getPayload().getAccessToken();
		String openUid = baiduRequest.getPayload().getOpenUid();
		List<DeviceEntity> list = shss.discoveryDevice(accessToken, openUid);
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
	private Object control(SmartHomeSkillService shss, BaiduRequestRoot baiduRequest) {
		String accessToken = baiduRequest.getPayload().getAccessToken();
		String openUid = baiduRequest.getPayload().getOpenUid();
		String namespace = baiduRequest.getHeader().getNamespace();
		String name = baiduRequest.getHeader().getName();
		DuerOSResponseHeader baiduRespHeader = packHeader(namespace, name.replace("Request", "Confirmation"));
		String applianceId = baiduRequest.getPayload().getAppliance().getApplianceId();
		Object val = null;
		if (name.equals("IncrementTemperatureRequest")) {// 调高空调温度
			val = baiduRequest.getPayload().getDeltaValue().getValue();
		} else if (name.equals("DecrementTemperatureRequest")) {// 调低空调温度
			val = baiduRequest.getPayload().getDeltaValue().getValue();
		} else if (name.equals("SetTemperatureRequest")) {// 设置空调温度
			val = baiduRequest.getPayload().getTargetTemperature().getValue();
			if ("CELSIUS".equals(baiduRequest.getPayload().getTargetTemperature().getScale())) {
				if ("min".equals(String.valueOf(val))) {
					val = 16;
				} else if ("max".equals(String.valueOf(val))) {
					val = 30;
				} else if ((new Double(String.valueOf(val)).intValue()) < 16) {
					val = 16;
				} else if ((new Double(String.valueOf(val)).intValue()) > 30) {
					val = 30;
				}
			}
		} else if (name.equals("SetModeRequest")) {// 设置空调模式
			val = SkillValueUtil.getAirMode(baiduRequest.getPayload().getMode().getValue());
		} else if (name.equals("SetTVChannelRequest")) {// 设置电视频道
			val = baiduRequest.getPayload().getDeltaValue().getValue();
		} else if (name.equals("SetFanSpeedRequest")) {// 空调风速
			int speed = baiduRequest.getPayload().getFanSpeed().getValue();
			if (speed > 3) {
				speed = 3;
			}
			val = speed;
		} else if (name.equals("TimingTurnOnRequest")) {// 定时打开(时间戳)
			val = baiduRequest.getPayload().getTimestamp().getValue();
		}
		name = SkillDevicesOrderUtil.getAiyunCmd(name, 2);
		ResultDTO<Object> result = shss.controlDevice(accessToken, openUid, name, applianceId, null, val);
		int code = result.getCode();
		if (1 != code) {
			DuerOSResponseHeader baiduRespErrorHeader = null;
			if (-5 == code) {// 参数错误
				baiduRespErrorHeader = packHeader(namespace, "UnsupportedOperationError");
			} else if (-8 == code) {// 操作错误
				baiduRespErrorHeader = packHeader(namespace, "UnsupportedOperationError");
			} else if (-1 == code) {// "无此设备类型"
				baiduRespErrorHeader = packHeader(namespace, "UnexpectedInformationReceivedError");
			} else if (-4 == code) {// "参数无效"
				baiduRespErrorHeader = packHeader(namespace, "ValueOutOfRangeError");
			} else if (-3 == code) {// "指令发送失败"
				baiduRespErrorHeader = packHeader(namespace, "TargetOfflineError");
			} else {// "指令发送异常"
				baiduRespErrorHeader = packHeader(namespace, "DriverInternalError");
			}
			return packRoot(baiduRespErrorHeader, new DuerOSResponsePayload());
		}
		return packRoot(baiduRespHeader, new DuerOSResponsePayload());
	}

	/**
	 * 查询设备状态
	 * 
	 * @param shss
	 * @param json
	 * @return
	 */
	private Object query(SmartHomeSkillService shss, BaiduRequestRoot baiduRequest) {
		String accessToken = baiduRequest.getPayload().getAccessToken();
		String openUid = baiduRequest.getPayload().getOpenUid();
		String namespace = baiduRequest.getHeader().getNamespace();
		String name = baiduRequest.getHeader().getName();
		String applianceId = baiduRequest.getPayload().getAppliance().getApplianceId();
		DuerOSResponseHeader baiduRespHeader = packHeader(namespace, name.replace("Request", "Response"));
		DuerOSResponsePayload duerOSResponsePayload = new DuerOSResponsePayload();
		ResultDTO<Object> result = shss.queryDevice(accessToken, openUid, name, applianceId);
		if (result.getCode() == 1) {
			if (name.equals("GetTemperatureReadingRequest")) {
				DuerOSResponseTemperature duerOSResponseTemperature2 = new DuerOSResponseTemperature();
				duerOSResponseTemperature2.setValue(TypeUtil.toInt(result.getData()));
				duerOSResponseTemperature2.setScale("CELSIUS");
				duerOSResponsePayload.setTemperatureReading(duerOSResponseTemperature2);
				return packRoot(baiduRespHeader, duerOSResponsePayload);
			} else if (name.equals("GetTargetTemperatureRequest")) {
				DuerOSResponseTemperature duerOSResponseTemperature = new DuerOSResponseTemperature();
				duerOSResponseTemperature.setValue(TypeUtil.toInt(result.getData()));
				duerOSResponseTemperature.setScale("CELSIUS");
				duerOSResponsePayload.setTemperature(duerOSResponseTemperature);
				duerOSResponsePayload.setApplianceResponseTimestamp(SkillValueUtil.getTime());
				DuerOSResponseTemperatureMode duerOSResponseTemperatureMode = new DuerOSResponseTemperatureMode();
				duerOSResponseTemperatureMode.setValue("AUTO");
				duerOSResponseTemperatureMode.setFriendlyName("自动模式");
				duerOSResponsePayload.setTemperatureMode(duerOSResponseTemperatureMode);
				return packRoot(baiduRespHeader, duerOSResponsePayload);
			}
		}
		return packRoot(packHeader(namespace, "UnsupportedOperationError"), new DuerOSResponsePayload());
	}

	private DuerOSResponseHeader packHeader(String namespace, String name) {
		DuerOSResponseHeader baiduRespHeader = new DuerOSResponseHeader();
		baiduRespHeader.setNamespace(namespace);
		baiduRespHeader.setName(name);
		baiduRespHeader.setMessageId(UUID.randomUUID().toString());
		baiduRespHeader.setPayloadVersion("1");
		return baiduRespHeader;
	}

	private DuerOSResponseRoot packRoot(DuerOSResponseHeader header, DuerOSResponsePayload payload) {
		DuerOSResponseRoot rootRespRoot = new DuerOSResponseRoot();
		rootRespRoot.setHeader(header);
		rootRespRoot.setPayload(payload);
		return rootRespRoot;
	}

}
