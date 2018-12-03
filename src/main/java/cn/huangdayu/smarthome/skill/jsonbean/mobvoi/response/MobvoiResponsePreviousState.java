package cn.huangdayu.smarthome.skill.jsonbean.mobvoi.response;

public class MobvoiResponsePreviousState {
	private MobvoiResponseMode mode;

	private MobvoiResponseTargetTemperature targetTemperature;

	public void setMode(MobvoiResponseMode mode) {
		this.mode = mode;
	}

	public MobvoiResponseMode getMode() {
		return this.mode;
	}

	public void setTargetTemperature(MobvoiResponseTargetTemperature targetTemperature) {
		this.targetTemperature = targetTemperature;
	}

	public MobvoiResponseTargetTemperature getTargetTemperature() {
		return this.targetTemperature;
	}
}
