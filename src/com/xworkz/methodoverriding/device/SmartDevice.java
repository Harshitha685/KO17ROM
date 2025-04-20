package com.xworkz.methodoverriding.device;

public class SmartDevice extends Device {

    @Override
    public void brand() {
        System.out.println("SmartDevice: Apple, Samsung, Google.");
    }

    @Override
    public void type() {
        System.out.println("Smartphone, Smartwatch, Smart Speaker.");
    }

    @Override
    public void powerSource() {
        System.out.println("Powered by rechargeable battery.");
    }

    @Override
    public void features() {
        System.out.println("Touchscreen, internet connectivity, apps, voice assistant.");
    }


}


