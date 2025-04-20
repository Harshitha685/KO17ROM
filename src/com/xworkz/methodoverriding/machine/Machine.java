package com.xworkz.methodoverriding.machine;

public class Machine {
        public void start() {
            System.out.println("Starting the machine...");
        }

        public void stop() {
            System.out.println("Stopping the machine...");
        }

        public void run() {
            System.out.println("Running at default speed.");
        }

        public void maintain() {
            System.out.println("Maintenance required every 6 months.");
        }
    }


