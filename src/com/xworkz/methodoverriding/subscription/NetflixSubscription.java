package com.xworkz.methodoverriding.subscription;

public class NetflixSubscription extends Subscription {

    @Override
    public void startSubscription() {
        System.out.println("Activating Netflix account.");
    }

    @Override
    public void cancelSubscription() {
        System.out.println("Cancelling Netflix plan.");
    }

    @Override
    public void renewSubscription() {
        System.out.println("Renewing Netflix monthly plan.");
    }

    @Override
    public void viewDetails() {
        System.out.println("Viewing Netflix plan and usage details.");
    }

    public void streamContent() {
        System.out.println("Streaming movies and shows.");
    }
}


