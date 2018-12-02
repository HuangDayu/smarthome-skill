package org.smarthome.skill.jsonbean.speech.response;

import java.util.List;

public class SpeechResponsePayload {

	private String deviceId;
	private List<SpeechResponseDevices> devices;
	private String errorCode;
	private String message;
	private List<SpeechResponseProperties> properties;

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDevices(List<SpeechResponseDevices> devices) {
		this.devices = devices;
	}

	public List<SpeechResponseDevices> getDevices() {
		return devices;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setProperties(List<SpeechResponseProperties> properties) {
		this.properties = properties;
	}

	public List<SpeechResponseProperties> getProperties() {
		return properties;
	}

}