package com.xworkz.laddersystem;

import com.xworkz.laddersystem.ladder.Ladder;

public class LadderRunner {

        public static void main(String[] args) {
            Ladder ref1 = new Ladder();
            ref1.setBrand("StepUp");
            ref1.setMaterial("Aluminium");
            ref1.setHeight(6.5);
            ref1.setWeightCapacity(4.2);
            ref1.setIsFoldable(true);
            ref1.setNumberOfSteps(5);
            ref1.setPrice(2999.99);

            String brand1 = ref1.getBrand();
            String material1 = ref1.getMaterial();
            double height1 = ref1.getHeight();
            double weight1 = ref1.getWeightCapacity();
            boolean foldable1 = ref1.getIsFoldable();
            int steps1 = ref1.getNumberOfSteps();
            double price1 = ref1.getPrice();

            System.out.println("Ladder Brand : " + brand1);
            System.out.println("Material  : " + material1);
            System.out.println("Height   : " + height1 + " ft");
            System.out.println("Weight  : " + weight1 + " kg");
            System.out.println("Foldable  : " + foldable1);
            System.out.println("Steps  : " + steps1);
            System.out.println("Price   : ₹" + price1);
            System.out.println();

            Ladder ref2 = new Ladder();
            ref2.setBrand("SureStep");
            ref2.setMaterial("Steel");
            ref2.setHeight(8.0);
            ref2.setWeightCapacity(6.1);
            ref2.setIsFoldable(false);
            ref2.setNumberOfSteps(7);
            ref2.setPrice(3590.00);

            String brand2 = ref2.getBrand();
            String material2 = ref2.getMaterial();
            double height2 = ref2.getHeight();
            double weight2 = ref2.getWeightCapacity();
            boolean foldable2 = ref2.getIsFoldable();
            int steps2 = ref2.getNumberOfSteps();
            double price2 = ref2.getPrice();

            System.out.println("Ladder Brand : " + brand2);
            System.out.println("Material  : " + material2);
            System.out.println("Height  : " + height2 + " ft");
            System.out.println("Weight  : " + weight2 + " kg");
            System.out.println("Foldable : " + foldable2);
            System.out.println("Steps : " + steps2);
            System.out.println("Price : ₹" + price2);
            System.out.println();

            Ladder ref3 = new Ladder();
            ref3.setBrand("EZClimb");
            ref3.setMaterial("Fiber");
            ref3.setHeight(5.0);
            ref3.setWeightCapacity(3.5);
            ref3.setIsFoldable(true);
            ref3.setNumberOfSteps(4);
            ref3.setPrice(2150.75);

            String brand3 = ref3.getBrand();
            String material3 = ref3.getMaterial();
            double height3 = ref3.getHeight();
            double weight3 = ref3.getWeightCapacity();
            boolean foldable3 = ref3.getIsFoldable();
            int steps3 = ref3.getNumberOfSteps();
            double price3 = ref3.getPrice();

            System.out.println("Ladder Brand  : " + brand3);
            System.out.println("Material  : " + material3);
            System.out.println("Height  : " + height3 + " ft");
            System.out.println("Weight  : " + weight3 + " kg");
            System.out.println("Foldable   : " + foldable3);
            System.out.println("Steps  : " + steps3);
            System.out.println("Price  : ₹" + price3);
            System.out.println();

            Ladder ref4 = new Ladder();
            ref4.setBrand("ClimberX");
            ref4.setMaterial("Wood");
            ref4.setHeight(7.2);
            ref4.setWeightCapacity(5.7);
            ref4.setIsFoldable(false);
            ref4.setNumberOfSteps(6);
            ref4.setPrice(2800.00);

            String brand4 = ref4.getBrand();
            String material4 = ref4.getMaterial();
            double height4 = ref4.getHeight();
            double weight4 = ref4.getWeightCapacity();
            boolean foldable4 = ref4.getIsFoldable();
            int steps4 = ref4.getNumberOfSteps();
            double price4 = ref4.getPrice();

            System.out.println("Ladder Brand : " + brand4);
            System.out.println("Material   : " + material4);
            System.out.println("Height  : " + height4 + " ft");
            System.out.println("Weight  : " + weight4 + " kg");
            System.out.println("Foldable  : " + foldable4);
            System.out.println("Steps  : " + steps4);
            System.out.println("Price  : ₹" + price4);
            System.out.println();

            Ladder ref5 = new Ladder();
            ref5.setBrand("SkyReach");
            ref5.setMaterial("Steel");
            ref5.setHeight(9.0);
            ref5.setWeightCapacity(6.8);
            ref5.setIsFoldable(true);
            ref5.setNumberOfSteps(8);
            ref5.setPrice(3999.00);

            String brand5 = ref5.getBrand();
            String material5 = ref5.getMaterial();
            double height5 = ref5.getHeight();
            double weight5 = ref5.getWeightCapacity();
            boolean foldable5 = ref5.getIsFoldable();
            int steps5 = ref5.getNumberOfSteps();
            double price5 = ref5.getPrice();

            System.out.println("Ladder Brand : " + brand5);
            System.out.println("Material  : " + material5);
            System.out.println("Height   : " + height5 + " ft");
            System.out.println("Weight   : " + weight5 + " kg");
            System.out.println("Foldable  : " + foldable5);
            System.out.println("Steps   : " + steps5);
            System.out.println("Price  : ₹" + price5);
            System.out.println();
        }
    }


