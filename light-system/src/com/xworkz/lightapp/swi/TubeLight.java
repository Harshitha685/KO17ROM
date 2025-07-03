package com.xworkz.lightapp.swi;

public class TubeLight implements Switch{

    @Override
    public void on() {
        System.out.println("Tubelight is on");
    }

    @Override
    public void off() {
        System.out.println("Tubelight is off");
    }

    @Override
    public void threeWay() {
        System.out.println("ThreeWay tubelight is enabled");

    }
}
