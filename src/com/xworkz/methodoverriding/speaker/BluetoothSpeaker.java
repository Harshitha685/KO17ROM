package com.xworkz.methodoverriding.speaker;

public class BluetoothSpeaker extends Speaker {

    @Override
    public void powerOn() {
        System.out.println("Turning on and connecting to device.");
    }

    @Override
    public void powerOff() {
        System.out.println("Disconnecting and turning off.");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Boosting volume wirelessly.");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Reducing volume wirelessly.");
    }

    public void connectToBluetooth() {
        System.out.println("Searching and pairing with nearby devices.");
    }
}


