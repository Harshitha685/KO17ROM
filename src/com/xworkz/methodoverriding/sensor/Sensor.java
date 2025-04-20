package com.xworkz.methodoverriding.sensor;

public class Sensor {

        public void activate() {
            System.out.println("Activating the sensor.");
        }

        public void readData() {
            System.out.println("Reading generic sensor data.");
        }

        public void calibrate() {
            System.out.println("Calibrating the sensor.");
        }

        public void deactivate() {
            System.out.println("Deactivating the sensor.");
        }
    }


