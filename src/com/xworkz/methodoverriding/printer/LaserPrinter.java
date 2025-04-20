package com.xworkz.methodoverriding.printer;

public class LaserPrinter extends Printer {

    @Override
    public void brand() {
        System.out.println("HP LaserJet Pro.");
    }

    @Override
    public void printType() {
        System.out.println("Black and white laser printing.");
    }

    @Override
    public void speed() {
        System.out.println("Prints 25 pages per minute.");
    }

    @Override
    public void resolution() {
        System.out.println("1200 x 1200 dpi high resolution.");
    }
}


