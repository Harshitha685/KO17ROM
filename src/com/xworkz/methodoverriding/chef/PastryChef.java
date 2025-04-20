package com.xworkz.methodoverriding.chef;

public class PastryChef extends Chef {

    @Override
    public void cook() {
        System.out.println("Bakes cakes, cookies, and desserts.");
    }

    @Override
    public void prepareIngredients() {
        System.out.println("Measures flour, sugar, and mixes them.");
    }

    @Override
    public void cleanKitchen() {
        System.out.println("Cleans baking trays and counters.");
    }

    @Override
    public void serveFood() {
        System.out.println("Presents desserts in a decorative way.");
    }
}



