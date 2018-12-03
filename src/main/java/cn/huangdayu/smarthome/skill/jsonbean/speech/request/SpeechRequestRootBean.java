package cn.huangdayu.smarthome.skill.jsonbean.speech.request;

public class SpeechRequestRootBean {

	private Header header;
	private Payload payload;

	public void setHeader(Header header) {
		this.header = header;
	}

	public Header getHeader() {
		return header;
	}

	public void setPayload(Payload payload) {
		this.payload = payload;
	}

	public Payload getPayload() {
		return payload;
	}

}