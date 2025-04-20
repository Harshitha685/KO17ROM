package com.xworkz.methodoverriding.login;

public class GoogleLogin extends Login {

    @Override
    public void openLoginPage() {
        System.out.println("Opening Google login page.");
    }

    @Override
    public void enterCredentials() {
        System.out.println("Entering Google username and password.");
    }

    @Override
    public void submit() {
        System.out.println("Submitting login form with Google account.");
    }

    @Override
    public void logout() {
        System.out.println("Logging out from Google account.");
    }

    public void twoFactorAuthentication() {
        System.out.println("Enabling two-factor authentication.");
    }
}


