package org.smarthome.skill.service;

import java.util.List;
import java.util.Map;

import org.smarthome.skill.entity.DeviceEntity;
import org.smarthome.skill.entity.KVEntity;
import org.smarthome.skill.enums.SkillPlatformEnum;

public interface DeviceService {
	/***
	 * 发现设备
	 * 
	 * @param spEnum
	 * @param json
	 * @return
	 */
	Object discovery(SkillPlatformEnum spEnum, String json);

	/***
	 * 控制设备
	 * 
	 * @param spEnum
	 * @param json
	 * @return 四个值：控制指令，设备ID，设备位置，属性值
	 */
	Map<String, Object> control(SkillPlatformEnum spEnum, String json);

	/***
	 * 查询设备状态
	 * 
	 * @param spEnum
	 * @param json
	 * @return
	 */
	Object query(SkillPlatformEnum spEnum, String json);
}
