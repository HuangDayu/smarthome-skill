package cn.huangdayu.smarthome.skill.jsonbean.open.response;

import lombok.Data;

@Data
public class OpenResponseRootBean {

	private OpenResponseHeader header;
	private OpenResponsePayload payload;

}