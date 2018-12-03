package org.smarthome.skill.test;

import java.util.List;
import org.smarthome.skill.dto.ResultDTO;
import org.smarthome.skill.entity.DeviceEntity;
import org.smarthome.skill.service.SmartHomeSkillService;

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
