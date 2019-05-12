package cn.huangdayu.smarthome.skill.jsonbean.mobvoi.response;

import lombok.Data;

@Data
public class MobvoiResponseQueryPayload {
	private String powerState;
	private String applianceResponseTimestamp;
	private int targetTemperature;

}
