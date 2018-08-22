package com.skill.rokid.request;
public class Header {

    private Authorization authorization;
    private String messageId;
    private String name;
    private String namespace;
    private String payloadVersion;
    public void setAuthorization(Authorization authorization) {
         this.authorization = authorization;
     }
     public Authorization getAuthorization() {
         return authorization;
     }

    public void setMessageId(String messageId) {
         this.messageId = messageId;
     }
     public String getMessageId() {
         return messageId;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setNamespace(String namespace) {
         this.namespace = namespace;
     }
     public String getNamespace() {
         return namespace;
     }

    public void setPayloadVersion(String payloadVersion) {
         this.payloadVersion = payloadVersion;
     }
     public String getPayloadVersion() {
         return payloadVersion;
     }

}