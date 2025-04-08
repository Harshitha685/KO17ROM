package com.xworkz.passportapp.passport;

import com.xworkz.passportapp.constants.CpvLocation;
import com.xworkz.passportapp.constants.DcdrLocation;

public class PassportDto {

    private CpvLocation cpvLocaton;
    private DcdrLocation dcdrLocation;
    private String givenName ;
    private String surName ;
    private String dob ;
    private String email ;
    private String emailLoginSame;
    private String loginId ;
    private String pwd ;
    private String confirmPwd ;
    private String hintQues;
    private String hintAns ;
    private String captcha ;


    public void setDcdrLocation(DcdrLocation dcdrLocation) {
        this.dcdrLocation = dcdrLocation;
    }

    public CpvLocation getCpvLocaton() {
        return cpvLocaton;
    }

    public void setCpvLocaton(CpvLocation cpvLocaton) {
        this.cpvLocaton = cpvLocaton;
    }

    public DcdrLocation getDcdrLocation() {
        return dcdrLocation;
    }

    //givenName
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

   public String getGivenName(){
        return givenName;
   }

//surname
    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSurName() {
        return surName;
    }

    //dob
    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }

    //email
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    //emailLoginSame
    public void setEmailLoginSame(String emailLoginSame) {
        this.emailLoginSame = emailLoginSame;
    }

    public String getEmailLoginSame() {
        return emailLoginSame;
    }

    //login
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginId() {
        return loginId;
    }

    //pwd
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwd() {
        return pwd;
    }

    //confirmPwd
    public void setConfirmPwd(String confirmPwd) {
        this.confirmPwd = confirmPwd;
    }

    public String getConfirmPwd() {
        return confirmPwd;
    }

    //hintQues
    public void setHintQues(String hintQues) {
        this.hintQues = hintQues;
    }

    public String getHintQues() {
        return hintQues;
    }

    //hintAns
    public void setHintAns(String hintAns) {
        this.hintAns = hintAns;
    }

    public String getHintAns() {
        return hintAns;
    }

    //captcha
    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getCaptcha() {
        return captcha;
    }
}
