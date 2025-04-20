package com.xworkz.methodoverriding.taxi;

public class TaxiRunner {
        public static void main(String[] args) {
            Taxi taxi = new Taxi();
            taxi.bookRide();
            taxi.startRide();
            taxi.stopRide();
            taxi.calculateFare();
            System.out.println();

            Taxi olat = new OlaCab();
            olat.bookRide();
            olat.startRide();
            olat.stopRide();
            olat.calculateFare();
            System.out.println();

            OlaCab ola = new OlaCab();
            ola.bookRide();
            ola.startRide();
            ola.stopRide();
            ola.calculateFare();
            ola.showDriverDetails();  // Unique to OlaCab
        }
    }


