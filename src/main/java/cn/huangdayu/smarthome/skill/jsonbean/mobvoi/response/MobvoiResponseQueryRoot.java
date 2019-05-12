package cn.huangdayu.smarthome.skill.jsonbean.mobvoi.response;

import lombok.Data;

@Data
public class MobvoiResponseQueryRoot {
	private MobvoiResponseHeader header;

	private MobvoiResponseQueryPayload payload;

}
