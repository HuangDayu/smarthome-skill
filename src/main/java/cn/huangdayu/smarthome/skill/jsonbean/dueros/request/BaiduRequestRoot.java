package cn.huangdayu.smarthome.skill.jsonbean.dueros.request;

import lombok.Data;

@Data
public class BaiduRequestRoot {
	private BaiduRequestHeader header;

	private BaiduRequestPayload payload;

}
