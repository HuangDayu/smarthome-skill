package cn.huangdayu.smarthome.skill.jsonbean.rokid.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class RokidResponseCapabilities {
	private boolean proactivelyReported;
	private boolean retrievable;
	private List<String> supportedOperations;
	private String version;

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