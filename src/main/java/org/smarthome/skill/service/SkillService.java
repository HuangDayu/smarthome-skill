package org.smarthome.skill.service;

import java.util.List;
import java.util.Map;
import org.smarthome.skill.entity.DeviceEntity;
import org.smarthome.skill.enums.SkillPlatformEnum;

public interface SkillService {
	Object skillOperation(SmartHomeSkillService smartHomeSkillService, String json);
}
