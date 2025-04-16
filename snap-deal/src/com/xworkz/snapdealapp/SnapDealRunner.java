package com.xworkz.snapdealapp;

import com.xworkz.snapdealapp.register.SnapDealRegistration;
import com.xworkz.snapdealapp.snapdeal.SnapDealDto;

public class SnapDealRunner {
    public static void main(String[] args) {

        SnapDealDto snapDealDto = new SnapDealDto();
        snapDealDto.setEmailId("john567@gmail.com");
        snapDealDto.setMobileNumber(3456789090L);
        snapDealDto.setName("John Smith");
        snapDealDto.setDob("08-02-2001");
        snapDealDto.setPassWord("john07%809");

        SnapDealRegistration signIn = new SnapDealRegistration();


        boolean msg = signIn.registration(snapDealDto);

        if (msg) {
            System.out.println(" Registration Successful");
            signIn.getUserDetails(); // this will now work without NullPointerException
        } else {
            System.out.println(" Registration Unsuccessful");
        }
    }
}
