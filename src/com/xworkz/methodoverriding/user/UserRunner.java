package com.xworkz.methodoverriding.user;

public class UserRunner {
        public static void main(String[] args) {
            User user = new User();
            user.login();
            user.logout();
            user.viewProfile();
            user.changePassword();
            System.out.println();

            User ad = new Admin();
            ad.login();
            ad.logout();
            ad.viewProfile();
            ad.changePassword();
            System.out.println();

            Admin admin = new Admin();
            admin.login();
            admin.logout();
            admin.viewProfile();
            admin.changePassword();
            admin.manageUsers();
        }
    }


