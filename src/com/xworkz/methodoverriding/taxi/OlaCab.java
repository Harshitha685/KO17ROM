package com.xworkz.methodoverriding.taxi;


    public class OlaCab extends Taxi {

        @Override
        public void bookRide() {
            System.out.println("Booking a ride through Ola app.");
        }

        @Override
        public void startRide() {
            System.out.println("Ride has started. GPS tracking enabled.");
        }

        @Override
        public void stopRide() {
            System.out.println("Ride stopped. Generating digital receipt.");
        }

        @Override
        public void calculateFare() {
            System.out.println("Fare includes base fare, distance, and surge pricing.");
        }

        public void showDriverDetails() {
            System.out.println("Showing driver name, rating, and car details.");
        }
    }


