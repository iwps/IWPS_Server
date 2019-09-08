package com.shencangblue.iwps.entity;

/**
 * 游泳馆
 */
public class SwimmingPool {
    private long swimmingPoolId;
    private String name;
    private String detail;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String address;
    private String phone;

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
