package com.xworkz.methodoverriding.items;

public class GiftItem extends Item {

    @Override
    public void name() {
        System.out.println("Chocolate Box.");
    }

    @Override
    public void price() {
        System.out.println("Rs.499.");
    }

    @Override
    public void type() {
        System.out.println("Personalized and decorative.");
    }

    @Override
    public void packaging() {
        System.out.println("Wrapped with ribbon and greeting card.");
    }
}


