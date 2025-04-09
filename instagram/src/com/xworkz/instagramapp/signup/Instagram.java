package com.xworkz.instagramapp.signup;
import com.xworkz.instagramapp.userdata.UserDataDto;
public class Instagram
{
    UserDataDto user;
    public boolean userSignUp(UserDataDto user)
    {
       if( userValidation(user)){
            this.user = user;
           return true;}
       else
           return false;

    }
    public boolean userValidation(UserDataDto user)
    {
        boolean isUserValid=false;
        boolean isEmailValid=false;
        boolean isDobValid=false;
        boolean isNameValid=false;
        boolean isUserNameValid=false;
        boolean isPasswordValid=false;

        if(user.getEmail()!=null && !user.getEmail().isEmpty())
         isEmailValid=true;
        else
            System.out.println("Invalid Email please provide a valid email Id");

        if(user.getDob()!=null && !user.getDob().isEmpty() )
            isDobValid=true;
        else
            System.out.println("Invalid DOB please provide a valid DOB");

        if(user.getName()!=null && user.getName().length()>0 && user.getName().length()<=45)
            isNameValid=true;
        else
            System.out.println("Invalid Name Please provide a valid Name");

        if(user.getUserName()!=null && user.getUserName().length()>0 && user.getUserName().length()<=45 )
            isUserNameValid=true;
        else
            System.out.println("Invalid User Name Please provide a valid User Name");

        if(user.getPassword()!=null && user.getPassword().length()>=8 && user.getPassword().length()<=16 )
            isPasswordValid=true;
        else
            System.out.println("Invalid User Name Please provide a valid User Name");

        if(isEmailValid && isDobValid && isPasswordValid && isNameValid && isUserNameValid)
            isUserValid=true;

        return isUserValid;

    }
    public void getUserData(){
        System.out.println("Email : "+this.user.getEmail());
        System.out.println("Dob : "+this.user.getDob());
        System.out.println("Password : "+this.user.getPassword());
        System.out.println("Name : "+this.user.getName());
        System.out.println("User name : "+this.user.getUserName());
    }
}
