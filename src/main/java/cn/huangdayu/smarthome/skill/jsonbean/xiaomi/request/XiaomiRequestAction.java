package cn.huangdayu.smarthome.skill.jsonbean.xiaomi.request;

import java.util.List;

public class XiaomiRequestAction {
	private int aiid;
	private String did;
	private List<Object> in;
	private int siid;

	public int getAiid() {
		return aiid;
	}

	public void setAiid(int aiid) {
		this.aiid = aiid;
	}

	public String getDid() {
		return did;
	}

	public void setDid(String did) {
		this.did = did;
	}

	public List<Object> getIn() {
		return in;
	}

	public void setIn(List<Object> in) {
		this.in = in;
	}

	public int getSiid() {
		return siid;
	}

	public void setSiid(int siid) {
		this.siid = siid;
	}

}