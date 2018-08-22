package com.skill.mobvoi.response;

import java.util.List;

public class MobvoiResponseDiscoveredAppliances {
	private List<String> actions;

    private MobvoiResponseAdditionalApplianceDetails additionalApplianceDetails;

    private String applianceId;

    private List<String> applianceTypes;

    private String friendlyDescription;

    private String friendlyName;

    private String manufacturerName;

    private String modelName;

    private String tag;

    private String version;

    public void setActions(List<String> actions){
        this.actions = actions;
    }
    public List<String> getActions(){
        return this.actions;
    }
    public void setAdditionalApplianceDetails(MobvoiResponseAdditionalApplianceDetails additionalApplianceDetails){
        this.additionalApplianceDetails = additionalApplianceDetails;
    }
    public MobvoiResponseAdditionalApplianceDetails getAdditionalApplianceDetails(){
        return this.additionalApplianceDetails;
    }
    public void setApplianceId(String applianceId){
        this.applianceId = applianceId;
    }
    public String getApplianceId(){
        return this.applianceId;
    }
    public void setApplianceTypes(List<String> applianceTypes){
        this.applianceTypes = applianceTypes;
    }
    public List<String> getApplianceTypes(){
        return this.applianceTypes;
    }
    public void setFriendlyDescription(String friendlyDescription){
        this.friendlyDescription = friendlyDescription;
    }
    public String getFriendlyDescription(){
        return this.friendlyDescription;
    }
    public void setFriendlyName(String friendlyName){
        this.friendlyName = friendlyName;
    }
    public String getFriendlyName(){
        return this.friendlyName;
    }
    public void setManufacturerName(String manufacturerName){
        this.manufacturerName = manufacturerName;
    }
    public String getManufacturerName(){
        return this.manufacturerName;
    }
    public void setModelName(String modelName){
        this.modelName = modelName;
    }
    public String getModelName(){
        return this.modelName;
    }
    public void setTag(String tag){
        this.tag = tag;
    }
    public String getTag(){
        return this.tag;
    }
    public void setVersion(String version){
        this.version = version;
    }
    public String getVersion(){
        return this.version;
    }
}
