package com.xworkz.tasks.appliance;

public class ApplianceRunner {
    public static void main(String[] args) {
        Appliance appliance = new Appliance();
        appliance.turnOn();
        appliance.turnOff();

        HomeAppliance homeAppliance = new HomeAppliance();
        homeAppliance.turnOn();
        homeAppliance.turnOff();
    }
}
