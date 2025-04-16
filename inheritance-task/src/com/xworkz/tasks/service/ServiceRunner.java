package com.xworkz.tasks.service;

public class ServiceRunner {
    public static void main(String[] args) {
        Service service = new Service();
        service.serviceType();
        service.serviceDuration();
        service.serviceCharge();
        service.serviceProvider();
        service.isAvailable();

        System.out.println("--------------------------");

        Service service2 = new PassportService();
        service2.serviceType();
        service2.serviceDuration();
        service2.serviceCharge();
        service2.serviceProvider();
        service2.isAvailable();

        System.out.println("--------------------------");

        PassportService passportService = new PassportService();
        passportService.passportType();
        passportService.passportApplicationStatus();
        passportService.passportProcessingTime();
        passportService.passportFee();
        passportService.passportDocumentsRequired();

        System.out.println("--------------------------");

        Service service3 = new PassportService();
        PassportService passportService2 = (PassportService) service3;
        System.out.println(passportService2);
    }
}
