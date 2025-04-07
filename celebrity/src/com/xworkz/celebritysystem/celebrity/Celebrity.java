package com.xworkz.celebritysystem.celebrity;

public class Celebrity {

        private String name;
        private String profession;
        private int age;
        private String nationality;
        private double netWorth;
        private boolean isActive;
        private String knownFor;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setProfession(String profession) {
            this.profession = profession;
        }

        public String getProfession() {
            return profession;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setNationality(String nationality) {
            this.nationality = nationality;
        }

        public String getNationality() {
            return nationality;
        }

        public void setNetWorth(double netWorth) {
            this.netWorth = netWorth;
        }

        public double getNetWorth() {
            return netWorth;
        }

        public void setIsActive(boolean isActive) {
            this.isActive = isActive;
        }

        public boolean getIsActive() {
            return isActive;
        }

        public void setKnownFor(String knownFor) {
            this.knownFor = knownFor;
        }

        public String getKnownFor() {
            return knownFor;
        }
    }


