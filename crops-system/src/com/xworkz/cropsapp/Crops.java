package com.xworkz.cropsapp;

public class Crops {

        private String cropName;
        private String cropType;
        private String season;
        private String soilType;
        private double yieldPerAcre;
        private boolean isOrganic;
        private double marketPrice;

        public void setCropName(String cropName) {
            this.cropName = cropName;
        }

        public String getCropName() {
            return cropName;
        }

        public void setCropType(String cropType) {
            this.cropType = cropType;
        }

        public String getCropType() {
            return cropType;
        }

        public void setSeason(String season) {
            this.season = season;
        }

        public String getSeason() {
            return season;
        }

        public void setSoilType(String soilType) {
            this.soilType = soilType;
        }

        public String getSoilType() {
            return soilType;
        }

        public void setYieldPerAcre(double yieldPerAcre) {
            this.yieldPerAcre = yieldPerAcre;
        }

        public double getYieldPerAcre() {
            return yieldPerAcre;
        }

        public void setIsOrganic(boolean isOrganic) {
            this.isOrganic = isOrganic;
        }

        public boolean getIsOrganic() {
            return isOrganic;
        }

        public void setMarketPrice(double marketPrice) {
            this.marketPrice = marketPrice;
        }

        public double getMarketPrice() {
            return marketPrice;
        }
    }


