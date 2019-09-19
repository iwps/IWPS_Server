package com.shencangblue.iwps.entity;

public class UserHistory {
    private long userDataId;
    private long userId;
    private String sensorId;
    private String waterPressure;
    private String RFIDInfo;
    private String time;
    private String natatoriumSensorId;

    public String getRFIDInfo() {
        return RFIDInfo;
    }

    public void setRFIDInfo(String RFIDInfo) {
        this.RFIDInfo = RFIDInfo;
    }



    public long getUserDataId() {
        return userDataId;
    }

    public void setUserDataId(long userDataId) {
        this.userDataId = userDataId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getWaterPressure() {
        return waterPressure;
    }

    public void setWaterPressure(String waterPressure) {
        this.waterPressure = waterPressure;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNatatoriumSensorId() {
        return natatoriumSensorId;
    }

    public void setNatatoriumSensorId(String natatoriumSensorId) {
        this.natatoriumSensorId = natatoriumSensorId;
    }
}
