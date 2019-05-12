package cn.huangdayu.smarthome.skill.jsonbean.jdalpha.request;

import lombok.Data;

@Data
public class Header {

	private String messageId;
	private String name;
	private String namespace;
	private String payLoadVersion;

}