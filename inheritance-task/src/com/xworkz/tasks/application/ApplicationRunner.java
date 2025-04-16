package com.xworkz.tasks.application;

public class ApplicationRunner {
    public static void main(String[] args) {
        Application application = new Application();
        application.approveApplication();
        application.submitApplication();
        application.launch();
        application.close();
        application.update();

        Application application2  = new WebApplication();
        application2.approveApplication();
        application2.submitApplication();
        application2.launch();
        application2.close();
        application2.update();

        WebApplication webApplication = new WebApplication();
        webApplication.loadURL();
        webApplication.authenticateUser();
        webApplication.handleRequest();
        webApplication.displayContent();
        webApplication.logout();

        Application application1 = new WebApplication();

        WebApplication webApplication1 = (WebApplication) application1;
        System.out.println(webApplication1);
    }
}
