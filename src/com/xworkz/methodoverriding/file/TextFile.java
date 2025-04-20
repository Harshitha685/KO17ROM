package com.xworkz.methodoverriding.file;

public class TextFile extends File {

    @Override
    public void open() {
        System.out.println("Opening the text file.");
    }

    @Override
    public void read() {
        System.out.println("Reading content from the text file.");
    }

    @Override
    public void write() {
        System.out.println("Writing content to the text file.");
    }

    @Override
    public void close() {
        System.out.println("Closing the text file.");
    }

    public void search() {
        System.out.println("Searching text within the file.");
    }
}


