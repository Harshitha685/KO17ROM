package com.xworkz.microsoftapp;
import com.xworkz.microsoftapp.microsoft.MicroSoftDto;
import com.xworkz.microsoftapp.sigin.LogIn;
public class MicroSoftRunner {

        public static void main(String[] args) {

            MicroSoftDto user = new MicroSoftDto();
            user.setUserId("msoft2025");
            user.setName("Harshitha");
            user.setEmail("harshitha@microsoft.com");
            user.setPassword("msft@2025");
            user.setConfirmPassword("msft@2025");
            user.setMobileNumber(9876543210L);

            LogIn login = new LogIn();
            boolean status = login.initiateLogin(user);

//login.getUserDetailsInfo();
            System.out.println(user.toString());
        }
    }


