package com.skill.rokid.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class States {

	@JsonProperty("interface")
    private String interface_;
	
    private String timeOfSample;
    private Object value;
    
	@JsonProperty("interface")
	public String getInterface_() {
		return interface_;
	}
	
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