package com.xworkz.passportapp;

import com.xworkz.passportapp.constants.CpvLocation;
import com.xworkz.passportapp.constants.DcdrLocation;
import com.xworkz.passportapp.generatepassport.PassportSeva;
import com.xworkz.passportapp.passport.PassportDto;

public class PassportRunner {
    public static void main(String[] args) {

        PassportDto passportDto = new PassportDto();
        passportDto.setCpvLocaton(CpvLocation.PASSPORTOFFICE);
        passportDto.setDcdrLocation(DcdrLocation.Bengaluru);
        passportDto.setEmail("baba12@gmail.com");
        passportDto.setGivenName("Baba");
        passportDto.setSurName("Kohli");
        passportDto.setDob("01-01-1970");
        passportDto.setPwd("Baba@134");
        passportDto.setLoginId("baba12@gmail.com");
        passportDto.setEmailLoginSame("same");
        passportDto.setHintQues("Your's birth place");
        passportDto.setHintAns("Kolkata");
        passportDto.setCaptcha("y89Ty");
        passportDto.setConfirmPwd("Baba@123");


        PassportSeva passportSeva = new PassportSeva();
        boolean ref = passportSeva.registeredUser(passportDto);

        if(ref == true){
            System.out.println("User registration successful");
        }
        else{
            System.out.println("User registration unsuccessful");
        }
    }
}
