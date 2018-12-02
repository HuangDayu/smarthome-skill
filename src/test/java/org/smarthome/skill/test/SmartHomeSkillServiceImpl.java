package org.smarthome.skill.test;

import java.util.List;

import org.smarthome.skill.entity.DeviceEntity;
import org.smarthome.skill.entity.KVEntity;
import org.smarthome.skill.service.SmartHomeSkillService;

public class SmartHomeSkillServiceImpl implements SmartHomeSkillService {

	public List<DeviceEntity> discoveryDevice(String token) {
System.out.println(token);
		return null;
	}

	public boolean controlDevice(String token, String order, String deviceID, String devicePlace, String deviceValue) {
		// TODO Auto-generated method stub
		return false;
	}

	public KVEntity queryDevice(String token, String order, String deviceID) {
		// TODO Auto-generated method stub
		return null;
	}

}
