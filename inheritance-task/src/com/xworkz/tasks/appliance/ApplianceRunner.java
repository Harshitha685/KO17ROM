package com.xworkz.tasks.appliance;

import com.xworkz.tasks.app.App;

public class ApplianceRunner {
    public static void main(String[] args) {
        Appliance appliance = new Appliance();
        appliance.turnOn();
        appliance.turnOff();
        appliance.checkWarranty();
        appliance.showBrand();
        appliance.powerConsumption();

        Appliance appliance2 = new HomeAppliance();
        appliance2.turnOn();
        appliance2.turnOff();
        appliance2.checkWarranty();
        appliance2.showBrand();
        appliance2.powerConsumption();

        HomeAppliance homeAppliance = new HomeAppliance();
        homeAppliance.setTimer();
        homeAppliance.adjustTemperature();
        homeAppliance.cleanFilter();
        homeAppliance.lockControls();
        homeAppliance.showApplianceType();

        Appliance appliance1 = new HomeAppliance();

        HomeAppliance homeAppliance12 = (HomeAppliance) appliance1;
        System.out.println(homeAppliance12);
    }
}
