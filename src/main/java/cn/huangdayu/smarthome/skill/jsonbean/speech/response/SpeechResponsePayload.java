package cn.huangdayu.smarthome.skill.jsonbean.speech.response;

import java.util.List;

import lombok.Data;

@Data
public class SpeechResponsePayload {

	private String deviceId;
	private List<SpeechResponseDevices> devices;
	private String errorCode;
	private String message;
	private List<SpeechResponseProperties> properties;

}