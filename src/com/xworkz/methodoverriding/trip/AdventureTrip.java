package com.xworkz.methodoverriding.trip;

public class AdventureTrip extends Trip {

    @Override
    public void plan() {
        System.out.println("Planning activities like trekking and rafting.");
    }

    @Override
    public void bookTickets() {
        System.out.println("Booking tickets to remote adventure spots.");
    }

    @Override
    public void packBags() {
        System.out.println("Packing gear like ropes, boots, and tents.");
    }

    @Override
    public void start() {
        System.out.println("Beginning the thrilling adventure!");
    }

    public void wearSafetyGear() {
        System.out.println("Wearing helmets and safety gear.");
    }
}


