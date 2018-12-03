package cn.huangdayu.smarthome.skill.service;

import java.util.List;
import java.util.Map;

import cn.huangdayu.smarthome.skill.entity.DeviceEntity;
import cn.huangdayu.smarthome.skill.enums.SkillPlatformEnum;

public interface SkillService {
	Object skillOperation(SmartHomeSkillService smartHomeSkillService, String json);
}
