package cn.huangdayu.smarthome.skill.jsonbean.dueros.request;

public class BaiduRequestRoot {
	private BaiduRequestHeader header;

	private BaiduRequestPayload payload;

	public void setHeader(BaiduRequestHeader header) {
		this.header = header;
	}

	public BaiduRequestHeader getHeader() {
		return this.header;
	}

	public void setPayload(BaiduRequestPayload payload) {
		this.payload = payload;
	}

	public BaiduRequestPayload getPayload() {
		return this.payload;
	}
}
