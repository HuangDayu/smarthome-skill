package cn.huangdayu.smarthome.skill.jsonbean.orion.response;

import java.util.List;

import lombok.Data;

@Data
public class OrionResponseDevices {

	private List<String> actions;
	private String brand;
	private String deviceId;
	private String deviceName;
	private String deviceType;
	private OrionResponseExtensions extensions;
	private String icon;
	private String model;
	private List<OrionResponseProperties> properties;
	private String zone;
	private int online;

}