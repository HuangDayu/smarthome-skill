package cn.huangdayu.smarthome.skill.jsonbean.xiaomi.request;

public class XiaomiRequestProperty {
	private String did;
	private int piid;
	private int siid;
	private Object value;

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

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}
