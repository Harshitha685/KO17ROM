package com.xworkz.blinkitapp.signup;
import com.xworkz.blinkitapp.userdata.BlinkitUserDto;
public class Blinkit
{
BlinkitUserDto user;
        public boolean userSignUp(BlinkitUserDto user) {
            this.user = user;
            return userValidation(user);
        }

        public boolean userValidation(BlinkitUserDto user) {
            boolean isEmailValid = false;
            boolean isPhoneValid = false;
            boolean isPasswordValid = false;
            boolean isFullNameValid = false;
            boolean isAddressValid = false;

            if (user.getEmail() != null && user.getEmail().contains("@")) {
                isEmailValid = true;
            } else {
                System.out.println("Invalid Email: Must contain '@'");
            }

            if (user.getPhoneNumber() != null && user.getPhoneNumber().length() == 10) {
                isPhoneValid = true;
            } else {
                System.out.println("Invalid Phone Number: Should be 10 digits.");
            }

            if (user.getPassword() != null && user.getPassword().length() >= 8 && user.getPassword().length() <= 16) {
                isPasswordValid = true;
            } else {
                System.out.println("Invalid Password: Should be 8–16 characters long.");
            }

            if (user.getFullName() != null && !user.getFullName().isEmpty()) {
                isFullNameValid = true;
            } else {
                System.out.println("Invalid Full Name: Cannot be empty.");
            }

            if (user.getDeliveryAddress() != null && !user.getDeliveryAddress().isEmpty()) {
                isAddressValid = true;
            } else {
                System.out.println("Invalid Delivery Address: Please provide an address.");
            }

            return isEmailValid && isPhoneValid && isPasswordValid && isFullNameValid && isAddressValid;
        }
    public void getUserDetails(){
        System.out.println("email : "+this.user.getEmail());
        System.out.println("phone number : "+this.user.getPhoneNumber());
        System.out.println("Password : "+this.user.getPassword());
        System.out.println("full Name : "+this.user.getFullName());
        System.out.println("delivery address : "+this.user.getDeliveryAddress());
    }
    }


