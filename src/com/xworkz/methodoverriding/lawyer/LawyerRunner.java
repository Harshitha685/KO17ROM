package com.xworkz.methodoverriding.lawyer;

public class LawyerRunner {
        public static void main(String[] args) {
            Lawyer lawyer = new Lawyer();
            lawyer.studyLaw();
            lawyer.argueCase();
            lawyer.prepareDocuments();
            lawyer.giveLegalAdvice();
            System.out.println();

            Lawyer criminal1 = new CriminalLawyer();
            criminal1.studyLaw();
            criminal1.argueCase();
            criminal1.prepareDocuments();
            criminal1.giveLegalAdvice();
            System.out.println();

            CriminalLawyer criminal = new CriminalLawyer();
            criminal.studyLaw();
            criminal.argueCase();
            criminal.prepareDocuments();
            criminal.giveLegalAdvice();
        }
    }


