package com.xworkz.tasks.application;

public class WebApplication extends Application{

        public void loadURL() {
            System.out.println("Loading website: ");
        }

        public void authenticateUser() {
            System.out.println("Authenticating user: " );
        }

        public void handleRequest() {
            System.out.println("Handling HTTP request...");
        }

        public void displayContent() {
            System.out.println("Displaying web content...");
        }

        public void logout() {
            System.out.println("Logging out user...");
        }
    }


