package com.xworkz.granitesystem.granite;

public class Granite {

        private String brand;
        private String color;
        private String grade;
        private String originCountry;
        private double length;
        private double width;
        private boolean isHeatResistant;

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

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
            return grade;
        }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getOriginCountry() {
            return originCountry;
        }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
            return length;
        }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
            return width;
        }

    public void setIsHeatResistant(boolean heatResistant) {
        isHeatResistant = heatResistant;
    }

    public boolean getIsHeatResistant() {
            return isHeatResistant;
        }
    }


