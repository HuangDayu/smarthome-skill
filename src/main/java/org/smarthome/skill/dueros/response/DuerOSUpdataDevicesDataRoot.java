package org.smarthome.skill.dueros.response;

import java.util.List;

public class DuerOSUpdataDevicesDataRoot {
	private String botId;

	private String logId;

	private List<String> openUids;

	private int status;

	private String msg;

	private DuerOSUpdataDevicesData data;

	public void setBotId(String botId) {
		this.botId = botId;
	}

	public String getBotId() {
		return this.botId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getLogId() {
		return this.logId;
	}

	public void setOpenUids(List<String> openUids) {
		this.openUids = openUids;
	}

	public List<String> getOpenUids() {
		return this.openUids;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getStatus() {
		return this.status;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setData(DuerOSUpdataDevicesData data) {
		this.data = data;
	}

	public DuerOSUpdataDevicesData getData() {
		return this.data;
	}
}
