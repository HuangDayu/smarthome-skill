package org.smarthome.skill.open.response;

import java.util.List;

public class OpenResponsePayload {

	private String deviceId;
	private List<OpenResponseDevices> devices;
	private String errorCode;
	private String errorExplain;
	private String errorMessage;
	private Object value;

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDevices(List<OpenResponseDevices> devices) {
		this.devices = devices;
	}

	public List<OpenResponseDevices> getDevices() {
		return devices;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorExplain(String errorExplain) {
		this.errorExplain = errorExplain;
	}

	public String getErrorExplain() {
		return errorExplain;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}