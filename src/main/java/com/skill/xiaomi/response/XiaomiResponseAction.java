package com.skill.xiaomi.response;

import java.util.List;

public class XiaomiResponseAction {
	private int aiid;
	private String description;
	private String did;
	private List<Object> out;
	private int siid;
	private int status;

	public int getAiid() {
		return aiid;
	}

	public void setAiid(int aiid) {
		this.aiid = aiid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDid() {
		return did;
	}

	public void setDid(String did) {
		this.did = did;
	}

	public List<Object> getOut() {
		return out;
	}

	public void setOut(List<Object> out) {
		this.out = out;
	}

	public int getSiid() {
		return siid;
	}

	public void setSiid(int siid) {
		this.siid = siid;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}