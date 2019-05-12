package cn.huangdayu.smarthome.skill.jsonbean.orion.response;

import lombok.Data;

@Data
public class OrionResponseHeader {

	private String messageId;
	private String name;
	private String namespace;
	private int payLoadVersion;

}