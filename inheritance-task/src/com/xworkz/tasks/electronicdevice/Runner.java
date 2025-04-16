package com.xworkz.tasks.electronicdevice;

public class Runner {
    public static void main(String[] args) {
        ElectronicDevice device = new ElectronicDevice();
        device.restartDevice();
        device.updateSoftware();
        device.powerOn();
        device.powerOff();
        device.showSpecs();

        ElectronicDevice device2 = new Laptop();
        device2.restartDevice();
        device2.updateSoftware();
        device2.powerOn();
        device2.powerOff();
        device2.showSpecs();

        Laptop laptop = new Laptop();
        laptop.openIDE();
        laptop.compileCode();
        laptop.chargeBattery();
        laptop.showLaptopDetails();
        laptop.enableTouchPad();

        ElectronicDevice device1 = new Laptop();

        Laptop laptop1 =(Laptop) device1;
        System.out.println(laptop1);
    }
}
