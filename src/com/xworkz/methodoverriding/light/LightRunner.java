package com.xworkz.methodoverriding.light;

public class LightRunner {
        public static void main(String[] args) {
            Light light = new Light();
            light.turnOn();
            light.turnOff();
            light.adjustBrightness();
            light.changeColor();
            System.out.println();

            Light lt = new LEDLight();
            lt.turnOn();
            lt.turnOff();
            lt.adjustBrightness();
            lt.changeColor();
            System.out.println();

            LEDLight ledLight = new LEDLight();
            ledLight.turnOn();
            ledLight.turnOff();
            ledLight.adjustBrightness();
            ledLight.changeColor();
        }
    }


