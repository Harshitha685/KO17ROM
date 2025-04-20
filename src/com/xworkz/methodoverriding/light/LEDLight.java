package com.xworkz.methodoverriding.light;

public class LEDLight extends Light {

    @Override
    public void turnOn() {
        System.out.println("Turning on the LED light.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the LED light.");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Adjusting the LED brightness to 100%.");
    }

    @Override
    public void changeColor() {
        System.out.println("Changing LED light color to blue.");
    }
}


