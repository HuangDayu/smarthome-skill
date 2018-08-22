package com.skill.jdalpha.request;

public class Payload {

	private String accessToken;
	private String deviceId;
	private Extensions extensions;
	private Properties properties;

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setExtensions(Extensions extensions) {
		this.extensions = extensions;
	}

	public Extensions getExtensions() {
		return extensions;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Properties getProperties() {
		return properties;
	}

}