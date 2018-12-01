package org.smarthome.skill.mobvoi.response;

import java.util.List;

public class MobvoiResponsePayload {
	private List<MobvoiResponseDiscoveredAppliances> discoveredAppliances;

	private MobvoiResponsePreviousState previousState;

	private MobvoiResponseTargetTemperature targetTemperature;

	private MobvoiResponseTemperatureMode temperatureMode;

	public void setDiscoveredAppliances(List<MobvoiResponseDiscoveredAppliances> discoveredAppliances) {
		this.discoveredAppliances = discoveredAppliances;
	}

	public List<MobvoiResponseDiscoveredAppliances> getDiscoveredAppliances() {
		return this.discoveredAppliances;
	}

	public void setPreviousState(MobvoiResponsePreviousState previousState) {
		this.previousState = previousState;
	}

	public MobvoiResponsePreviousState getPreviousState() {
		return this.previousState;
	}

	public void setTargetTemperature(MobvoiResponseTargetTemperature targetTemperature) {
		this.targetTemperature = targetTemperature;
	}

	public MobvoiResponseTargetTemperature getTargetTemperature() {
		return this.targetTemperature;
	}

	public void setTemperatureMode(MobvoiResponseTemperatureMode temperatureMode) {
		this.temperatureMode = temperatureMode;
	}

	public MobvoiResponseTemperatureMode getTemperatureMode() {
		return this.temperatureMode;
	}
}
