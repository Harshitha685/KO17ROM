package com.xworkz.methodoverriding.reservation;

public class ReservationRunner {

        public static void main(String[] args) {
            Reservation res = new Reservation();
            res.book();
            res.cancel();
            res.modify();
            res.showDetails();
            System.out.println();

            Reservation fr = new FlightReservation();
            fr.book();
            fr.cancel();
            fr.modify();
            fr.showDetails();
            System.out.println();

            FlightReservation flight = new FlightReservation();
            flight.book();
            flight.cancel();
            flight.modify();
            flight.showDetails();
            flight.checkIn();  // Unique to FlightReservation
        }
    }


