package cn.huangdayu.smarthome.skill.jsonbean.dueros.response;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class DuerOSResponsePayload {
	private List<DuerOSResponseDiscoveredAppliances> discoveredAppliances;

	private List<DuerOSResponseDiscoveredGroups> discoveredGroups;

	private String faultingParameter;

	private DuerOSResponsePreviousState previousState;

	private DuerOSResponseTemperature temperature;

	private DuerOSResponseMode mode;

	private String applianceResponseTimestamp;

	private DuerOSResponseTemperatureMode temperatureMode;

	private DuerOSResponseTemperature temperatureReading;

}
