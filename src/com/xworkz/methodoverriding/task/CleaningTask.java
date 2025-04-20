package com.xworkz.methodoverriding.task;

    public class CleaningTask extends Task {

        @Override
        public void start() {
            System.out.println("Starting the cleaning task.");
        }

        @Override
        public void perform() {
            System.out.println("Cleaning in progress.");
        }

        @Override
        public void pause() {
            System.out.println("Pausing the cleaning.");
        }

        @Override
        public void complete() {
            System.out.println("Cleaning completed successfully.");
        }

        public void checkSupplies() {
            System.out.println("Checking cleaning supplies.");
        }
    }


