package cn.huangdayu.smarthome.skill.jsonbean.rokid.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class States {

	private String timeOfSample;
	private Object value;

	@JsonProperty("interface")
	private String interface_;

	@JsonProperty("interface")
	public String getInterface_() {
		return interface_;
	}

	@JsonProperty("interface")
	public void setInterface_(String interface_) {
		this.interface_ = interface_;
	}

}