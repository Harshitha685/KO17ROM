package com.xworkz.googleapp.googlesignin;

import com.xworkz.googleapp.google.GoogleDto;


public class GoogleSignIn {
    GoogleDto googleDto;

        public boolean attemptLogin(GoogleDto googleDto) {
            this.googleDto = googleDto;
            boolean isLogin = false;

            boolean valid = validateGoogleUser(googleDto);
            if (valid) {
                isLogin = true;
            } else {
                System.out.println("User is not registered ..Try again later");
            }

            return isLogin;
        }

        public boolean validateGoogleUser(GoogleDto googleDto) {
            boolean validUser = false;
            boolean isEmailValid = false;
            boolean isPhoneValid = false;
            boolean isUsernameValid = false;
            boolean isPasswordValid = false;
            boolean isConfirmPasswordValid = false;

            // email
            String email = googleDto.getEmail();
            if (email != null && !email.isEmpty() && email.contains("@")) {
                isEmailValid = true;
            } else {
                System.out.println("Invalid email");
            }

            // phone number
            String phone = googleDto.getPhoneNumber();
            if (phone != null && phone.length() == 10) {
                isPhoneValid = true;
            } else {
                System.out.println("Invalid phone number");
            }

            // username
            String username = googleDto.getUsername();
            if (username != null && !username.isEmpty() && username.length() >= 3) {
                isUsernameValid = true;
            } else {
                System.out.println("Invalid username");
            }

            // password
            String password = googleDto.getPassword();
            if (password != null && !password.isEmpty() && password.length() >= 8) {
                isPasswordValid = true;
            } else {
                System.out.println("Invalid password");
            }

            // confirm password
            String confirmPassword = googleDto.getConfirmPassword();
            if (confirmPassword != null && confirmPassword.equals(password)) {
                isConfirmPasswordValid = true;
            } else {
                System.out.println("Passwords do not match");
            }

            if (isEmailValid && isPhoneValid && isUsernameValid && isPasswordValid && isConfirmPasswordValid) {
                validUser = true;
            }

            return validUser;
        }
    public void getUserData(){
        System.out.println("email : "+this.googleDto.getEmail());
        System.out.println("phone number : "+this.googleDto.getPhoneNumber());
        System.out.println("Password : "+this.googleDto.getPassword());
        System.out.println("user Name : "+this.googleDto.getUsername());
        System.out.println("confirm password: "+this.googleDto.getConfirmPassword());
    }
    }


