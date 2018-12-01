package org.smarthome.skill.rokid.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RokidResponseCapabilities {

	@JsonProperty("interface")
	private String interface_;

	private boolean proactivelyReported;
	private boolean retrievable;
	private List<String> supportedOperations;
	private String version;

	@JsonProperty("interface")
	public String getInterface_() {
		return interface_;
	}

	@JsonProperty("interface")
	public void setInterface_(String interface_) {
		this.interface_ = interface_;
	}

	public boolean isProactivelyReported() {
		return proactivelyReported;
	}

	public void setProactivelyReported(boolean proactivelyReported) {
		this.proactivelyReported = proactivelyReported;
	}

	public boolean isRetrievable() {
		return retrievable;
	}

	public void setRetrievable(boolean retrievable) {
		this.retrievable = retrievable;
	}

	public List<String> getSupportedOperations() {
		return supportedOperations;
	}

	public void setSupportedOperations(List<String> supportedOperations) {
		this.supportedOperations = supportedOperations;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}