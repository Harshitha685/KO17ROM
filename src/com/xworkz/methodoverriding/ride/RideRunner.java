package com.xworkz.methodoverriding.ride;

public class RideRunner {

        public static void main(String[] args) {
            Ride ride = new Ride();
            ride.start();
            ride.stop();
            ride.calculateDuration();
            ride.calculateFare();
            System.out.println();

            Ride br = new BikeRide();
            br.start();
            br.stop();
            br.calculateDuration();
            br.calculateFare();
            System.out.println();

            BikeRide bike = new BikeRide();
            bike.start();
            bike.stop();
            bike.calculateDuration();
            bike.calculateFare();
            bike.showBikeDetails();  // Unique method in child class
        }
    }


