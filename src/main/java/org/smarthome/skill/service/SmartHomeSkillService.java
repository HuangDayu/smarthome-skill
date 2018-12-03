package org.smarthome.skill.service;

import java.util.List;

import org.smarthome.skill.dto.ResultDTO;
import org.smarthome.skill.entity.DeviceEntity;
import org.smarthome.skill.entity.KVEntity;

public interface SmartHomeSkillService {
	
	/**
	 * 发现设备
	 * @param accessToken
	 * @param openUid
	 * @return
	 */
	List<DeviceEntity> discoveryDevice(String accessToken,String openUid);
	/**
	 * 控制设备
	 * @param accessToken
	 * @param openUid
	 * @param order 指令
	 * @param deviceID 设备ID
	 * @param devicePlace 设备位置（可以为空）
	 * @param value 设备属性值（可以为空）
	 * @return
	 */
	ResultDTO<Object> controlDevice(String accessToken,String openUid,String order,String deviceID,String devicePlace,Object value);
	
	/***
	 * 查询设备状态和属性信息
	 * @param accessToken
	 * @param openUid
	 * @param order 指令
	 * @param deviceID 设备ID
	 * @return
	 */
	ResultDTO<Object> queryDevice(String accessToken,String openUid,String order,String deviceID);
}
