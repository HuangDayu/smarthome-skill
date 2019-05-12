package cn.huangdayu.smarthome.skill.jsonbean.jdalpha.response;

import lombok.Data;

@Data
public class JDAlphaResponseHeader {

	private String messageId;
	private String name;
	private String namespace;
	private String payLoadVersion;

}