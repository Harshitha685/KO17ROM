package com.xworkz.methodoverriding.sensor;

public class SensorRunner {
        public static void main(String[] args) {
            Sensor genericSensor = new Sensor();
            genericSensor.activate();
            genericSensor.readData();
            genericSensor.calibrate();
            genericSensor.deactivate();
            System.out.println();

            Sensor ts = new TemperatureSensor();
            ts.activate();
            ts.readData();
            ts.calibrate();
            ts.deactivate();
            System.out.println();

            TemperatureSensor tempSensor = new TemperatureSensor();
            tempSensor.activate();
            tempSensor.readData();
            tempSensor.calibrate();
            tempSensor.deactivate();
        }
    }


