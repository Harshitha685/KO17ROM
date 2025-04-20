package com.xworkz.methodoverriding.scanner;

public class DocumentScanner extends Scanner {

    @Override
    public void powerOn() {
        System.out.println("Turning on and initializing document feeder.");
    }

    @Override
    public void scan() {
        System.out.println("High-resolution scan of document in progress.");
    }

    @Override
    public void save() {
        System.out.println("Saving scanned document as PDF.");
    }

    @Override
    public void powerOff() {
        System.out.println("Shutting down after saving all files.");
    }

    public void emailScan() {
        System.out.println("Sending scanned document via email.");
    }
}


