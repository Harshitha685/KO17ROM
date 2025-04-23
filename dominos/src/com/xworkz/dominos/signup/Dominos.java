package com.xworkz.dominos.signup;
import com.xworkz.dominos.userdata.DominosUserDto;

public class Dominos {

DominosUserDto user;
        public boolean userSignUp(DominosUserDto user) {
            this.user = user;
            return userValidation(user);
        }

        public boolean userValidation(DominosUserDto user) {
            boolean isEmailValid = false;
            boolean isPhoneValid = false;
            boolean isPasswordValid = false;
            boolean isFullNameValid = false;
            boolean isAddressValid = false;

            if (user.getEmail() != null && user.getEmail().contains("@")) {
                isEmailValid = true;
            } else {
                System.out.println("Invalid Email: Please enter a valid email address.");
            }

            if (user.getPhoneNumber() != null && user.getPhoneNumber().length() == 10) {
                isPhoneValid = true;
            } else {
                System.out.println("Invalid Phone Number: Must be 10 digits.");
            }

            if (user.getPassword() != null && user.getPassword().length() >= 8 && user.getPassword().length() <= 16) {
                isPasswordValid = true;
            } else {
                System.out.println("Invalid Password: Should be 8 to 16 characters long.");
            }

            if (user.getFullName() != null && !user.getFullName().isEmpty()) {
                isFullNameValid = true;
            } else {
                System.out.println("Invalid Name: Full name cannot be empty.");
            }

            if (user.getDeliveryAddress() != null && !user.getDeliveryAddress().isEmpty()) {
                isAddressValid = true;
            } else {
                System.out.println("Invalid Address: Delivery address is required.");
            }

            return isEmailValid && isPhoneValid && isPasswordValid && isFullNameValid && isAddressValid;
        }
    public void getUserInfo(){
        System.out.println("email : "+this.user.getEmail());
        System.out.println("phone number : "+this.user.getPhoneNumber());
        System.out.println("Password : "+this.user.getPassword());
        System.out.println("full Name : "+this.user.getFullName());
        System.out.println("Delivery address : "+this.user.getDeliveryAddress());
    }
    }


