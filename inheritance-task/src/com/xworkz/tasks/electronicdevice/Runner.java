package com.xworkz.tasks.electronicdevice;

public class Runner {
    public static void main(String[] args) {
        ElectronicDevice device = new ElectronicDevice();
        device.restartDevice();
        device.updateSoftware();

        Laptop laptop = new Laptop();
        laptop.restartDevice();
        laptop.updateSoftware();

        ElectronicDevice device1 = new Laptop();

        Laptop laptop1 =(Laptop) device1;
        System.out.println(laptop1);
    }
}
