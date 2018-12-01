package org.smarthome.skill.mobvoi.response;

public class MobvoiResponseQueryPayload {
	private String powerState;
	private String applianceResponseTimestamp;
	private int targetTemperature;

	public String getPowerState() {
		return powerState;
	}

	public void setPowerState(String powerState) {
		this.powerState = powerState;
	}

	public String getApplianceResponseTimestamp() {
		return applianceResponseTimestamp;
	}

	public void setApplianceResponseTimestamp(String applianceResponseTimestamp) {
		this.applianceResponseTimestamp = applianceResponseTimestamp;
	}

	public int getTargetTemperature() {
		return targetTemperature;
	}

	public void setTargetTemperature(int targetTemperature) {
		this.targetTemperature = targetTemperature;
	}

}
