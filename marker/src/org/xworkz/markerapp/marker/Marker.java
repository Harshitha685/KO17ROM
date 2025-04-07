package org.xworkz.markerapp.marker;


    public class Marker {
        private String brand;
        private String color;
        private double price;
        private boolean isPermanent;
        private String tipType;
        private double length;
        private String inkType;

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

        public void setPrice(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public void setIsPermanent(boolean isPermanent) {
            this.isPermanent = isPermanent;
        }

        public boolean getIsPermanent() {
            return isPermanent;
        }

        public void setTipType(String tipType) {
            this.tipType = tipType;
        }

        public String getTipType() {
            return tipType;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getLength() {
            return length;
        }

        public void setInkType(String inkType) {
            this.inkType = inkType;
        }

        public String getInkType() {
            return inkType;
        }

    }