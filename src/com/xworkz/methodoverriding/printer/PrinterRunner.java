package com.xworkz.methodoverriding.printer;

public class PrinterRunner {
        public static void main(String[] args) {

            Printer p = new Printer();
            p.brand();
            p.printType();
            p.speed();
            p.resolution();
            System.out.println();

            Printer lp1 = new LaserPrinter();
            lp1.brand();
            lp1.printType();
            lp1.speed();
            lp1.resolution();
            System.out.println();

            LaserPrinter lp2 = new LaserPrinter();
            lp2.brand();
            lp2.printType();
            lp2.speed();
            lp2.resolution();
        }
    }


