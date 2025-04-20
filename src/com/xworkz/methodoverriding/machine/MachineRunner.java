package com.xworkz.methodoverriding.machine;

public class MachineRunner {
        public static void main(String[] args) {


            Machine machine = new Machine();
            machine.start();
            machine.run();
            machine.maintain();
            machine.stop();
            System.out.println();

            Machine wm1 = new WashingMachine();
            wm1.start();
            wm1.run();
            wm1.maintain();
            wm1.stop();
            System.out.println();

            WashingMachine wm2 = new WashingMachine();
            wm2.start();
            wm2.run();
            wm2.maintain();
            wm2.stop();
        }
    }


