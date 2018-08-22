package com.skill.jdalpha.response;
public class JDAlphaResponseRootBean {

    private JDAlphaResponseHeader header;
    private JDAlphaResponsePayload payload;
    public void setHeader(JDAlphaResponseHeader header) {
         this.header = header;
     }
     public JDAlphaResponseHeader getHeader() {
         return header;
     }

    public void setPayload(JDAlphaResponsePayload payload) {
         this.payload = payload;
     }
     public JDAlphaResponsePayload getPayload() {
         return payload;
     }

}