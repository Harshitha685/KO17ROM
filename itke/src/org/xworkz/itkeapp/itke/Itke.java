package org.xworkz.itkeapp.itke;

public class Itke {

        private String shape;
        private String usage;
        private String grade;
        private double thermalResistance;
        private boolean isEcoFriendly;
        private String manufacturer;
        private double costPerBrick;

        // Setters
        public void setShape(String shape) {
            this.shape = shape;
        }

        public String getShape() {
            return shape;
        }

        public void setUsage(String usage) {
            this.usage = usage;
        }

        public String getUsage() {
            return usage;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public String getGrade() {
            return grade;
        }


    public void setThermalResistance(double thermalResistance) {
            this.thermalResistance = thermalResistance;
        }

    public double getThermalResistance() {
        return thermalResistance;
    }

        public void setIsEcoFriendly(boolean isEcoFriendly) {
            this.isEcoFriendly = isEcoFriendly;
        }

        public boolean getIsEcoFriendly() {
            return isEcoFriendly;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setCostPerBrick(double costPerBrick) {
            this.costPerBrick = costPerBrick;
        }


        public double getCostPerBrick() {
            return costPerBrick;
        }
    }


