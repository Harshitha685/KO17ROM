package com.xworkz.githubapp.signup;
import com.xworkz.githubapp.userdata.GitHubUserDto;
public class GitHub
{
GitHubUserDto user;
        public boolean userSignUp(GitHubUserDto user) {
            this.user = user;
            return userValidation(user);
        }

        public boolean userValidation(GitHubUserDto user) {
            boolean isEmailValid = false;
            boolean isUserNameValid = false;
            boolean isPasswordValid = false;
            boolean isFullNameValid = false;

            if (user.getEmail() != null && user.getEmail().contains("@")) {
                isEmailValid = true;
            } else {
                System.out.println("Invalid Email: Must include '@'.");
            }

            if (user.getUserName() != null && !user.getUserName().isEmpty() && user.getUserName().length() <= 39) {
                isUserNameValid = true;
            } else {
                System.out.println("Invalid Username: Cannot be empty and must be ≤ 39 characters.");
            }

            if (user.getPassword() != null && user.getPassword().length() >= 8) {
                isPasswordValid = true;
            } else {
                System.out.println("Invalid Password: Minimum 8 characters required.");
            }

            if (user.getFullName() != null && !user.getFullName().isEmpty()) {
                isFullNameValid = true;
            } else {
                System.out.println("Invalid Full Name: Cannot be empty.");
            }

            return isEmailValid && isUserNameValid && isPasswordValid && isFullNameValid;
        }
        public void getUserProfile(){
            System.out.println("Email : "+this.user.getEmail());
            System.out.println("User name : "+this.user.getUserName());
            System.out.println("Password : "+this.user.getPassword());
            System.out.println("Full name : "+this.user.getFullName());
            System.out.println("Bio : "+this.user.getBio());
        }
    }


