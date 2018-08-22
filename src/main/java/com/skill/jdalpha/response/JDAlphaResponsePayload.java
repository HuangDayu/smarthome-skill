package com.skill.jdalpha.response;
import java.util.List;
public class JDAlphaResponsePayload {

    private List<JDAlphaResponseDeviceInfo> DeviceInfo;
    private String deviceId;
    private String errorCode;
    private String message;
    private JDAlphaResponseProperties properties;
    private String result;
    public void setDeviceInfo(List<JDAlphaResponseDeviceInfo> DeviceInfo) {
         this.DeviceInfo = DeviceInfo;
     }
     public List<JDAlphaResponseDeviceInfo> getDeviceInfo() {
         return DeviceInfo;
     }

    public void setDeviceId(String deviceId) {
         this.deviceId = deviceId;
     }
     public String getDeviceId() {
         return deviceId;
     }

    public void setErrorCode(String errorCode) {
         this.errorCode = errorCode;
     }
     public String getErrorCode() {
         return errorCode;
     }

    public void setMessage(String message) {
         this.message = message;
     }
     public String getMessage() {
         return message;
     }

    public void setProperties(JDAlphaResponseProperties properties) {
         this.properties = properties;
     }
     public JDAlphaResponseProperties getProperties() {
         return properties;
     }

    public void setResult(String result) {
         this.result = result;
     }
     public String getResult() {
         return result;
     }

}