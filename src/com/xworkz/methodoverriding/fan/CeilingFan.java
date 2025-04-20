package com.xworkz.methodoverriding.fan;

public class CeilingFan extends Fan {

    @Override
    public void brand() {
        System.out.println("Havells brand.");
    }

    @Override
    public void speed() {
        System.out.println("Runs at 5 adjustable speeds.");
    }

    @Override
    public void type() {
        System.out.println("Fixed on the ceiling with remote control.");
    }

    @Override
    public void powerConsumption() {
        System.out.println("Consumes 50 watts, energy efficient.");
    }
}


