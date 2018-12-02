package org.smarthome.skill.jsonbean.speech.response;

import java.util.List;

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

	public void setActions(List<String> actions) {
		this.actions = actions;
	}

	public List<String> getActions() {
		return actions;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
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

	public void setExtensions(SpeechResponseExtensions extensions) {
		this.extensions = extensions;
	}

	public SpeechResponseExtensions getExtensions() {
		return extensions;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getIcon() {
		return icon;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setProperties(List<SpeechResponseProperties> properties) {
		this.properties = properties;
	}

	public List<SpeechResponseProperties> getProperties() {
		return properties;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getZone() {
		return zone;
	}

}