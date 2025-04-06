package com.xworkz.lipstickapp;

import com.xworkz.lipstickapp.lipstick.LipStick;

public class LipStickRunner {
    public static void main(String[] args) {
        System.out.println("Main started:");
//1
        LipStick ref1 = new LipStick();
        ref1.setLipStickId(1);
        ref1.setLipStickBrand("Lakme");
        ref1.setLipStickColor("Pink");
        ref1.setLipStickType("Glossy");
        ref1.setPrice(800.00);


        int id1 = ref1.getLipStickId();
        String brand1 = ref1.getLipStickBrand();
        String color1 = ref1.getLipStickColor();
        String type1 = ref1.getLipStickType();
       double price1  = ref1.getPrice();


        System.out.println("lipstick id is : "+id1);
        System.out.println("lipstick brand is : "+brand1);
        System.out.println("lipstick color is : "+color1);
        System.out.println("lipstick type is : "+type1);
        System.out.println("lipstick price is : "+price1);
        System.out.println();

        //2
        LipStick ref2 = new LipStick();
        ref2.setLipStickId(2);
        ref2.setLipStickBrand("Dazller");
        ref2.setLipStickColor("Red");
        ref2.setLipStickType("Matte");
        ref2.setPrice(1000.00);


        int id2 = ref2.getLipStickId();
        String brand2 = ref2.getLipStickBrand();
        String color2 = ref2.getLipStickColor();
        String type2= ref2.getLipStickType();
        double price2  = ref2.getPrice();


        System.out.println("lipstick id is : "+id2);
        System.out.println("lipstick brand is : "+brand2);
        System.out.println("lipstick color is : "+color2);
        System.out.println("lipstick type is : "+type2);
        System.out.println("lipstick price is : "+price2);
        System.out.println();

        //3
        LipStick ref3 = new LipStick();
        ref3.setLipStickId(3);
        ref3.setLipStickBrand("Maybelline");
        ref3.setLipStickColor("Green");
        ref3.setLipStickType("Glossy");
        ref3.setPrice(1200.00);


        int id3 = ref3.getLipStickId();
        String brand3 = ref3.getLipStickBrand();
        String color3 = ref3.getLipStickColor();
        String type3 = ref3.getLipStickType();
        double price3  = ref3.getPrice();


        System.out.println("lipstick id is : "+id3);
        System.out.println("lipstick brand is : "+brand3);
        System.out.println("lipstick color is : "+color3);
        System.out.println("lipstick type is : "+type3);
        System.out.println("lipstick price is : "+price3);
        System.out.println();

        //4
        LipStick ref4 = new LipStick();
        ref4.setLipStickId(4);
        ref4.setLipStickBrand("Mac");
        ref4.setLipStickColor("Sunshine");
        ref4.setLipStickType("Matte");
        ref4.setPrice(900.00);


        int id4 = ref4.getLipStickId();
        String brand4 = ref4.getLipStickBrand();
        String color4 = ref4.getLipStickColor();
        String type4 = ref4.getLipStickType();
        double price4  = ref4.getPrice();


        System.out.println("lipstick id is : "+id4);
        System.out.println("lipstick brand is : "+brand4);
        System.out.println("lipstick color is : "+color4);
        System.out.println("lipstick type is : "+type4);
        System.out.println("lipstick price is : "+price4);
        System.out.println();

        //5
        LipStick ref5 = new LipStick();
        ref5.setLipStickId(5);
        ref5.setLipStickBrand("Loreal Paris");
        ref5.setLipStickColor("Baby Pink");
        ref5.setLipStickType("Metallic");
        ref5.setPrice(1500.00);


        int id5 = ref5.getLipStickId();
        String brand5 = ref5.getLipStickBrand();
        String color5 = ref5.getLipStickColor();
        String type5 = ref5.getLipStickType();
        double price5  = ref5.getPrice();


        System.out.println("lipstick id is : "+id5);
        System.out.println("lipstick brand is : "+brand5);
        System.out.println("lipstick color is : "+color5);
        System.out.println("lipstick type is : "+type5);
        System.out.println("lipstick price is : "+price5);
        System.out.println();

        //6
        LipStick ref6 = new LipStick();
        ref6.setLipStickId(6);
        ref6.setLipStickBrand("MamaEarth");
        ref6.setLipStickColor("Dark red");
        ref6.setLipStickType("Colorful");
        ref6.setPrice(1200.00);


        int id6 = ref6.getLipStickId();
        String brand6 = ref6.getLipStickBrand();
        String color6 = ref6.getLipStickColor();
        String type6 = ref6.getLipStickType();
        double price6  = ref6.getPrice();


        System.out.println("lipstick id is : "+id6);
        System.out.println("lipstick brand is : "+brand6);
        System.out.println("lipstick color is : "+color6);
        System.out.println("lipstick type is : "+type6);
        System.out.println("lipstick price is : "+price6);
        System.out.println();

        //7
        LipStick ref7 = new LipStick();
        ref7.setLipStickId(7);
        ref7.setLipStickBrand("Faces Canada");
        ref7.setLipStickColor("Rose pink");
        ref7.setLipStickType("Matte");
        ref7.setPrice(600.00);


        int id7 = ref7.getLipStickId();
        String brand7 = ref7.getLipStickBrand();
        String color7 = ref7.getLipStickColor();
        String type7 = ref7.getLipStickType();
        double price7  = ref7.getPrice();


        System.out.println("lipstick id is : "+id7);
        System.out.println("lipstick brand is : "+brand7);
        System.out.println("lipstick color is : "+color7);
        System.out.println("lipstick type is : "+type7);
        System.out.println("lipstick price is : "+price7);
        System.out.println();

        System.out.println("Main ended:");
    }
}
