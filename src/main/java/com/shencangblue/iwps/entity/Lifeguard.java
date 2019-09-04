package com.shencangblue.iwps.entity;

/**
 * 每个游泳馆的救生员
 */
public class Lifeguard {
    private long lifeguardId;
    private String name;
    private String password;
    private String avatar;
    private String detail;
    private String swimmingPoolAffiliated;
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getLifeguardId() {
        return lifeguardId;
    }

    public void setLifeguardId(long lifeguardId) {
        this.lifeguardId = lifeguardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getSwimmingPoolAffiliated() {
        return swimmingPoolAffiliated;
    }

    public void setSwimmingPoolAffiliated(String swimmingPoolAffiliated) {
        this.swimmingPoolAffiliated = swimmingPoolAffiliated;
    }
}
