package com.xworkz.methodoverriding.worker;

public class ConstructionWorker extends Worker {

    @Override
    public void workType() {
        System.out.println("Engaged in building infrastructure.");
    }

    @Override
    public void shift() {
        System.out.println("Usually works during daylight hours.");
    }

    @Override
    public void toolsUsed() {
        System.out.println("Uses hammers, drills, saws, and protective gear.");
    }

    public void location() {
        System.out.println("Works on sites like roads, bridges, and buildings.");
    }


}


