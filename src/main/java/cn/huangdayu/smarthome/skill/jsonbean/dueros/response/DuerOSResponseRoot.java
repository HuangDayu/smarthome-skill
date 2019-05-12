package cn.huangdayu.smarthome.skill.jsonbean.dueros.response;

import lombok.Data;

@Data
public class DuerOSResponseRoot {
	private DuerOSResponseHeader header;

	private DuerOSResponsePayload payload;

}
