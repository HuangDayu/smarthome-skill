package cn.huangdayu.smarthome.skill.jsonbean.mobvoi.response;

import java.util.List;

import lombok.Data;

@Data
public class MobvoiResponsePayload {
	private List<MobvoiResponseDiscoveredAppliances> discoveredAppliances;

	private MobvoiResponsePreviousState previousState;

	private MobvoiResponseTargetTemperature targetTemperature;

	private MobvoiResponseTemperatureMode temperatureMode;

}
