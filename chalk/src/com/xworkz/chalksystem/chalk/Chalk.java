package com.xworkz.chalksystem.chalk;

public class Chalk {

        private String brand;
        private String color;
        private double length;
        private double diameter;
        private boolean isDustless;
        private String packagingType;
        private double price;

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

        public void setLength(double length) {
            this.length = length;
        }

        public double getLength() {
            return length;
        }

        public void setDiameter(double diameter) {
            this.diameter = diameter;
        }

        public double getDiameter() {
            return diameter;
        }

        public void setIsDustless(boolean isDustless) {
            this.isDustless = isDustless;
        }

        public boolean getIsDustless() {
            return isDustless;
        }

        public void setPackagingType(String packagingType) {
            this.packagingType = packagingType;
        }

        public String getPackagingType() {
            return packagingType;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }


