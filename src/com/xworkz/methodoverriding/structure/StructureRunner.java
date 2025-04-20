package com.xworkz.methodoverriding.structure;

public class StructureRunner {
        public static void main(String[] args) {


            Structure s = new Structure();
            s.materialUsed();
            s.purpose();
            s.height();
            s.design();
            System.out.println();

            Structure sRef = new Bridge();
            sRef.materialUsed();
            sRef.purpose();
            sRef.height();
            sRef.design();
            System.out.println();

            Bridge b = new Bridge();
            b.materialUsed();
            b.purpose();
            b.height();
            b.design();

        }
    }


