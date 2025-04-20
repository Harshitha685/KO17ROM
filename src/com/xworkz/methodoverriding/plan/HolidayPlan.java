package com.xworkz.methodoverriding.plan;

public class HolidayPlan extends Plan {

    @Override
    public void createPlan() {
        System.out.println("Creating a holiday trip plan.");
    }

    @Override
    public void viewPlan() {
        System.out.println("Viewing the itinerary and destinations.");
    }

    @Override
    public void updatePlan() {
        System.out.println("Modifying travel dates and activities.");
    }

    @Override
    public void cancelPlan() {
        System.out.println("Cancelling the holiday plan with refund options.");
    }

    public void bookHotels() {
        System.out.println("Booking hotels for the holiday.");
    }
}


