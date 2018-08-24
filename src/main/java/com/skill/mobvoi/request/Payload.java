package com.skill.mobvoi.request;

public class Payload {
	private String accessToken;

	private Appliance appliance;

	private DeltaTemperature deltaTemperature;

	private TargetTemperature targetTemperature;

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAppliance(Appliance appliance) {
		this.appliance = appliance;
	}

	public Appliance getAppliance() {
		return this.appliance;
	}

	public void setDeltaTemperature(DeltaTemperature deltaTemperature) {
		this.deltaTemperature = deltaTemperature;
	}

	public DeltaTemperature getDeltaTemperature() {
		return this.deltaTemperature;
	}

	public void setTargetTemperature(TargetTemperature targetTemperature) {
		this.targetTemperature = targetTemperature;
	}

	public TargetTemperature getTargetTemperature() {
		return this.targetTemperature;
	}

	private TargetMode targetMode;

	public TargetMode getTargetMode() {
		return targetMode;
	}

	public void setTargetMode(TargetMode targetMode) {
		this.targetMode = targetMode;
	}

}
