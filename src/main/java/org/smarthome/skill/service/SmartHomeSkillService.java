package org.smarthome.skill.service;

import java.util.List;
import org.smarthome.skill.entity.DeviceEntity;
import org.smarthome.skill.entity.KVEntity;
import org.smarthome.skill.enums.ResultDTO;

public interface SmartHomeSkillService {
	
	/***
	 * 发现设备
	 * @param token
	 * @return
	 */
	List<DeviceEntity> discoveryDevice(String token);
	/**
	 * 控制设备
	 * @param token
	 * @param order 指令
	 * @param deviceID 设备ID
	 * @param devicePlace 设备位置
	 * @param deviceValue 设备属性值
	 * @return
	 */
	ResultDTO controlDevice(String token,String order,String deviceID,String devicePlace,String deviceValue);
	
	/***
	 * 查询设备状态和属性信息
	 * @param token
	 * @param order 指令
	 * @param deviceID 设备ID
	 * @return
	 */
	KVEntity queryDevice(String token,String order,String deviceID);
}
