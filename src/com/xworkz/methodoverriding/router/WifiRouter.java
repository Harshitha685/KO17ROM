package com.xworkz.methodoverriding.router;

public class WifiRouter extends Router {

    @Override
    public void powerOn() {
        System.out.println("Powering on and initializing wireless modules.");
    }

    @Override
    public void connect() {
        System.out.println("Connecting multiple wireless devices.");
    }

    @Override
    public void configureSettings() {
        System.out.println("Configuring SSID, password, and firewall.");
    }

    @Override
    public void powerOff() {
        System.out.println("Shutting down wireless and wired connections.");
    }

    public void showConnectedDevices() {
        System.out.println("Displaying all connected devices.");
    }
}


