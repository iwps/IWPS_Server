package com.shencangblue.iwps.entity;

/**
 * 游泳馆
 */
public class SwimmingPool {
    private long swimmingPoolId;
    private String name;
    private String detail;

    public long getSwimmingPoolId() {
        return swimmingPoolId;
    }

    public void setSwimmingPoolId(long swimmingPoolId) {
        this.swimmingPoolId = swimmingPoolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
