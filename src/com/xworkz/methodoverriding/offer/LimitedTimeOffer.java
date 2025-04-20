package com.xworkz.methodoverriding.offer;

public class LimitedTimeOffer extends Offer {

    @Override
    public void createOffer() {
        System.out.println("Creating a limited-time offer with a deadline.");
    }

    @Override
    public void applyOffer() {
        System.out.println("Applying discount for limited time.");
    }

    @Override
    public void viewOfferDetails() {
        System.out.println("Showing expiry time and discount percentage.");
    }

    @Override
    public void expireOffer() {
        System.out.println("Automatically expiring the offer after deadline.");
    }

    public void countdownTimer() {
        System.out.println("Displaying countdown timer for the offer.");
    }
}


