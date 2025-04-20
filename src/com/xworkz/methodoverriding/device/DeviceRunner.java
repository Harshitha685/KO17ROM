package com.xworkz.methodoverriding.device;

public class DeviceRunner {

        public static void main(String[] args) {


            Device device = new Device();
            device.brand();
            device.type();
            device.powerSource();
            device.features();
            System.out.println();

            Device smartDevice1 = new SmartDevice();
            smartDevice1.brand();
            smartDevice1.type();
            smartDevice1.powerSource();
            smartDevice1.features();
            System.out.println();

            SmartDevice smartDevice2 = new SmartDevice();
            smartDevice2.brand();
            smartDevice2.type();
            smartDevice2.powerSource();
            smartDevice2.features();

        }
    }


