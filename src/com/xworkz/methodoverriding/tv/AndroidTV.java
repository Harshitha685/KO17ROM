package com.xworkz.methodoverriding.tv;


public class AndroidTV extends TV {

    @Override
    public void display() {
        System.out.println("Displaying 4K HDR picture.");
    }

    @Override
    public void volumeControl() {
        System.out.println(" Adjusting volume using voice commands or remote.");
    }

    @Override
    public void remoteControl() {
        System.out.println(" Remote with touchpad, voice search, and shortcut buttons.");
    }

    @Override
    public void connectivity() {
        System.out.println("Supports Wi-Fi, Bluetooth, HDMI, USB, and Ethernet.");
    }

}


