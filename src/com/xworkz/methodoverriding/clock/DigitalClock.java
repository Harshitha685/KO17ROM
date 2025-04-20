package com.xworkz.methodoverriding.clock;
public class DigitalClock extends Clock {

    @Override
    public void showTime() {
        System.out.println("Displaying digital time in HH:MM format.");
    }

    @Override
    public void setAlarm() {
        System.out.println("Alarm set with sound and vibration.");
    }

    @Override
    public void start() {
        System.out.println("Powering on with LED display.");
    }

    @Override
    public void stop() {
        System.out.println("Shutting down digital display.");
    }

    public void showDate() {
        System.out.println("Displaying today's date.");
    }
}


