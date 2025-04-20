package com.xworkz.methodoverriding.fan;

public class FanRunner {
        public static void main(String[] args) {

            Fan f = new Fan();
            f.brand();
            f.speed();
            f.type();
            f.powerConsumption();
            System.out.println();

            Fan cf1 = new CeilingFan();
            cf1.brand();
            cf1.speed();
            cf1.type();
            cf1.powerConsumption();
            System.out.println();

            CeilingFan cf2 = new CeilingFan();
            cf2.brand();
            cf2.speed();
            cf2.type();
            cf2.powerConsumption();
        }
    }


