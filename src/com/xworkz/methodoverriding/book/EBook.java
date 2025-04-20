package com.xworkz.methodoverriding.book;

public class EBook extends Book {

    @Override
    public void open() {
        System.out.println("Opening the e-book on the device.");
    }

    @Override
    public void read() {
        System.out.println("Reading the e-book on the screen.");
    }

    @Override
    public void close() {
        System.out.println("Closing the e-book on the device.");
    }

    @Override
    public void bookmark() {
        System.out.println("Bookmarking the page in the e-book.");
    }
}


