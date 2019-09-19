package com.shencangblue.iwps.entity;

/**
 * 用户
 */
public class User {
    private long userId;
    private String name;
    private String userAccount;
    private String password;
    private String avatar;
    private String detail;
    private String email;
    private String phone;
//    private String waterPressure;
    private String sex;
    private String swimmingGrade;
    private String RFIDInfo;



    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSwimmingGrade() {
        return swimmingGrade;
    }

    public void setSwimmingGrade(String swimmingGrade) {
        this.swimmingGrade = swimmingGrade;
    }

    public String getRFIDInfo() {
        return RFIDInfo;
    }

    public void setRFIDInfo(String RFIDInfo) {
        this.RFIDInfo = RFIDInfo;
    }
}
