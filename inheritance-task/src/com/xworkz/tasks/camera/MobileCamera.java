package com.xworkz.tasks.camera;

public class MobileCamera extends Camera{

        public void applyFilter() {
            System.out.println("Applying filter on photo...");
        }

        public void enablePortraitMode() {
            System.out.println("Portrait mode enabled.");
        }

        public void enableHDR() {
            System.out.println("HDR mode activated.");
        }

        public void connectToCloud() {
            System.out.println("Syncing photos to cloud...");
        }

        public void useFaceDetection() {
            System.out.println("Detecting face for better focus...");
        }
    }


