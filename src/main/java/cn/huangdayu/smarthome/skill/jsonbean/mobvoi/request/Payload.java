package cn.huangdayu.smarthome.skill.jsonbean.mobvoi.request;

import lombok.Data;

@Data
public class Payload {
	private String accessToken;

	private Appliance appliance;

	private DeltaTemperature deltaTemperature;

	private TargetTemperature targetTemperature;

	private TargetMode targetMode;

}
