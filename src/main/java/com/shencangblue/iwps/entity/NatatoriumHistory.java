package com.shencangblue.iwps.entity;

public class NatatoriumHistory {
    private long natatoriumDataId;
    private long natatoriumId;
    private String sensorId;
    private String time;
    private String waterTemperature;
    private String airHumidity;

    public String getAirHumidity() {
        return airHumidity;
    }

    public void setAirHumidity(String airHumidity) {
        this.airHumidity = airHumidity;
    }

    private String numberOfPools;

    public long getNatatoriumDataId() {
        return natatoriumDataId;
    }

    public void setNatatoriumDataId(long natatoriumDataId) {
        this.natatoriumDataId = natatoriumDataId;
    }

    public long getNatatoriumId() {
        return natatoriumId;
    }

    public void setNatatoriumId(long natatoriumId) {
        this.natatoriumId = natatoriumId;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWaterTemperature() {
        return waterTemperature;
    }

    public void setWaterTemperature(String waterTemperature) {
        this.waterTemperature = waterTemperature;
    }

    public String getNumberOfPools() {
        return numberOfPools;
    }

    public void setNumberOfPools(String numberOfPools) {
        this.numberOfPools = numberOfPools;
    }

}
