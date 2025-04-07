package com.xworkz.watertanksystem.watertank;

public class WaterTank {

        private String brand;
        private int capacity; // in liters
        private String material;
        private String color;
        private double height; // in feet
        private boolean isInsulated;
        private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setIsInsulated(boolean isInsulated) {
        this.isInsulated = isInsulated;
    }

    public boolean getIsInsulated() {
        return isInsulated;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

}


