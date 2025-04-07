package com.xworkz.defenceapp.defence;

public class Defence {

        private String country;
        private String branch;
        private int strength;
        private String headquarters;
        private boolean isNuclearCapable;
        private double annualBudget;
        private String commanderInChief;

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCountry() {
            return country;
        }

        public void setBranch(String branch) {
            this.branch = branch;
        }

        public String getBranch() {
            return branch;
        }

        public void setStrength(int strength) {
            this.strength = strength;
        }

        public int getStrength() {
            return strength;
        }

        public void setHeadquarters(String headquarters) {
            this.headquarters = headquarters;
        }

        public String getHeadquarters() {
            return headquarters;
        }

        public void setIsNuclearCapable(boolean isNuclearCapable) {
            this.isNuclearCapable = isNuclearCapable;
        }

        public boolean getIsNuclearCapable() {
            return isNuclearCapable;
        }

        public void setAnnualBudget(double annualBudget) {
            this.annualBudget = annualBudget;
        }

        public double getAnnualBudget() {
            return annualBudget;
        }

        public void setCommanderInChief(String commanderInChief) {
            this.commanderInChief = commanderInChief;
        }

        public String getCommanderInChief() {
            return commanderInChief;
        }
    }


