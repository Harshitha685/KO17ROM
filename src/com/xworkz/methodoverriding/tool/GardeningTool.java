package com.xworkz.methodoverriding.tool;

public class GardeningTool extends Tool {

    @Override
    public void use() {
        System.out.println("Using the tool for planting and trimming.");
    }

    @Override
    public void maintain() {
        System.out.println("Oiling and sharpening the gardening tool.");
    }

    @Override
    public void store() {
        System.out.println("Hanging in the garden shed.");
    }

    @Override
    public void inspect() {
        System.out.println("Checking for rust and wear.");
    }

    public void waterPlants() {
        System.out.println("Watering plants using a watering can.");
    }
}


