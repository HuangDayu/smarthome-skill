package org.smarthome.skill.dueros.response;

public class DuerOSResponseTemperature {
	private int value;

	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	private String scale;

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

}
