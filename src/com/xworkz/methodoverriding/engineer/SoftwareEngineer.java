package com.xworkz.methodoverriding.engineer;

public class SoftwareEngineer extends Engineer {

    @Override
    public void field() {
        System.out.println("Specializes in software development and technology.");
    }

    @Override
    public void work() {
        System.out.println("Writes, tests, and maintains code for applications.");
    }

    @Override
    public void toolsUsed() {
        System.out.println("Uses IDEs, version control systems, and debugging tools.");
    }

    @Override
    public void education() {
        System.out.println("Holds a degree in Computer Science or related field.");
    }

    public void programmingLanguages() {
        System.out.println("Works with Java, Python, C++, etc.");
    }
}


