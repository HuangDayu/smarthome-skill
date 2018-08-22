package com.skill.dueros.request;

public class BaiduRequestPayload {
	private Timestamp timestamp;

    private String accessToken;

    private Appliance appliance;

    private Brightness brightness;

    private DeltaPercentage deltaPercentage;

    private Color color;

    private DeltaValue deltaValue;

    private TargetTemperature targetTemperature;

    private FanSpeed fanSpeed;

    private Mode mode;

    private String lockState;

    public void setTimestamp(Timestamp timestamp){
        this.timestamp = timestamp;
    }
    public Timestamp getTimestamp(){
        return this.timestamp;
    }
    public void setAccessToken(String accessToken){
        this.accessToken = accessToken;
    }
    public String getAccessToken(){
        return this.accessToken;
    }
    public void setAppliance(Appliance appliance){
        this.appliance = appliance;
    }
    public Appliance getAppliance(){
        return this.appliance;
    }
    public void setBrightness(Brightness brightness){
        this.brightness = brightness;
    }
    public Brightness getBrightness(){
        return this.brightness;
    }
    public void setDeltaPercentage(DeltaPercentage deltaPercentage){
        this.deltaPercentage = deltaPercentage;
    }
    public DeltaPercentage getDeltaPercentage(){
        return this.deltaPercentage;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public Color getColor(){
        return this.color;
    }
    public void setDeltaValue(DeltaValue deltaValue){
        this.deltaValue = deltaValue;
    }
    public DeltaValue getDeltaValue(){
        return this.deltaValue;
    }
    public void setTargetTemperature(TargetTemperature targetTemperature){
        this.targetTemperature = targetTemperature;
    }
    public TargetTemperature getTargetTemperature(){
        return this.targetTemperature;
    }
    public void setFanSpeed(FanSpeed fanSpeed){
        this.fanSpeed = fanSpeed;
    }
    public FanSpeed getFanSpeed(){
        return this.fanSpeed;
    }
    public void setMode(Mode mode){
        this.mode = mode;
    }
    public Mode getMode(){
        return this.mode;
    }
    public void setLockState(String lockState){
        this.lockState = lockState;
    }
    public String getLockState(){
        return this.lockState;
    }
    
    private String openUid;

	public String getOpenUid() {
		return openUid;
	}
	public void setOpenUid(String openUid) {
		this.openUid = openUid;
	}
	
}
