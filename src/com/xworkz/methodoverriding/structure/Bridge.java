package com.xworkz.methodoverriding.structure;

public class Bridge extends Structure {

    @Override
    public void materialUsed() {
        System.out.println("Made of reinforced concrete and steel cables.");
    }

    @Override
    public void purpose() {
        System.out.println("Used to connect two places across a river or valley.");
    }

    @Override
    public void height() {
        System.out.println("Typically 30 meters above ground or water.");
    }

    @Override
    public void design() {
        System.out.println("Designed as a suspension or arch structure.");
    }


}
