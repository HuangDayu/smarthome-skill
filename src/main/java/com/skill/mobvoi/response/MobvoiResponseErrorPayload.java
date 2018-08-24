package com.skill.mobvoi.response;

public class MobvoiResponseErrorPayload {

	private int errCode;

	private String errMsg;

	public void setErrCode(int errCode) {
		this.errCode = errCode;
	}

	public int getErrCode() {
		return this.errCode;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getErrMsg() {
		return this.errMsg;
	}
}
