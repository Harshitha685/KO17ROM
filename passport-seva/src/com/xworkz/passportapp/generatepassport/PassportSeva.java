package com.xworkz.passportapp.generatepassport;

import com.xworkz.passportapp.passport.PassportDto;

public class PassportSeva {

    public  boolean registeredUser(PassportDto passportDto){
        boolean isUserRegistered = false;

        boolean userValidated = validateUser(passportDto);
        if(userValidated == true)
            isUserRegistered = true ;
        else System.out.println("User is not registered ..Try again later");
        return isUserRegistered;
    }

    public boolean validateUser(PassportDto passportDto){
        boolean userValidated = false;
        boolean isSurNameValid = false;
        boolean isCpvLocationValid = false;
        boolean isDcdrLocationValid = false;
        boolean isGivenNameValid = false;
        boolean isDobValid = false;
        boolean isEmailValid = false;
        boolean isEmailLoginSameValid = false;
        boolean isLoginIdValid = false;
        boolean isPwdValid = false;
        boolean isConfirmPwdValid = false;
        boolean isHintQuesValid = false;
        boolean isHintAnsValid = false;
        boolean isCaptchaValid = false;

        String surName = passportDto.getSurName();
        if(surName != null && !surName.isEmpty()){
            isSurNameValid = true;
        }
        else{
            System.out.println("Invalid surname");
        }

        if(passportDto.getCpvLocaton() != null){
            isCpvLocationValid = true;
        }
        else{
            System.out.println("Invalid CpvLocation");
        }

        if(passportDto.getDcdrLocation() != null){
            isDcdrLocationValid = true;
        }
        else {
            System.out.println("Invalid DcdrLocation");
        }

        String givenName = passportDto.getGivenName();
        if(givenName != null && !givenName.isEmpty()){
            isGivenNameValid = true;
        }
        else {
            System.out.println("Given name is invalid");
        }

        String dob = passportDto.getDob();
        if(dob != null && !dob.isEmpty()){

            isDobValid = true;
        }
        else {
            System.out.println("Invalid dob");
        }

        String email = passportDto.getEmail();
        if(email != null){
            isEmailValid = true;
        }
        else {
            System.out.println("Invalid email");
        }

        String emailLoginSame = passportDto.getEmailLoginSame();
        if(emailLoginSame != null ){
            isEmailLoginSameValid = true;
        }
        else {
            System.out.println("Invalid emailLoginSame");
        }

        String login = passportDto.getLoginId();
        if(login != null){
            isLoginIdValid = true;
        }
        else {
            System.out.println("Invalid loginId");
        }

        String pwd = passportDto.getPwd();
        if(pwd != null){
            isPwdValid = true;
        }
        else {
            System.out.println("Invalid password");
        }

        String confirmPwd = passportDto.getConfirmPwd();
        if(confirmPwd != null){
            isConfirmPwdValid = true;
        }
        else {
            System.out.println("Invalid confirm password");
        }

        String hintQues = passportDto.getHintQues();
        if(hintQues != null){
            isHintQuesValid = true;
        }
        else {
            System.out.println("Invalid answer");
        }

        String hintAns = passportDto.getHintAns();
        if(hintAns != null){
            isHintAnsValid = true;
        }
        else {
            System.out.println("Invalid answer");
        }

        String captcha = passportDto.getCaptcha();
        if(captcha != null){
            isCaptchaValid = true;
        }
        else {
            System.out.println("Invalid captcha");
        }


        if(isSurNameValid == true && isCpvLocationValid == true && isDcdrLocationValid == true && isGivenNameValid == true && isDobValid == true &&
         isEmailValid == true && isEmailLoginSameValid == true && isLoginIdValid == true && isPwdValid == true && isConfirmPwdValid == true
        && isHintQuesValid == true && isHintAnsValid == true && isCaptchaValid == true){
                userValidated = true;
            }
            return userValidated;

    }
}
