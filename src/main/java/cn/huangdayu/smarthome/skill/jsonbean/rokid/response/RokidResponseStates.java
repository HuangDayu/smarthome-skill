package cn.huangdayu.smarthome.skill.jsonbean.rokid.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class RokidResponseStates {
	private String timeOfSample;
	private Object value;

	@JsonProperty("interface")
	private String interface_;

	@JsonProperty("interface")
	public String getInterface_() {
		return interface_;
	}

	// @JSONField(name = "interface")
	@JsonProperty("interface")
	public void setInterface_(String interface_) {
		this.interface_ = interface_;
	}

}