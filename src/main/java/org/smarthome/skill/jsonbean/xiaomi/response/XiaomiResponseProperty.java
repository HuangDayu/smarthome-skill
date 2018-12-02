package org.smarthome.skill.jsonbean.xiaomi.response;

public class XiaomiResponseProperty {
	private String description;
	private String did;
	private int piid;
	private int siid;
	private int status;
	private Object value;

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

	public int getPiid() {
		return piid;
	}

	public void setPiid(int piid) {
		this.piid = piid;
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

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
}