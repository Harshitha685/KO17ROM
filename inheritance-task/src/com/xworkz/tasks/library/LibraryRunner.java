package com.xworkz.tasks.library;

public class LibraryRunner {
    public static void main(String[] args) {
        Library library = new Library();
        library.getLibraryName();
        library.openLibrary();
        library.issueBook();
        library.returnBook();
        library.displaySections();

        Library library2 = new DigitalLibrary();
        library2.getLibraryName();
        library2.openLibrary();
        library2.issueBook();
        library2.returnBook();
        library2.displaySections();

        DigitalLibrary digital = new DigitalLibrary();
        digital.accessEBook();
        digital.playAudioBook();
        digital.downloadPdf();
        digital.loginToPortal();
        digital.searchDigitalContent();

        Library library3 = new DigitalLibrary();
        DigitalLibrary digital1 = (DigitalLibrary) library3;
        System.out.println(digital1);
    }
}
