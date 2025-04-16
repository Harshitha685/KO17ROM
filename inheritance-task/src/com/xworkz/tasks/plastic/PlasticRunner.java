package com.xworkz.tasks.plastic;

public class PlasticRunner {
    public static void main(String[] args) {
        Plastic plastic = new Plastic();
        plastic.plasticType();
        plastic.plasticColor();
        plastic.plasticDensity();
        plastic.isRecyclable();
        plastic.usage();

        System.out.println("--------------------------");

        Plastic plastic2 = new Bottle();
        plastic2.plasticType();
        plastic2.plasticColor();
        plastic2.plasticDensity();
        plastic2.isRecyclable();
        plastic2.usage();

        System.out.println("--------------------------");

        Bottle bottle = new Bottle();
        bottle.bottleType();
        bottle.bottleCapacity();
        bottle.isReusable();
        bottle.bottleMaterial();
        bottle.bottleShape();

        System.out.println("--------------------------");

        Plastic plastic3 = new Bottle();
        Bottle bottle2 = (Bottle) plastic3;
        System.out.println(bottle2);
    }
}
