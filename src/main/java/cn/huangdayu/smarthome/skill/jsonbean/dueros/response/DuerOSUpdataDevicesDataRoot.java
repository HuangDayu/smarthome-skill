package cn.huangdayu.smarthome.skill.jsonbean.dueros.response;

import java.util.List;

import lombok.Data;

@Data
public class DuerOSUpdataDevicesDataRoot {
	private String botId;

	private String logId;

	private List<String> openUids;

	private int status;

	private String msg;

	private DuerOSUpdataDevicesData data;

}
