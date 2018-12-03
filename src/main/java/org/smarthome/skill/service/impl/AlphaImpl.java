package org.smarthome.skill.service.impl;

import org.smarthome.skill.service.SkillService;
import org.smarthome.skill.service.SmartHomeSkillService;

public class AlphaImpl implements SkillService {

	@Override
	public Object skillOperation(SmartHomeSkillService smartHomeSkillService, String json) {
		return null;
	}

	/**
	 * 发现设备
	 * 
	 * @param shss
	 * @param json
	 * @return
	 */
	private Object discovery(SmartHomeSkillService shss, String json) {
		return null;
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
