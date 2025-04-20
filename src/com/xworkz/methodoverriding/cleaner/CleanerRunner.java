package com.xworkz.methodoverriding.cleaner;

public class CleanerRunner {
        public static void main(String[] args) {
            Cleaner cleaner = new Cleaner();
            cleaner.turnOn();
            cleaner.clean();
            cleaner.turnOff();
            cleaner.maintain();
            System.out.println();

            Cleaner vc = new VaccumCleaner();
            vc.turnOn();
            vc.clean();
            vc.turnOff();
            vc.maintain();
            System.out.println();

            VaccumCleaner vacuum = new VaccumCleaner();
            vacuum.turnOn();
            vacuum.clean();
            vacuum.turnOff();
            vacuum.maintain();
            vacuum.adjustSuction();  // Specific to VacuumCleaner
        }
    }


