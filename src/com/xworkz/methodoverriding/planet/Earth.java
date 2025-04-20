package com.xworkz.methodoverriding.planet;

public class Earth extends Planet {

    @Override
    public void name() {
        System.out.println("The third planet from the Sun.");
    }

    @Override
    public void type() {
        System.out.println("Rocky planet with a solid surface.");
    }

    @Override
    public void size() {
        System.out.println("Diameter of about 12,742 km.");
    }

    @Override
    public void atmosphere() {
        System.out.println("Atmosphere composed of 78% nitrogen, 21% oxygen, and other gases.");
    }

    public void water() {
        System.out.println("71% of Earth's surface is covered with water.");
    }

    public void life() {
        System.out.println("Supports a wide range of life forms.");
    }
}


