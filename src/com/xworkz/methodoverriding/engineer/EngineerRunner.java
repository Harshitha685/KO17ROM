package com.xworkz.methodoverriding.engineer;

public class EngineerRunner {
        public static void main(String[] args) {

            Engineer engineer = new Engineer();
            engineer.field();
            engineer.work();
            engineer.toolsUsed();
            engineer.education();
            System.out.println();

            Engineer software1 = new SoftwareEngineer();
            software1.field();
            software1.work();
            software1.toolsUsed();
            software1.education();
            System.out.println();

            SoftwareEngineer software2 = new SoftwareEngineer();
            software2.field();
            software2.work();
            software2.toolsUsed();
            software2.education();
            software2.programmingLanguages();
    }

}
