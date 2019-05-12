package cn.huangdayu.smarthome.skill.jsonbean.aligenie.response;

import lombok.Data;

@Data
public class AliGenieResponseHeader {

	private String messageId;
	private String name;
	private String namespace;
	private int payLoadVersion;

}