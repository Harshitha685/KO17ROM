package com.xworkz.walmartapp;

import com.xworkz.walmartapp.login.UserLogIn;
import com.xworkz.walmartapp.walmart.WalMartDto;

public class WalMartRunner {
    public static void main(String[] args) {

        WalMartDto walMartDto = new WalMartDto();
        walMartDto.setEmailId("harshitha@gmail.com");
        walMartDto.setFirstName("Harshitha");
        walMartDto.setLastName("Singh");
        walMartDto.setPhoneNumber("9876543210");
        walMartDto.setPassWord("harshi123");

        UserLogIn userLogIn = new UserLogIn();
        boolean result = userLogIn.userLogIn(walMartDto);

        if (result) {
            System.out.println("login successful");
            userLogIn.getUserDetails();
        } else {
            System.out.println("login failed");
        }
        System.out.println(walMartDto);
    }
}
