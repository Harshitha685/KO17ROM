package com.xworkz.chalksystem;

import com.xworkz.chalksystem.chalk.Chalk;

public class ChalkRunner {

        public static void main(String[] args) {
            Chalk ref1 = new Chalk();
            ref1.setBrand("WhiteGlow");
            ref1.setColor("White");
            ref1.setLength(7.5);
            ref1.setDiameter(1.2);
            ref1.setIsDustless(true);
            ref1.setPackagingType("Box");
            ref1.setPrice(45.75);

            String brand1 = ref1.getBrand();
            String color1 = ref1.getColor();
            double length1 = ref1.getLength();
            double diameter1 = ref1.getDiameter();
            boolean dustless1 = ref1.getIsDustless();
            String packaging1 = ref1.getPackagingType();
            double price1 = ref1.getPrice();

            System.out.println("Chalk Brand         : " + brand1);
            System.out.println("Chalk Color         : " + color1);
            System.out.println("Chalk Length        : " + length1 + " cm");
            System.out.println("Chalk Diameter      : " + diameter1 + " cm");
            System.out.println("Is Dustless         : " + dustless1);
            System.out.println("Packaging Type      : " + packaging1);
            System.out.println("Chalk Price         : ₹" + price1);
            System.out.println();

            Chalk ref2 = new Chalk();
            ref2.setBrand("DustFree");
            ref2.setColor("Yellow");
            ref2.setLength(8.0);
            ref2.setDiameter(1.0);
            ref2.setIsDustless(true);
            ref2.setPackagingType("Pouch");
            ref2.setPrice(39.00);

            System.out.println("Chalk Brand         : " + ref2.getBrand());
            System.out.println("Chalk Color         : " + ref2.getColor());
            System.out.println("Chalk Length        : " + ref2.getLength() + " cm");
            System.out.println("Chalk Diameter      : " + ref2.getDiameter() + " cm");
            System.out.println("Is Dustless         : " + ref2.getIsDustless());
            System.out.println("Packaging Type      : " + ref2.getPackagingType());
            System.out.println("Chalk Price         : ₹" + ref2.getPrice());
            System.out.println();

            Chalk ref3 = new Chalk();
            ref3.setBrand("ChalkMate");
            ref3.setColor("Pink");
            ref3.setLength(6.5);
            ref3.setDiameter(1.1);
            ref3.setIsDustless(false);
            ref3.setPackagingType("Box");
            ref3.setPrice(30.50);

            System.out.println("Chalk Brand         : " + ref3.getBrand());
            System.out.println("Chalk Color         : " + ref3.getColor());
            System.out.println("Chalk Length        : " + ref3.getLength() + " cm");
            System.out.println("Chalk Diameter      : " + ref3.getDiameter() + " cm");
            System.out.println("Is Dustless         : " + ref3.getIsDustless());
            System.out.println("Packaging Type      : " + ref3.getPackagingType());
            System.out.println("Chalk Price         : ₹" + ref3.getPrice());
            System.out.println();

            Chalk ref4 = new Chalk();
            ref4.setBrand("BrightChalk");
            ref4.setColor("Blue");
            ref4.setLength(7.8);
            ref4.setDiameter(1.3);
            ref4.setIsDustless(true);
            ref4.setPackagingType("Box");
            ref4.setPrice(50.00);

            System.out.println("Chalk Brand         : " + ref4.getBrand());
            System.out.println("Chalk Color         : " + ref4.getColor());
            System.out.println("Chalk Length        : " + ref4.getLength() + " cm");
            System.out.println("Chalk Diameter      : " + ref4.getDiameter() + " cm");
            System.out.println("Is Dustless         : " + ref4.getIsDustless());
            System.out.println("Packaging Type      : " + ref4.getPackagingType());
            System.out.println("Chalk Price         : ₹" + ref4.getPrice());
            System.out.println();

            Chalk ref5 = new Chalk();
            ref5.setBrand("SchoolStick");
            ref5.setColor("Green");
            ref5.setLength(7.0);
            ref5.setDiameter(1.0);
            ref5.setIsDustless(false);
            ref5.setPackagingType("Paper Wrap");
            ref5.setPrice(28.99);

            System.out.println("Chalk Brand         : " + ref5.getBrand());
            System.out.println("Chalk Color         : " + ref5.getColor());
            System.out.println("Chalk Length        : " + ref5.getLength() + " cm");
            System.out.println("Chalk Diameter      : " + ref5.getDiameter() + " cm");
            System.out.println("Is Dustless         : " + ref5.getIsDustless());
            System.out.println("Packaging Type      : " + ref5.getPackagingType());
            System.out.println("Chalk Price         : ₹" + ref5.getPrice());
            System.out.println();
        }
    }


