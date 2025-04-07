package org.xworkz.markerapp;

import org.xworkz.markerapp.marker.Marker;

public class MarkerRunner {
        public static void main(String[] args) {

            Marker ref1 = new Marker();
            ref1.setBrand("Camlin");
            ref1.setColor("Blue");
            ref1.setPrice(25.50);
            ref1.setIsPermanent(true);
            ref1.setTipType("Fine");
            ref1.setLength(14.5);
            ref1.setInkType("Alcohol-based");

            String brand1 = ref1.getBrand();
            String color1 = ref1.getColor();
            double price1 = ref1.getPrice();
            boolean perm1 = ref1.getIsPermanent();
            String tip1 = ref1.getTipType();
            double len1 = ref1.getLength();
            String ink1 = ref1.getInkType();

            System.out.println("Marker Brand : " + brand1);
            System.out.println("Marker Color : " + color1);
            System.out.println("Marker Price : " + price1);
            System.out.println("Is Permanent : " + perm1);
            System.out.println("Tip Type : " + tip1);
            System.out.println("Length : " + len1 + " cm");
            System.out.println("Ink Type : " + ink1);
            System.out.println();

            Marker ref2 = new Marker();
            ref2.setBrand("Luxor");
            ref2.setColor("Red");
            ref2.setPrice(20.00);
            ref2.setIsPermanent(false);
            ref2.setTipType("Chisel");
            ref2.setLength(13.8);
            ref2.setInkType("Water-based");

            System.out.println("Marker Brand : " + ref2.getBrand());
            System.out.println("Marker Color : " + ref2.getColor());
            System.out.println("Marker Price : " + ref2.getPrice());
            System.out.println("Is Permanent : " + ref2.getIsPermanent());
            System.out.println("Tip Type : " + ref2.getTipType());
            System.out.println("Length : " + ref2.getLength() + " cm");
            System.out.println("Ink Type : " + ref2.getInkType());
            System.out.println();

            Marker ref3 = new Marker();
            ref3.setBrand("Faber-Castell");
            ref3.setColor("Black");
            ref3.setPrice(30.75);
            ref3.setIsPermanent(true);
            ref3.setTipType("Bullet");
            ref3.setLength(15.0);
            ref3.setInkType("Gel-based");

            System.out.println("Marker Brand : " + ref3.getBrand());
            System.out.println("Marker Color : " + ref3.getColor());
            System.out.println("Marker Price : " + ref3.getPrice());
            System.out.println("Is Permanent : " + ref3.getIsPermanent());
            System.out.println("Tip Type : " + ref3.getTipType());
            System.out.println("Length : " + ref3.getLength() + " cm");
            System.out.println("Ink Type : " + ref3.getInkType());
            System.out.println();

            Marker ref4 = new Marker();
            ref4.setBrand("Staedtler");
            ref4.setColor("Green");
            ref4.setPrice(35.00);
            ref4.setIsPermanent(false);
            ref4.setTipType("Fine");
            ref4.setLength(14.0);
            ref4.setInkType("Oil-based");

            System.out.println("Marker Brand : " + ref4.getBrand());
            System.out.println("Marker Color : " + ref4.getColor());
            System.out.println("Marker Price : " + ref4.getPrice());
            System.out.println("Is Permanent : " + ref4.getIsPermanent());
            System.out.println("Tip Type : " + ref4.getTipType());
            System.out.println("Length : " + ref4.getLength() + " cm");
            System.out.println("Ink Type : " + ref4.getInkType());
            System.out.println();

            Marker ref5 = new Marker();
            ref5.setBrand("Sharpie");
            ref5.setColor("Purple");
            ref5.setPrice(40.00);
            ref5.setIsPermanent(true);
            ref5.setTipType("Chisel");
            ref5.setLength(15.2);
            ref5.setInkType("Alcohol-based");

            System.out.println("Marker Brand : " + ref5.getBrand());
            System.out.println("Marker Color : " + ref5.getColor());
            System.out.println("Marker Price : " + ref5.getPrice());
            System.out.println("Is Permanent : " + ref5.getIsPermanent());
            System.out.println("Tip Type : " + ref5.getTipType());
            System.out.println("Length : " + ref5.getLength() + " cm");
            System.out.println("Ink Type : " + ref5.getInkType());
        }
    }


