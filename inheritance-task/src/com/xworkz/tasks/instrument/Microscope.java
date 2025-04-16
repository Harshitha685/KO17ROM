package com.xworkz.tasks.instrument;

public class Microscope extends Instrument {

    public void startScan() {
        System.out.println("Scan started...");
    }

    public void stopScan() {
        System.out.println("Scan stopped.");
    }
    public void adjustFocus() {
        System.out.println("Focus adjusted to level: ");
    }

    public void adjustZoom() {
        System.out.println("Zoom adjusted to level: ");
    }
    public void collectData(){
        System.out.println("Data collected");
    }
}
