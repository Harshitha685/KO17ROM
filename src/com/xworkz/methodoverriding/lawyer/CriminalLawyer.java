package com.xworkz.methodoverriding.lawyer;

public class CriminalLawyer extends Lawyer {

    @Override
    public void studyLaw() {
        System.out.println("Specializes in criminal law and penal code.");
    }

    @Override
    public void argueCase() {
        System.out.println("Argues in criminal court to defend or prosecute accused persons.");
    }

    @Override
    public void prepareDocuments() {
        System.out.println("Prepares FIR, charge sheets, and evidence reports.");
    }

    @Override
    public void giveLegalAdvice() {
        System.out.println("Advises clients on criminal cases and bail procedures.");
    }
}


