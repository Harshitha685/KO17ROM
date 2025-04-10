package com.xworkz.tasks.electronicdevice;

public class Runner {
    public static void main(String[] args) {
        ElectronicDevice device = new ElectronicDevice();
        device.restartDevice();
        device.updateSoftware();

        Laptop laptop = new Laptop();
        laptop.restartDevice();
        laptop.updateSoftware();
    }
}
