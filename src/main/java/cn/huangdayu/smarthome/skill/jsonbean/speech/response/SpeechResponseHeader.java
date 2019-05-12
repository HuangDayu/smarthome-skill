package cn.huangdayu.smarthome.skill.jsonbean.speech.response;

import lombok.Data;

@Data
public class SpeechResponseHeader {

	private String messageId;
	private String name;
	private String namespace;
	private int payLoadVersion;

}