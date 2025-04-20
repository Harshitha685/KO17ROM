package com.xworkz.methodoverriding.meal;
public class DinnerMeal extends Meal {

    @Override
    public void prepare() {
        System.out.println("Cooking a full-course dinner.");
    }

    @Override
    public void serve() {
        System.out.println("Serving dinner with side dishes and dessert.");
    }

    @Override
    public void eat() {
        System.out.println("Enjoying dinner with family.");
    }

    @Override
    public void cleanUp() {
        System.out.println("Washing dishes and cleaning the dining area.");
    }

    public void lightCandles() {
        System.out.println("Lighting candles for a cozy dinner vibe.");
    }
}


