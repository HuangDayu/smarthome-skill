package com.skill.open.response;

import java.util.List;

public class OpenResponseDevices {

	private List<String> actions;
	private String deviceId;
	private String deviceName;
	private String deviceType;
	private boolean isReachable;
	private String modelName;
	private String placeName;

	public void setActions(List<String> actions) {
		this.actions = actions;
	}

	public List<String> getActions() {
		return actions;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setIsReachable(boolean isReachable) {
		this.isReachable = isReachable;
	}

	public boolean getIsReachable() {
		return isReachable;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getPlaceName() {
		return placeName;
	}

}