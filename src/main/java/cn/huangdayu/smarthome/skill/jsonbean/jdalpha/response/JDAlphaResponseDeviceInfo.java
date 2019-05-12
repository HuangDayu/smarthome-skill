package cn.huangdayu.smarthome.skill.jsonbean.jdalpha.response;

import java.util.List;

import lombok.Data;

@Data
public class JDAlphaResponseDeviceInfo {

	private List<String> actions;
	private List<String> controlSpeech;
	private String deviceId;
	private String deviceTypes;
	private JDAlphaResponseExtensions extensions;
	private String friendlyDescription;
	private String friendlyName;
	private boolean isReachable;
	private String modelName;

}