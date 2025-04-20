package com.xworkz.methodoverriding.clock;

public class ClockRunner {

        public static void main(String[] args) {
            Clock clock = new Clock();
            clock.showTime();
            clock.setAlarm();
            clock.start();
            clock.stop();
            System.out.println();

            Clock dig = new DigitalClock();
            dig.showTime();
            dig.setAlarm();
            dig.start();
            dig.stop();
            System.out.println();

            DigitalClock digital = new DigitalClock();
            digital.showTime();
            digital.setAlarm();
            digital.start();
            digital.stop();
            digital.showDate();
        }
    }


