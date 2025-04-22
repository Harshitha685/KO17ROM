package com.xworkz.ebayapp.ebay;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EbayDto {
    private String firstName;
    private String lastName;
    private String email;
    private String passWord;

//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setPassWord(String passWord) {
//        this.passWord = passWord;
//    }
//
//    public String getPassWord() {
//        return passWord;
//    }
@Override
    public String toString(){
        return "EbayDto:(firstName: "+this.firstName+"," +
                "\nlastName:"+this.lastName+"," +
                "\nemail:"+this.email+"," +
                "\npassword:"+this.passWord+")";

    }
}
