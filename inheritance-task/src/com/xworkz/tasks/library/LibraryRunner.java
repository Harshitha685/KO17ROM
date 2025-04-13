package com.xworkz.tasks.library;

public class LibraryRunner {
    public static void main(String[] args) {
        Library library = new Library();
        library.libraryName();
        library.libraryType();

        DigitalLibrary digitalLibrary = new DigitalLibrary();
        digitalLibrary.libraryName();
        digitalLibrary.libraryType();

        Library library1 = new DigitalLibrary();

        DigitalLibrary digitalLibrary1 = (DigitalLibrary) library1;
        System.out.println(digitalLibrary1);
    }
}
