package com.xworkz.tasks.document;

public class DocumentRunner {
    public static void main(String[] args) {
        Document document = new Document();
        document.saveDoc();
        document.deleteDoc();
        document.openDocument();
        document.editContent();
        document.printDocument();

        Document document2 = new PDF();
        document2.saveDoc();
        document2.deleteDoc();
        document2.openDocument();
        document2.editContent();
        document2.printDocument();

        PDF pdf = new PDF();
        pdf.encryptPDF();
        pdf.addDigitalSignature();
        pdf.compressPDF();
        pdf.convertToWord();
        pdf.mergeWithAnotherPDF();

        Document document1 = new PDF();

        PDF pdf1 = (PDF) document1;
        System.out.println(pdf1);
    }
}
