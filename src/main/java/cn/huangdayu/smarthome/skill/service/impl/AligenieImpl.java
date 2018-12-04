package cn.huangdayu.smarthome.skill.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;

import cn.huangdayu.smarthome.skill.dto.ResultDTO;
import cn.huangdayu.smarthome.skill.entity.DeviceEntity;
import cn.huangdayu.smarthome.skill.enums.DeviceTypeEnum;
import cn.huangdayu.smarthome.skill.jsonbean.aligenie.request.AliGenceRequestRoot;
import cn.huangdayu.smarthome.skill.jsonbean.aligenie.response.AliGenieResponseDevices;
import cn.huangdayu.smarthome.skill.jsonbean.aligenie.response.AliGenieResponseExtensions;
import cn.huangdayu.smarthome.skill.jsonbean.aligenie.response.AliGenieResponseProperties;
import cn.huangdayu.smarthome.skill.service.SkillService;
import cn.huangdayu.smarthome.skill.service.SmartHomeSkillService;
import cn.huangdayu.smarthome.skill.util.TmallSkillUtil;

public class AligenieImpl implements SkillService {

	@Override
	public Object skillOperation(SmartHomeSkillService shss, String json) {
		AliGenceRequestRoot aliGenceRequestRoot = null;
		try {
			aliGenceRequestRoot = JSONObject.parseObject(json, AliGenceRequestRoot.class);
		} catch (Exception e) {
			return ResultDTO.entiey(-5);
		}
		String namespace = aliGenceRequestRoot.getHeader().getNamespace();
		if (namespace.equals("AliGenie.Iot.Device.Discovery")) {
			return discovery(shss, aliGenceRequestRoot);
		} else if (namespace.equals("AliGenie.Iot.Device.Control")) {
			return control(shss, aliGenceRequestRoot);
		} else {//AliGenie.Iot.Device.Query
			return query(shss, aliGenceRequestRoot);
		}
	}

	/**
	 * 发现设备
	 * 
	 * @param shss
	 * @param json
	 * @return
	 */
	private Object discovery(SmartHomeSkillService shss, AliGenceRequestRoot aliGenceRequestRoot) {
		String accessToken = aliGenceRequestRoot.getPayload().getAccessToken();
		List<DeviceEntity> deviceList = shss.discoveryDevice(accessToken,null);
		List<AliGenieResponseDevices> devicesList = new ArrayList<AliGenieResponseDevices>();
		String url = "http://www.huangdayu.cn/image";
		String modelName = null;
		if (deviceList != null && deviceList.size() > 0) {
			for (DeviceEntity deviceEntity : deviceList) {
				if (deviceEntity == null) {
					continue;
				}
				String deviceName = deviceEntity.getDeviceName();// 设备名称
				String devicePlace = deviceEntity.getPlace();// 房间名称
				DeviceTypeEnum deviceType = deviceEntity.getDeviceType();// 设备类型
				String deviceID = deviceEntity.getDeviceId();// 设备ID,遥控器ID或者子设备ID
				//int deviceStatus = deviceEntity.isReachable();// 设备开关状态（0关1开），不准确
				String hardwareID = deviceEntity.getHardwareSN();// 硬件ID,场景控或者G1
				String hardwareName = deviceEntity.getDeviceName();// 硬件名称
				String firmwareVersion = deviceEntity.getVersion();// 固件版本
				//int hardwareStatus = deviceEntity.getHardwareStatus();// 硬件状态0是离线 1是在线'
				//int hardwareType = deviceEntity.getHardwareType();// 硬件类型，0,1,2是场景控，3是G1,4是A2,5是S1（插座）
				//String hardwareIP = deviceEntity.getHardwareIP();// 硬件IP地址
				AliGenieResponseDevices device = new AliGenieResponseDevices();
				device.setDeviceId(deviceID);
				List<AliGenieResponseProperties> properties = new ArrayList<AliGenieResponseProperties>();
				AliGenieResponseProperties powerstate = new AliGenieResponseProperties();
				powerstate.setName("powerstate");// 电源属性
				powerstate.setValue("off");
				properties.add(powerstate);
				device.setProperties(properties);
				// String[] actions = cbean.get("cmd") != null ?
				// cbean.get("cmd").toString().split(",") : null;
				device.setActions(TmallSkillUtil.getActionsList());
				device.setDeviceName(deviceName);
				int type = 0;
				switch (type) {
				case 1: {// 空调
					modelName = "空调";
					device.setDeviceType("aircondition");
					device.setIcon(url + "icon_air_con.png");
					break;
				}
				case 2: {// 电视
					modelName = "电视";
					device.setDeviceType("television");
					device.setIcon(url + "icon_tv.png");
					break;
				}
				case 3: {// 机顶盒
					modelName = "机顶盒";
					device.setDeviceType("STB");
					device.setIcon(url + "icon_tv_box.png");
					break;
				}
				case 4: {// DVD
					modelName = "DVD";
					device.setDeviceType("STB");
					device.setIcon(url + "icon_tv_box.png");
					break;
				}
				case 5: {// 风扇"
					modelName = "风扇";
					device.setDeviceType("fan");
					device.setIcon(url + "icon_fan.png");
					break;
				}
				case 6: {// 空气净化器
					modelName = "空气净化器";
					device.setDeviceType("airpurifier");
					device.setIcon(url + "icon_air_cleaner.png");
					break;
				}
				case 7: {// 电视盒子
					modelName = "电视盒子";
					device.setDeviceType("STB");
					device.setIcon(url + "icon_tv_box.png");
					break;
				}
				case 8: {// 投影仪
					modelName = "投影仪";
					device.setDeviceType("STB");
					device.setIcon(url + "icon_tv_box.png");
					break;
				}
				case 9: {// 音箱
					modelName = "音箱";
					device.setDeviceType("STB");
					device.setIcon(url + "icon_tv_box.png");
					break;
				}
				case 10: {// 热水器
					modelName = "热水器";
					device.setDeviceType("waterheater");// 热水器
					device.setIcon(url + "icon_water_heater.png");
					break;
				}
				default: {
					continue;
				}
				}
				device.setBrand("艾韵智能");// 品牌
				device.setModel(modelName);
				device.setZone(devicePlace);
				AliGenieResponseExtensions extensions = new AliGenieResponseExtensions();
				extensions.setExtension1("场景控A1");
				extensions.setExtension2("固件版本：" + firmwareVersion);
				extensions.setParentId(hardwareID);// 天猫要求，父设备ID（万能遥控器和插座）
				device.setExtensions(extensions);
				devicesList.add(device);

			}
		}
		return null;
	}

	/***
	 * 控制设备
	 * 
	 * @param shss
	 * @param json
	 * @return
	 */
	private Object control(SmartHomeSkillService shss, AliGenceRequestRoot aliGenceRequestRoot) {
		return null;
	}

	/**
	 * 查询设备状态
	 * 
	 * @param shss
	 * @param json
	 * @return
	 */
	private Object query(SmartHomeSkillService shss, AliGenceRequestRoot aliGenceRequestRoot) {
		return null;
	}
}
