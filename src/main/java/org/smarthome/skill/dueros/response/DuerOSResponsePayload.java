package org.smarthome.skill.dueros.response;

import java.util.ArrayList;
import java.util.List;

public class DuerOSResponsePayload {
	private List<DuerOSResponseDiscoveredAppliances> discoveredAppliances;

	private List<DuerOSResponseDiscoveredGroups> discoveredGroups;

	public void setDiscoveredAppliances(List<DuerOSResponseDiscoveredAppliances> discoveredAppliances) {
		this.discoveredAppliances = discoveredAppliances;
	}

	public List<DuerOSResponseDiscoveredAppliances> getDiscoveredAppliances() {
		return this.discoveredAppliances;
	}

	public void setDiscoveredGroups(List<DuerOSResponseDiscoveredGroups> discoveredGroups) {
		this.discoveredGroups = discoveredGroups;
	}

	public List<DuerOSResponseDiscoveredGroups> getDiscoveredGroups() {
		return this.discoveredGroups;
	}

	private String faultingParameter;

	public void setFaultingParameter(String faultingParameter) {
		this.faultingParameter = faultingParameter;
	}

	public String getFaultingParameter() {
		return this.faultingParameter;
	}

	private DuerOSResponsePreviousState previousState;

	private DuerOSResponseTemperature temperature;

	private DuerOSResponseMode mode;

	public void setPreviousState(DuerOSResponsePreviousState previousState) {
		this.previousState = previousState;
	}

	public DuerOSResponsePreviousState getPreviousState() {
		return this.previousState;
	}

	public void setTemperature(DuerOSResponseTemperature temperature) {
		this.temperature = temperature;
	}

	public DuerOSResponseTemperature getTemperature() {
		return this.temperature;
	}

	public void setMode(DuerOSResponseMode mode) {
		this.mode = mode;
	}

	public DuerOSResponseMode getMode() {
		return this.mode;
	}

	private String applianceResponseTimestamp;

	public String getApplianceResponseTimestamp() {
		return applianceResponseTimestamp;
	}

	public void setApplianceResponseTimestamp(String applianceResponseTimestamp) {
		this.applianceResponseTimestamp = applianceResponseTimestamp;
	}

	private DuerOSResponseTemperatureMode temperatureMode;

	public DuerOSResponseTemperatureMode getTemperatureMode() {
		return temperatureMode;
	}

	public void setTemperatureMode(DuerOSResponseTemperatureMode temperatureMode) {
		this.temperatureMode = temperatureMode;
	}

	private DuerOSResponseTemperature temperatureReading;

	public DuerOSResponseTemperature getTemperatureReading() {
		return temperatureReading;
	}

	public void setTemperatureReading(DuerOSResponseTemperature temperatureReading) {
		this.temperatureReading = temperatureReading;
	}
}
