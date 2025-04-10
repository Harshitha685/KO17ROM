package com.xworkz.tasks.document;

public class DocumentRunner {
    public static void main(String[] args) {
        Document document = new Document();
        document.saveDoc();
        document.deleteDoc();

        PDF pdf = new PDF();
        pdf.saveDoc();
        pdf.deleteDoc();
    }
}
