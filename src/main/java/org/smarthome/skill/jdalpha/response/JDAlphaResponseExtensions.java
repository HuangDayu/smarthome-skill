package org.smarthome.skill.jdalpha.response;

public class JDAlphaResponseExtensions {

	private String hardwareName;
	private String hardwareID;
	private String firmwareVersion;
	private String hardwareStatus;

	public void setHardwareName(String hardwareName) {
		this.hardwareName = hardwareName;
	}

	public String getHardwareName() {
		return hardwareName;
	}

	public void setHardwareID(String hardwareID) {
		this.hardwareID = hardwareID;
	}

	public String getHardwareID() {
		return hardwareID;
	}

	public void setFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
	}

	public String getFirmwareVersion() {
		return firmwareVersion;
	}

	public void setHardwareStatus(String hardwareStatus) {
		this.hardwareStatus = hardwareStatus;
	}

	public String getHardwareStatus() {
		return hardwareStatus;
	}

}