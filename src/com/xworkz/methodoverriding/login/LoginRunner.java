package com.xworkz.methodoverriding.login;

public class LoginRunner {

        public static void main(String[] args) {
            Login login = new Login();
            login.openLoginPage();
            login.enterCredentials();
            login.submit();
            login.logout();
            System.out.println();

            Login gl = new GoogleLogin();
            gl.openLoginPage();
            gl.enterCredentials();
            gl.submit();
            gl.logout();
            System.out.println();

            GoogleLogin googleLogin = new GoogleLogin();
            googleLogin.openLoginPage();
            googleLogin.enterCredentials();
            googleLogin.submit();
            googleLogin.logout();
            googleLogin.twoFactorAuthentication();
        }
    }


