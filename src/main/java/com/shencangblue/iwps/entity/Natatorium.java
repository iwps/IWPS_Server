package com.shencangblue.iwps.entity;

/**
 * 指定的游泳池
 */
public class Natatorium {
    private  long natatoriumId;
    private  String name;
    private  float waterLevel;
    private String swimmingPoolAffiliated;
    private String NumberOfPools;
    private String waterTemperature;
    private String detail;

    public long getNatatoriumId() {
        return natatoriumId;
    }

    public void setNatatoriumId(long natatoriumId) {
        this.natatoriumId = natatoriumId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(float waterLevel) {
        this.waterLevel = waterLevel;
    }

    public String getSwimmingPoolAffiliated() {
        return swimmingPoolAffiliated;
    }

    public void setSwimmingPoolAffiliated(String swimmingPoolAffiliated) {
        this.swimmingPoolAffiliated = swimmingPoolAffiliated;
    }

    public String getNumberOfPools() {
        return NumberOfPools;
    }

    public void setNumberOfPools(String numberOfPools) {
        NumberOfPools = numberOfPools;
    }

    public String getWaterTemperature() {
        return waterTemperature;
    }

    public void setWaterTemperature(String waterTemperature) {
        this.waterTemperature = waterTemperature;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
