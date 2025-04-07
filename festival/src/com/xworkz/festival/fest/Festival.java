package com.xworkz.festival.fest;

public class Festival {

        private String name;
        private String month;
        private int duration;
        private boolean isNational;
        private String mainActivity;
        private boolean isReligious;
        private String famousFood;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public String getMonth() {
            return month;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public int getDuration() {
            return duration;
        }

        public void setIsNational(boolean isNational) {
            this.isNational = isNational;
        }

        public boolean getIsNational() {
            return isNational;
        }

        public void setMainActivity(String mainActivity) {
            this.mainActivity = mainActivity;
        }

        public String getMainActivity() {
            return mainActivity;
        }

        public void setIsReligious(boolean isReligious) {
            this.isReligious = isReligious;
        }

        public boolean getIsReligious() {
            return isReligious;
        }

        public void setFamousFood(String famousFood) {
            this.famousFood = famousFood;
        }

        public String getFamousFood() {
            return famousFood;
        }
    }


