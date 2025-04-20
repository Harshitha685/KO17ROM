package com.xworkz.methodoverriding.festival;

public class DiwaliFestival extends Festival {

    @Override
    public void name() {
        System.out.println("DiwaliFestival: Diwali - The Festival of Lights.");
    }

    @Override
    public void season() {
        System.out.println("DiwaliFestival: Celebrated in Autumn (October-November).");
    }

    @Override
    public void tradition() {
        System.out.println("DiwaliFestival: Lighting diyas, Lakshmi puja, and fireworks.");
    }

    @Override
    public void celebration() {
        System.out.println("DiwaliFestival: Homes decorated, sweets distributed, and gifts exchanged.");
    }
}


