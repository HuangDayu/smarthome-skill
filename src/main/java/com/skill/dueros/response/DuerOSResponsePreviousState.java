package com.skill.dueros.response;

public class DuerOSResponsePreviousState {
    private DuerOSResponseMode mode;

    private DuerOSResponseTemperature temperature;

    public void setMode(DuerOSResponseMode mode){
        this.mode = mode;
    }
    public DuerOSResponseMode getMode(){
        return this.mode;
    }
    public void setTemperature(DuerOSResponseTemperature temperature){
        this.temperature = temperature;
    }
    public DuerOSResponseTemperature getTemperature(){
        return this.temperature;
    }
}
