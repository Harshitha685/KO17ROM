package com.xworkz.githubapp;
import com.xworkz.githubapp.userdata.GitHubUserDto;
import com.xworkz.githubapp.signup.GitHub;
public class GitHubRunner
{

        public static void main(String[] args) {
            GitHubUserDto user1 = new GitHubUserDto();
            user1.setEmail("developer111@github.com");
            user1.setUserName("dev-coder01");
            user1.setPassword("GitHub@2025");
            user1.setFullName("Developer Coder");
            user1.setBio("Java backend developer ");

            GitHub github = new GitHub();
            if (github.userSignUp(user1)) {
                System.out.println("GitHub Registration Successful!");
            } else {
                System.out.println("GitHub Registration Failed!");
            }
//            github.getUserProfile();
            System.out.println(user1);
        }
    }

