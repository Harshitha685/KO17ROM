package com.xworkz.methodoverriding.session;

public class UserSession extends Session {

    @Override
    public void startSession() {
        System.out.println("Starting session for user.");
    }

    @Override
    public void validateSession() {
        System.out.println("Validating user authentication.");
    }

    @Override
    public void refreshSession() {
        System.out.println("Extending user session timeout.");
    }

    @Override
    public void endSession() {
        System.out.println("Logging out the user and ending session.");
    }

    public void trackActivity() {
        System.out.println("Tracking user's session activity.");
    }
}


