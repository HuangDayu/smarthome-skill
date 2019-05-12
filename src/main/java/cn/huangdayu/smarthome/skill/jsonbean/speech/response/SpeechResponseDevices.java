package cn.huangdayu.smarthome.skill.jsonbean.speech.response;

import java.util.List;

import lombok.Data;

@Data
public class SpeechResponseDevices {

	private List<String> actions;
	private String brand;
	private String deviceId;
	private String deviceName;
	private String deviceType;
	private SpeechResponseExtensions extensions;
	private String icon;
	private String model;
	private List<SpeechResponseProperties> properties;
	private String zone;

}