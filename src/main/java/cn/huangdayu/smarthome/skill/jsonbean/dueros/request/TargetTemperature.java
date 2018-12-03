package cn.huangdayu.smarthome.skill.jsonbean.dueros.request;

public class TargetTemperature {
	private Object value;

	private String scale;

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}
}
