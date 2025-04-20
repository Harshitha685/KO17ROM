package com.xworkz.methodoverriding.machine;

public class WashingMachine extends Machine {

    @Override
    public void start() {
        System.out.println("Starting wash cycle...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping and draining water...");
    }

    @Override
    public void run() {
        System.out.println("Running spin and rinse cycles.");
    }

    @Override
    public void maintain() {
        System.out.println("Clean drum and check filter monthly.");
    }
}


