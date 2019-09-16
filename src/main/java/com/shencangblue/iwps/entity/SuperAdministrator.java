package com.shencangblue.iwps.entity;

public class SuperAdministrator {
    private long superAdministratorId;
    private String name;
    private String superAdministratorAccount;
    private String password;
    private String avatar;
    private String detail;

    public long getSuperAdministratorId() {
        return superAdministratorId;
    }

    public void setSuperAdministratorId(long superAdministratorId) {
        this.superAdministratorId = superAdministratorId;
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

    public String getSuperAdministratorAccount() {
        return superAdministratorAccount;
    }

    public void setSuperAdministratorAccount(String superAdministratorAccount) {
        this.superAdministratorAccount = superAdministratorAccount;
    }
}
