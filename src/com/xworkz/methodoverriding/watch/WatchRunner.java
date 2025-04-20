package com.xworkz.methodoverriding.watch;

public class WatchRunner {

        public static void main(String[] args) {
            Watch watch = new Watch();
            watch.showTime();
            watch.start();
            watch.stop();
            watch.reset();
            System.out.println();

            Watch sw = new SmartWatch();
            sw.showTime();
            sw.start();
            sw.stop();
            sw.reset();
            System.out.println();

            SmartWatch smart = new SmartWatch();
            smart.showTime();
            smart.start();
            smart.stop();
            smart.reset();
            smart.trackFitness();  // Unique method in SmartWatch
        }
    }


