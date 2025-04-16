package com.xworkz.microsoftapp.sigin;
import com.xworkz.microsoftapp.microsoft.MicroSoftDto;

public class LogIn {
    MicroSoftDto dto;

        public boolean initiateLogin(MicroSoftDto dto) {
            this.dto = dto;
            boolean loggedIn = false;

            boolean validated = validateMicrosoftUser(dto);
            if (validated) {
                loggedIn = true;
                System.out.println("Microsoft sign-in successful!");
            } else {
                System.out.println("Microsoft sign-in failed. Please check your details.");
            }

            return loggedIn;
        }

        public boolean validateMicrosoftUser(MicroSoftDto dto) {
            boolean valid = false;

            boolean isUserIdValid = false;
            boolean isNameValid = false;
            boolean isEmailValid = false;
            boolean isPasswordValid = false;
            boolean isConfirmPasswordValid = false;
            boolean isMobileValid = false;

            if (dto.getUserId() != null && !dto.getUserId().isEmpty()) {
                isUserIdValid = true;
            } else {
                System.out.println("Invalid user ID");
            }

            if (dto.getName() != null && dto.getName().length() > 2) {
                isNameValid = true;
            } else {
                System.out.println("Name is too short");
            }

            if (dto.getEmail() != null && dto.getEmail().contains("@")) {
                isEmailValid = true;
            } else {
                System.out.println("Email format is wrong");
            }

            if (dto.getPassword() != null && dto.getPassword().length() >= 6) {
                isPasswordValid = true;
            } else {
                System.out.println("Password must be at least 6 characters");
            }

            if (dto.getConfirmPassword() != null && dto.getConfirmPassword().equals(dto.getPassword())) {
                isConfirmPasswordValid = true;
            } else {
                System.out.println("Passwords do not match");
            }

            if (String.valueOf(dto.getMobileNumber()).length() == 10) {
                isMobileValid = true;
            } else {
                System.out.println("Mobile number must be 10 digits");
            }

            if (isUserIdValid && isNameValid && isEmailValid && isPasswordValid && isConfirmPasswordValid && isMobileValid) {
                valid = true;
            }

            return valid;
        }
    public void getUserDetailsInfo(){
        System.out.println("User id : "+this.dto.getUserId());
        System.out.println("email : "+this.dto.getEmail());
        System.out.println("mobile number : "+this.dto.getMobileNumber());
        System.out.println("Password : "+this.dto.getPassword());
        System.out.println("Confirm Password : "+this.dto.getConfirmPassword());
        System.out.println("name : "+this.dto.getName());
    }
    }


