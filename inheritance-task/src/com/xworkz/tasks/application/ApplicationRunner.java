package com.xworkz.tasks.application;

public class ApplicationRunner {
    public static void main(String[] args) {
        Application application = new Application();
        application.approveApplication();
        application.submitApplication();

        WebApplication webApplication = new WebApplication();
        webApplication.approveApplication();
        webApplication.submitApplication();
    }
}
