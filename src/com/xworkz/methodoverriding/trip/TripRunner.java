package com.xworkz.methodoverriding.trip;

public class TripRunner {

        public static void main(String[] args) {
            Trip trip = new Trip();
            trip.plan();
            trip.bookTickets();
            trip.packBags();
            trip.start();
            System.out.println();

            Trip at = new AdventureTrip();
            at.plan();
            at.bookTickets();
            at.packBags();
            at.start();
            System.out.println();

            AdventureTrip advTrip = new AdventureTrip();
            advTrip.plan();
            advTrip.bookTickets();
            advTrip.packBags();
            advTrip.start();
            advTrip.wearSafetyGear();
        }
    }


