package com.xworkz.mattressapp.mattress;

public class Mattress {

        private String brand;
        private String size;
        private double thickness;
        private String materialType;
        private boolean isOrthopedic;
        private double weight;
        private double price;

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getBrand() {
            return brand;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getSize() {
            return size;
        }

        public void setThickness(double thickness) {
            this.thickness = thickness;
        }

        public double getThickness() {
            return thickness;
        }

        public void setMaterialType(String materialType) {
            this.materialType = materialType;
        }

        public String getMaterialType() {
            return materialType;
        }

        public void setIsOrthopedic(boolean isOrthopedic) {
            this.isOrthopedic = isOrthopedic;
        }

        public boolean getIsOrthopedic() {
            return isOrthopedic;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public double getWeight() {
            return weight;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }


