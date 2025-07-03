package com.xworkz.lightapp.swi;

public class Cfl implements Switch{
    @Override
    public void on() {
        System.out.println("CFLlight is on");
    }

    @Override
    public void off() {
        System.out.println("CFLlight is off");

    }

    @Override
    public void threeWay() {
        System.out.println("Three way CFLlight is enabled");

    }
}
