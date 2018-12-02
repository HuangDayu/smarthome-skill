package org.smarthome.skill.test;

import org.smarthome.skill.enums.SkillPlatformEnum;
import org.smarthome.skill.service.SmartHomeSkill;
import org.smarthome.skill.service.SmartHomeSkillService;

public class Test {
	static SmartHomeSkillService shss = new SmartHomeSkillServiceImpl();
	public static void main(String[] args) {
		SmartHomeSkill.skillOperation(shss,SkillPlatformEnum.BAIDU_DUEROS,"");
		SmartHomeSkill.skillOperation(shss,SkillPlatformEnum.TMALL_ALIGENIE,"");
	}
}
