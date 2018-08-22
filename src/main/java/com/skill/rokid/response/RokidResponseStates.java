package com.skill.rokid.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RokidResponseStates {

	@JsonProperty("interface")
    private String interface_;
    private String timeOfSample;
    private Object value;

	@JsonProperty("interface")
	public String getInterface_() {
		return interface_;
	}
	
	//@JSONField(name = "interface")
	@JsonProperty("interface")
	public void setInterface_(String interface_) {
		this.interface_ = interface_;
	}
	
	public String getTimeOfSample() {
		return timeOfSample;
	}
	public void setTimeOfSample(String timeOfSample) {
		this.timeOfSample = timeOfSample;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
    
}