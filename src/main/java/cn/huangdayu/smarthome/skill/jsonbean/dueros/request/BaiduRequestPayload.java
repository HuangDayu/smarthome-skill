package cn.huangdayu.smarthome.skill.jsonbean.dueros.request;

import lombok.Data;

@Data
public class BaiduRequestPayload {
	private Timestamp timestamp;

	private String accessToken;

	private Appliance appliance;

	private Brightness brightness;

	private DeltaPercentage deltaPercentage;

	private Color color;

	private DeltaValue deltaValue;

	private TargetTemperature targetTemperature;

	private FanSpeed fanSpeed;

	private Mode mode;

	private String lockState;

	private String openUid;

}
