package com.xworkz.tasks.appliance;

import com.xworkz.tasks.app.App;

public class ApplianceRunner {
    public static void main(String[] args) {
        Appliance appliance = new Appliance();
        appliance.turnOn();
        appliance.turnOff();

        HomeAppliance homeAppliance = new HomeAppliance();
        homeAppliance.turnOn();
        homeAppliance.turnOff();

        Appliance appliance1 = new HomeAppliance();

        HomeAppliance homeAppliance1 = (HomeAppliance) appliance1;
        System.out.println(homeAppliance1);
    }
}
