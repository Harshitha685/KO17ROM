package com.xworkz.flipkart;
import com.xworkz.flipkart.userdata.FlipKartUserDto;
import com.xworkz.flipkart.signup.FlipKart;
public class FlipKartRunner
{

        public static void main(String[] args) {
            FlipKartUserDto user1 = new FlipKartUserDto();
            user1.setEmail("buyer@flipkart.com");
            user1.setPhoneNumber("9876543210");
            user1.setPassword("srini@2024");
            user1.setFullName("Srinivas");
            user1.setShippingAddress("Bangalore");

            FlipKart flipkart = new FlipKart();
            if (flipkart.userSignUp(user1)) {
                System.out.println("Flipkart Registration Successful!");
            } else {
                System.out.println("Flipkart Registration Failed!");
            }
            flipkart.getUserDetails();
        }
    }


