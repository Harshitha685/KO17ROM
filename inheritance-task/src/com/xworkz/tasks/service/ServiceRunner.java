package com.xworkz.tasks.service;

public class ServiceRunner {
    public static void main(String[] args) {
        Service service = new Service();
        service.activateService();
        service.deactivateService();

        PassportService passportService = new PassportService();
        passportService.activateService();
        passportService.deactivateService();
    }
}
