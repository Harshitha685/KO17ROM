package com.xworkz.tasks.plastic;

public class PlasticRunner {
    public static void main(String[] args) {


    Plastic plastic = new Plastic();
    plastic.validatePlasticDetails();
    plastic.getPlasticInfo();

    Bottle bottle = new Bottle();
    bottle.validatePlasticDetails();
    bottle.getPlasticInfo();


    }
}
