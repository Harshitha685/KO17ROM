package com.xworkz.methodoverriding.ride;

public class BikeRide extends Ride {

    @Override
    public void start() {
        System.out.println("Starting the bike ride using app.");
    }

    @Override
    public void stop() {
        System.out.println("Bike ride ended and locked.");
    }

    @Override
    public void calculateDuration() {
        System.out.println("Duration calculated based on unlock and lock time.");
    }

    @Override
    public void calculateFare() {
        System.out.println("Fare includes base rate and per-minute charge.");
    }

    public void showBikeDetails() {
        System.out.println("Showing bike ID, type, and battery level.");
    }
}


