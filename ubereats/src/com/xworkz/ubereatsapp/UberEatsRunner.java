package com.xworkz.ubereatsapp;
import com.xworkz.ubereatsapp.userdata.UberEatsUserDto;
import com.xworkz.ubereatsapp.signup.UberEats;
public class UberEatsRunner
{

        public static void main(String[] args) {
            UberEatsUserDto user1 = new UberEatsUserDto();
            user1.setEmail("ashika@e6896.com");
            user1.setPhoneNumber("9998887776");
            user1.setFullName("Ashika Ragnath");
            user1.setPassword("Food11@2024");
            user1.setDeliveryAddress("HSR Layout, Bangalore");

            UberEats uberEats = new UberEats();
            if (uberEats.userSignUp(user1)) {
                System.out.println("UberEats Registration Successful!");
            } else {
                System.out.println("UberEats Registration Failed!");
            }
            uberEats.getUberEatsUserInfo();
        }
    }


