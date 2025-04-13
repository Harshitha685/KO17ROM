package com.xworkz.tasks.service;

public class ServiceRunner {
    public static void main(String[] args) {
        Service service = new Service();
        service.activateService();
        service.deactivateService();

        PassportService passportService = new PassportService();
        passportService.activateService();
        passportService.deactivateService();

        Service service1 = new PassportService();

        PassportService passportService1 = (PassportService) service1;
        System.out.println(passportService1);
    }
}
