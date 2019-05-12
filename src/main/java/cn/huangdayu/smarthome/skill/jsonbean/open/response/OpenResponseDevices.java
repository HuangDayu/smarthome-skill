package cn.huangdayu.smarthome.skill.jsonbean.open.response;

import java.util.List;

import lombok.Data;

@Data
public class OpenResponseDevices {

	private List<String> actions;
	private String deviceId;
	private String deviceName;
	private String deviceType;
	private boolean isReachable;
	private String modelName;
	private String placeName;

}