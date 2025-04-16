package com.xworkz.tasks.appliance;

public class HomeAppliance extends Appliance{
        public void setTimer() {
            System.out.println("Timer set for ");
        }

        public void adjustTemperature() {
            System.out.println("Temperature set to ");
        }

        public void cleanFilter() {
            System.out.println("Cleaning the appliance filter.");
        }

        public void lockControls() {
            System.out.println("Child lock activated.");
        }

        public void showApplianceType() {
            System.out.println("Appliance Type: Washing Machine");
        }
    }

