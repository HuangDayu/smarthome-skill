package org.smarthome.skill.jsonbean.aligenie.response;

import java.util.List;

public class AliGenieResponsePayload {

	private String deviceId;
	private List<AliGenieResponseDevices> devices;
	private String errorCode;
	private String message;
	private List<AliGenieResponseProperties> properties;

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDevices(List<AliGenieResponseDevices> devices) {
		this.devices = devices;
	}

	public List<AliGenieResponseDevices> getDevices() {
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

	public void setProperties(List<AliGenieResponseProperties> properties) {
		this.properties = properties;
	}

	public List<AliGenieResponseProperties> getProperties() {
		return properties;
	}

}