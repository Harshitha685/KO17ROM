package com.xworkz.nykaaapp;

import com.xworkz.nykaaapp.nykaa.NykaaDto;
import com.xworkz.nykaaapp.userlogin.NykaaUserLogIn;

public class NykaaRunner {
    public static void main(String[] args) {


        NykaaDto nykaaDto = new NykaaDto();
        nykaaDto.setEmailId("ram123@gmail.com");
        nykaaDto.setName("Ramarjun");
        nykaaDto.setMobileNumber("6897930740");
        nykaaDto.setPassWord("rammu0980");

        NykaaUserLogIn logIn = new NykaaUserLogIn();
        boolean ref = logIn.userlogIn(nykaaDto);


        if(ref == true){
            System.out.println("User Login successful");
        }
        else{
            System.out.println("User Login unsuccessful");
        }
        //logIn.getUserLogin();
        System.out.println(nykaaDto);
    }
    }

