package com.xworkz.simcardapp.simcard;

public class SimCard {

        private String provider;
        private String simType;
        private long number;
        private double balance;
        private boolean isActive;
        private String networkType;
        private String issuedState;

        public void setProvider(String provider) {
            this.provider = provider;
        }

        public String getProvider() {
            return provider;
        }

        public void setSimType(String simType) {
            this.simType = simType;
        }

        public String getSimType() {
            return simType;
        }

        public void setNumber(long number) {
            this.number = number;
        }

        public long getNumber() {
            return number;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }

        public void setIsActive(boolean isActive) {
            this.isActive = isActive;
        }

        public boolean getIsActive() {
            return isActive;
        }

        public void setNetworkType(String networkType) {
            this.networkType = networkType;
        }

        public String getNetworkType() {
            return networkType;
        }

        public void setIssuedState(String issuedState) {
            this.issuedState = issuedState;
        }

        public String getIssuedState() {
            return issuedState;
        }
    }


