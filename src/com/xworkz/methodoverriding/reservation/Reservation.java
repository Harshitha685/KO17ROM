package com.xworkz.methodoverriding.reservation;

public class Reservation {

        public void book() {
            System.out.println("Booking a reservation.");
        }

        public void cancel() {
            System.out.println("Cancelling the reservation.");
        }

        public void modify() {
            System.out.println("Modifying reservation details.");
        }

        public void showDetails() {
            System.out.println("Showing reservation details.");
        }
    }


