package org.xworkz.mobilecaseapp.mobilecase;

public class MobileCase {

        private String company;
        private String caseType;
        private String texture;
        private double thickness;
        private boolean isShockProof;
        private String modelName;
        private double cost;

        public void setCompany(String company) {
            this.company = company;
        }

        public String getCompany() {
            return company;
        }

        public void setCaseType(String caseType) {
            this.caseType = caseType;
        }

        public String getCaseType() {
            return caseType;
        }

        public void setTexture(String texture) {
            this.texture = texture;
        }

        public String getTexture() {
            return texture;
        }

        public void setThickness(double thickness) {
            this.thickness = thickness;
        }

        public double getThickness() {
            return thickness;
        }

        public void setIsShockProof(boolean isShockProof) {
            this.isShockProof = isShockProof;
        }

        public boolean getIsShockProof() {
            return isShockProof;
        }

        public void setModelName(String modelName) {
            this.modelName = modelName;
        }

        public String getModelName() {
            return modelName;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

        public double getCost() {
            return cost;
        }
    }


