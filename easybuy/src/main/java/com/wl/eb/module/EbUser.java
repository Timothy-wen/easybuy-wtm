package com.wl.eb.module;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class EbUser implements Serializable {

    @TableId(value = "eu_user_id",type= IdType.INPUT)
    private String euUserId;

    private String euUserName;

    private String euPassword;
    private String euSex;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date euBirthday;


    private String euIdentityCode;


    private String euEmail;


    private String euMobile;


    private String euAddress;


    private Integer euStatus;


    private static final long serialVersionUID = 1L;

    public String getEuUserId() {
        return euUserId;
    }

    public void setEuUserId(String euUserId) {
        this.euUserId = euUserId;
    }

    public String getEuUserName() {
        return euUserName;
    }

    public void setEuUserName(String euUserName) {
        this.euUserName = euUserName;
    }

    public String getEuPassword() {
        return euPassword;
    }

    public void setEuPassword(String euPassword) {
        this.euPassword = euPassword;
    }

    public String getEuSex() {
        return euSex;
    }

    public void setEuSex(String euSex) {
        this.euSex = euSex;
    }

    public Date getEuBirthday() {
        return euBirthday;
    }

    public void setEuBirthday(Date euBirthday) {
        this.euBirthday = euBirthday;
    }

    public String getEuIdentityCode() {
        return euIdentityCode;
    }

    public void setEuIdentityCode(String euIdentityCode) {
        this.euIdentityCode = euIdentityCode;
    }

    public String getEuEmail() {
        return euEmail;
    }

    public void setEuEmail(String euEmail) {
        this.euEmail = euEmail;
    }

    public String getEuMobile() {
        return euMobile;
    }

    public void setEuMobile(String euMobile) {
        this.euMobile = euMobile;
    }

    public String getEuAddress() {
        return euAddress;
    }

    public void setEuAddress(String euAddress) {
        this.euAddress = euAddress;
    }

    public Integer getEuStatus() {
        return euStatus;
    }

    public void setEuStatus(Integer euStatus) {
        this.euStatus = euStatus;
    }
}