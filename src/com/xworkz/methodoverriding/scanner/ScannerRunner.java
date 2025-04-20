package com.xworkz.methodoverriding.scanner;

public class ScannerRunner {
        public static void main(String[] args) {
            Scanner basicScanner = new Scanner();
            basicScanner.powerOn();
            basicScanner.scan();
            basicScanner.save();
            basicScanner.powerOff();
            System.out.println();

            Scanner doc = new DocumentScanner();
            doc.powerOn();
            doc.scan();
            doc.save();
            doc.powerOff();
            System.out.println();

            DocumentScanner docScanner = new DocumentScanner();
            docScanner.powerOn();
            docScanner.scan();
            docScanner.save();
            docScanner.powerOff();
            docScanner.emailScan(); // Unique method in child
        }
    }


