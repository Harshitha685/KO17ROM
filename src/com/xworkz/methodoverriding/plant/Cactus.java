package com.xworkz.methodoverriding.plant;

public class Cactus extends Plant {

    @Override
    public void grow() {
        System.out.println("Growing slowly in dry conditions.");
    }

    @Override
    public void photosynthesize() {
        System.out.println("Photosynthesizing using its stem.");
    }

    @Override
    public void absorbWater() {
        System.out.println("Storing water for long periods.");
    }

    @Override
    public void reproduce() {
        System.out.println("Reproducing through seeds and cuttings.");
    }

    public void protectWithSpines() {
        System.out.println("Protecting itself with sharp spines.");
    }
}



