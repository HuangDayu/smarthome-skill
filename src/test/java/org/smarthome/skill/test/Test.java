package org.smarthome.skill.test;

import org.smarthome.skill.enums.SkillPlatformEnum;
import org.smarthome.skill.service.SmartHomeSkill;
import org.smarthome.skill.service.SmartHomeSkillService;

import com.alibaba.fastjson.JSON;

public class Test {
	static SmartHomeSkillService shss = new SmartHomeSkillServiceImpl();
	static String duerOSDiscovery = "{\r\n" + 
			"    \"header\": {\r\n" + 
			"        \"namespace\": \"DuerOS.ConnectedHome.Discovery\",\r\n" + 
			"        \"name\": \"DiscoverAppliancesRequest\",\r\n" + 
			"        \"messageId\": \"6d6d6e14-8aee-473e-8c24-0d31ff9c17a2\",\r\n" + 
			"        \"payloadVersion\": \"1\"\r\n" + 
			"    },\r\n" + 
			"    \"payload\": {\r\n" + 
			"        \"accessToken\": \"11111111111111111111111111111\",\r\n" + 
			"        \"openUid\": \"27a7d83c2d3cfbad5d387cd35f3ca17b\"\r\n" + 
			"    }\r\n" + 
			"}";
	public static void main(String[] args) {
		System.out.println(JSON.toJSONString(SmartHomeSkill.skillOperation(shss,SkillPlatformEnum.BAIDU_DUEROS,duerOSDiscovery)));
		SmartHomeSkill.skillOperation(shss,SkillPlatformEnum.TMALL_ALIGENIE,"");
	}
}
