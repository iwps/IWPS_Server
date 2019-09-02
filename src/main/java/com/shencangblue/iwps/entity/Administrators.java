package com.shencangblue.iwps.entity;

/**
 * 每个游泳馆的管理员
 */
public class Administrators {
    private long administratorId;
    private String name;
    private String avatar;
    private String detail;
    private String swimmingPoolAffiliated;
    private String password;

    public long getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(long administratorId) {
        this.administratorId = administratorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
