package com.skill.mobvoi.response;

public class MobvoiResponseRoot {
	private MobvoiResponseHeader header;

    private MobvoiResponsePayload payload;

    public void setHeader(MobvoiResponseHeader header){
        this.header = header;
    }
    public MobvoiResponseHeader getHeader(){
        return this.header;
    }
    public void setPayload(MobvoiResponsePayload payload){
        this.payload = payload;
    }
    public MobvoiResponsePayload getPayload(){
        return this.payload;
    }
}
