package cn.huangdayu.smarthome.skill.jsonbean.mobvoi.response;

public class MobvoiResponseErrorRoot {
	private MobvoiResponseHeader header;

	private MobvoiResponseErrorPayload payload;

	public void setHeader(MobvoiResponseHeader header) {
		this.header = header;
	}

	public MobvoiResponseHeader getHeader() {
		return this.header;
	}

	public MobvoiResponseErrorPayload getPayload() {
		return payload;
	}

	public void setPayload(MobvoiResponseErrorPayload payload) {
		this.payload = payload;
	}

}
