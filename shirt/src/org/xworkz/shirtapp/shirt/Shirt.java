package org.xworkz.shirtapp.shirt;

public class Shirt {
    private String brand;
    private String color;
    private String size;
    private String fabric;
    private double price;
    private boolean isFullSleve;
    private String pattern;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public String getFabric() {
        return fabric;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setIsFullSleve(boolean isFullSleve) {
       this.isFullSleve = isFullSleve;
    }

    public boolean getIsFullSleve(){
        return isFullSleve;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }
}
