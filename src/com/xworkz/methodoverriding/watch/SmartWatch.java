package com.xworkz.methodoverriding.watch;

public class SmartWatch extends Watch {

    @Override
    public void showTime() {
        System.out.println("Displaying digital time with notifications.");
    }

    @Override
    public void start() {
        System.out.println("Booting up the smart features.");
    }

    @Override
    public void stop() {
        System.out.println("Shutting down smart features.");
    }

    @Override
    public void reset() {
        System.out.println("Performing factory reset.");
    }

    public void trackFitness() {
        System.out.println("Tracking steps and heart rate.");
    }
}


