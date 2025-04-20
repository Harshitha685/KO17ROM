package com.xworkz.methodoverriding.reservation;

public class FlightReservation extends Reservation {

    @Override
    public void book() {
        System.out.println("Booking a flight ticket.");
    }

    @Override
    public void cancel() {
        System.out.println("Cancelling the flight ticket.");
    }

    @Override
    public void modify() {
        System.out.println("Changing flight date or seat.");
    }

    @Override
    public void showDetails() {
        System.out.println("Showing flight ticket details.");
    }

    public void checkIn() {
        System.out.println("Checking in for the flight.");
    }
}


