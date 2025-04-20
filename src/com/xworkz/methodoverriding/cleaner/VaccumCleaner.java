package com.xworkz.methodoverriding.cleaner;

public class VaccumCleaner extends Cleaner {

    @Override
    public void turnOn() {
        System.out.println("Powering on with suction motor.");
    }

    @Override
    public void clean() {
        System.out.println("Vacuuming the floor.");
    }

    @Override
    public void turnOff() {
        System.out.println("Powering off safely.");
    }

    @Override
    public void maintain() {
        System.out.println("Emptying dust bag and cleaning filters.");
    }

    public void adjustSuction() {
        System.out.println("Adjusting suction power.");
    }
}


