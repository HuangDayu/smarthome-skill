package com.skill.rokid.request;
public class RokidRequestRootBean {

    private Endpoint endpoint;
    private Header header;
    private Payload payload;
    public void setEndpoint(Endpoint endpoint) {
         this.endpoint = endpoint;
     }
     public Endpoint getEndpoint() {
         return endpoint;
     }

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