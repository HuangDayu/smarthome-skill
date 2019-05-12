package cn.huangdayu.smarthome.skill.jsonbean.aligenie.response;

import java.util.List;

import lombok.Data;

@Data
public class AliGenieResponseDevices {

	private List<String> actions;
	private String brand;
	private String deviceId;
	private String deviceName;
	private String deviceType;
	private AliGenieResponseExtensions extensions;
	private String icon;
	private String model;
	private List<AliGenieResponseProperties> properties;
	private String zone;

}