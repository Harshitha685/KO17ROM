package com.xworkz.rulesapp.rules;

public abstract class KeralaState extends KarnatakaState{
    @Override
    public void nationalHealthMission() {
        System.out.println("to strengthen health infrastructure and improve access to healthcare services, including implementing various health programs");
    }

    @Override
    public void pradhanMantriAwasYojana() {
        System.out.println(" focuses on providing affordable housing for the economically weaker sections of society. ");
    }

    @Override
    public void skillIndiaMission() {
        System.out.println("aims to improve the skills of the workforce to make them more employable.");
    }

    @Override
    public void cleanIndiaMission() {
        System.out.println("This mission focuses on promoting cleanliness and sanitation across the country. ");
    }

    @Override
    public void nationalFoodSecurityAct() {
        System.out.println("This act aims to provide subsidized food grains to a large section of the population.");
    }
}
