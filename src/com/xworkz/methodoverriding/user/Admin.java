package com.xworkz.methodoverriding.user;

public class Admin extends User {

    @Override
    public void login() {
        System.out.println("Logging in as an admin.");
    }

    @Override
    public void logout() {
        System.out.println("Logging out as an admin.");
    }

    @Override
    public void viewProfile() {
        System.out.println("Viewing admin dashboard.");
    }

    @Override
    public void changePassword() {
        System.out.println("Changing admin password.");
    }

    public void manageUsers() {
        System.out.println("Managing users.");
    }
}


