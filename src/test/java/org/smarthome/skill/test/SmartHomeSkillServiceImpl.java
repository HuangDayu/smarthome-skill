package org.smarthome.skill.test;

import java.util.List;

import cn.huangdayu.smarthome.skill.dto.ResultDTO;
import cn.huangdayu.smarthome.skill.entity.DeviceEntity;
import cn.huangdayu.smarthome.skill.service.SmartHomeSkillService;

public class SmartHomeSkillServiceImpl implements SmartHomeSkillService {

	public List<DeviceEntity> discoveryDevice(String token,String openUid) {
		System.out.println(token);
		return null;
	}

	@Override
	public ResultDTO<Object> controlDevice(String accessToken, String openUid, String order, String deviceID,
			String devicePlace, Object value) {
		return null;
	}

	public ResultDTO<Object> queryDevice(String token,String openUid, String order, String deviceID) {
		return null;
	}
}
