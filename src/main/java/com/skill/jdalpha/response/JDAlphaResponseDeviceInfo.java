package com.skill.jdalpha.response;

import java.util.List;

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

	public void setActions(List<String> actions) {
		this.actions = actions;
	}

	public List<String> getActions() {
		return actions;
	}

	public void setControlSpeech(List<String> controlSpeech) {
		this.controlSpeech = controlSpeech;
	}

	public List<String> getControlSpeech() {
		return controlSpeech;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceTypes(String deviceTypes) {
		this.deviceTypes = deviceTypes;
	}

	public String getDeviceTypes() {
		return deviceTypes;
	}

	public void setExtensions(JDAlphaResponseExtensions extensions) {
		this.extensions = extensions;
	}

	public JDAlphaResponseExtensions getExtensions() {
		return extensions;
	}

	public void setFriendlyDescription(String friendlyDescription) {
		this.friendlyDescription = friendlyDescription;
	}

	public String getFriendlyDescription() {
		return friendlyDescription;
	}

	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}

	public String getFriendlyName() {
		return friendlyName;
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

}