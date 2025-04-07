package com.xworkz.granitesystem;

import com.xworkz.granitesystem.granite.Granite;

public class GraniteRunner {
    public static void main(String[] args) {


        Granite g1 = new Granite();
        g1.setBrand("Kajaria");
        g1.setColor("Black");
        g1.setGrade("Premium");
        g1.setOriginCountry("India");
        g1.setLength(240.0);
        g1.setWidth(120.0);
        g1.setIsHeatResistant(true);

        String brand1 = g1.getBrand();
        String color1 = g1.getColor();
        String grade1 = g1.getGrade();
        String origin1 = g1.getOriginCountry();
        double length1 = g1.getLength();
        double width1 = g1.getWidth();
        boolean heat1 = g1.getIsHeatResistant();

        System.out.println("Granite Brand: " + brand1);
        System.out.println("Color: " + color1);
        System.out.println("Grade: " + grade1);
        System.out.println("Origin Country: " + origin1);
        System.out.println("Length: " + length1);
        System.out.println("Width: " + width1);
        System.out.println("Is Heat Resistant: " + heat1);
        System.out.println();

        Granite g2 = new Granite();
        g2.setBrand("R K Stones");
        g2.setColor("Grey");
        g2.setGrade("Commercial");
        g2.setOriginCountry("Brazil");
        g2.setLength(230.5);
        g2.setWidth(115.0);
        g2.setIsHeatResistant(false);

        String brand2 = g2.getBrand();
        String color2 = g2.getColor();
        String grade2 = g2.getGrade();
        String origin2 = g2.getOriginCountry();
        double length2 = g2.getLength();
        double width2 = g2.getWidth();
        boolean heat2 = g2.getIsHeatResistant();

        System.out.println("Granite Brand: " + brand2);
        System.out.println("Color: " + color2);
        System.out.println("Grade: " + grade2);
        System.out.println("Origin Country: " + origin2);
        System.out.println("Length: " + length2 + "cm");
        System.out.println("Width: " + width2 + "cm");
        System.out.println("Is Heat Resistant: " + heat2);
        System.out.println();

        Granite g3 = new Granite();
        g3.setBrand("A-Class Marbles");
        g3.setColor("White");
        g3.setGrade("Premium");
        g3.setOriginCountry("Vietnam");
        g3.setLength(250.0);
        g3.setWidth(130.0);
        g3.setIsHeatResistant(true);

        String brand3 = g3.getBrand();
        String color3 = g3.getColor();
        String grade3 = g3.getGrade();
        String origin3 = g3.getOriginCountry();
        double length3 = g3.getLength();
        double width3 = g3.getWidth();
        boolean heat3 = g3.getIsHeatResistant();

        System.out.println("Granite Brand: " + brand3);
        System.out.println("Color: " + color3);
        System.out.println("Grade: " + grade3);
        System.out.println("Origin Country: " + origin3);
        System.out.println("Length: " + length3 + "cm");
        System.out.println("Width: " + width3 + "cm");
        System.out.println("Is Heat Resistant: " + heat3);
        System.out.println();

        Granite g4 = new Granite();
        g4.setBrand("Classic Surfaces");
        g4.setColor("Green");
        g4.setGrade("Standard");
        g4.setOriginCountry("China");
        g4.setLength(210.0);
        g4.setWidth(110.0);
        g4.setIsHeatResistant(false);

        String brand4 = g4.getBrand();
        String color4 = g4.getColor();
        String grade4 = g4.getGrade();
        String origin4 = g4.getOriginCountry();
        double length4 = g4.getLength();
        double width4 = g4.getWidth();
        boolean heat4 = g4.getIsHeatResistant();

        System.out.println("Granite Brand: " + brand4);
        System.out.println("Color: " + color4);
        System.out.println("Grade: " + grade4);
        System.out.println("Origin Country: " + origin4);
        System.out.println("Length: " + length4 + "cm");
        System.out.println("Width: " + width4 + "cm");
        System.out.println("Is Heat Resistant: " + heat4);
        System.out.println();

        Granite g5 = new Granite();
        g5.setBrand("Global Granites");
        g5.setColor("Brown");
        g5.setGrade("Commercial");
        g5.setOriginCountry("Spain");
        g5.setLength(225.0);
        g5.setWidth(125.0);
        g5.setIsHeatResistant(true);

        String brand5 = g5.getBrand();
        String color5 = g5.getColor();
        String grade5 = g5.getGrade();
        String origin5 = g5.getOriginCountry();
        double length5 = g5.getLength();
        double width5 = g5.getWidth();
        boolean heat5 = g5.getIsHeatResistant();

        System.out.println("Granite Brand: " + brand5);
        System.out.println("Color: " + color5);
        System.out.println("Grade: " + grade5);
        System.out.println("Origin Country: " + origin5);
        System.out.println("Length: " + length5 + "cm");
        System.out.println("Width: " + width5 + "cm");
        System.out.println("Is Heat Resistant: " + heat5);
        System.out.println();

    }
}