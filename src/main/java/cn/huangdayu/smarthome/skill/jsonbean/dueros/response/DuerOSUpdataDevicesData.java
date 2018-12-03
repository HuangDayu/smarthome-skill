package cn.huangdayu.smarthome.skill.jsonbean.dueros.response;

import java.util.ArrayList;
import java.util.List;

public class DuerOSUpdataDevicesData {
	private List<String> failed;

	private List<String> succeed;

	public List<String> getFailed() {
		return failed;
	}

	public void setFailed(List<String> failed) {
		this.failed = failed;
	}

	public List<String> getSucceed() {
		return succeed;
	}

	public void setSucceed(List<String> succeed) {
		this.succeed = succeed;
	}

}
