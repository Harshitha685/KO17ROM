package com.xworkz.wikipediaapp.wikipedia;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class WikiPediaDto {

    private String email;
    private String userName;
    private String userPassword;
    private String retypePassword;
    private String preferredLanguage;

    // Setters
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserPassword(String userPassword) {
//        this.userPassword = userPassword;
//    }
//
//    public String getUserPassword() {
//        return userPassword;
//    }
//
//    public void setRetypePassword(String retypePassword) {
//        this.retypePassword = retypePassword;
//    }
//
//    public String getRetypePassword() {
//        return retypePassword;
//    }
//
//
//    public void setPreferredLanguage(String preferredLanguage) {
//        this.preferredLanguage = preferredLanguage;
//    }
//
//    public String getPreferredLanguage() {
//        return preferredLanguage;
//    }
@Override
    public String toString(){
        return "WikiPediaDto:{email = "+this.email+"," +
                "\nuser name = "+this.userName+"," +
                "\npassword = "+this.userPassword+"," +
                "\nretype password = "+this.retypePassword+"," +
                "\nlanguage prefered = "+this.preferredLanguage+" }";
    }
}
