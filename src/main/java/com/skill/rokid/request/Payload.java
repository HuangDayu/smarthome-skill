package com.skill.rokid.request;

public class Payload {

	private Object delta;
	private Object value;
	private TVChannel tvChannel;

	public Object getDelta() {
		return delta;
	}

	public void setDelta(Object delta) {
		this.delta = delta;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public TVChannel getTvChannel() {
		return tvChannel;
	}

	public void setTvChannel(TVChannel tvChannel) {
		this.tvChannel = tvChannel;
	}

}