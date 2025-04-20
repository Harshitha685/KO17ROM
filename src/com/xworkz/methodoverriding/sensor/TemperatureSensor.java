package com.xworkz.methodoverriding.sensor;

public class TemperatureSensor extends Sensor {

    @Override
    public void activate() {
        System.out.println("Activating temperature measurement.");
    }

    @Override
    public void readData() {
        System.out.println("Reading temperature in Celsius.");
    }

    @Override
    public void calibrate() {
        System.out.println("Calibrating temperature readings.");
    }

    @Override
    public void deactivate() {
        System.out.println("Shutting down temperature sensor.");
    }
}


