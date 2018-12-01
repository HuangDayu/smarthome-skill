package org.smarthome.skill.dueros.request;

public class Color {
	private int hue;

	private int saturation;

	private int brightness;

	public void setHue(int hue) {
		this.hue = hue;
	}

	public int getHue() {
		return this.hue;
	}

	public void setSaturation(int saturation) {
		this.saturation = saturation;
	}

	public int getSaturation() {
		return this.saturation;
	}

	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}

	public int getBrightness() {
		return this.brightness;
	}
}
