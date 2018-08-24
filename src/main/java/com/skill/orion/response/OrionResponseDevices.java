package com.skill.orion.response;

import java.util.List;

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

	public int getOnline() {
		return online;
	}

	public void setOnline(int online) {
		this.online = online;
	}

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

	public void setExtensions(OrionResponseExtensions extensions) {
		this.extensions = extensions;
	}

	public OrionResponseExtensions getExtensions() {
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

	public void setProperties(List<OrionResponseProperties> properties) {
		this.properties = properties;
	}

	public List<OrionResponseProperties> getProperties() {
		return properties;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getZone() {
		return zone;
	}

}