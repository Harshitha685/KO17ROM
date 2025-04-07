package org.xworkz.itkeapp;

import org.xworkz.itkeapp.itke.Itke;

public class ItkeRunner {

        public static void main(String[] args) {
            Itke ref1 = new Itke();
            ref1.setShape("Rectangular");
            ref1.setUsage("Wall Construction");
            ref1.setGrade("A");
            ref1.setThermalResistance(0.8);
            ref1.setIsEcoFriendly(true);
            ref1.setManufacturer("BrickMakers Ltd.");
            ref1.setCostPerBrick(9.50);

            String shape1 = ref1.getShape();
            String usage1 = ref1.getUsage();
            String grade1 = ref1.getGrade();
            double thermal1 = ref1.getThermalResistance();
            boolean eco1 = ref1.getIsEcoFriendly();
            String maker1 = ref1.getManufacturer();
            double cost1 = ref1.getCostPerBrick();

            System.out.println("Brick Shape           : " + shape1);
            System.out.println("Usage                 : " + usage1);
            System.out.println("Grade                 : " + grade1);
            System.out.println("Thermal Resistance    : " + thermal1);
            System.out.println("Eco-Friendly          : " + eco1);
            System.out.println("Manufacturer          : " + maker1);
            System.out.println("Cost per Brick (₹)    : " + cost1);
            System.out.println();

            Itke ref2 = new Itke();
            ref2.setShape("Square");
            ref2.setUsage("Pavement");
            ref2.setGrade("B");
            ref2.setThermalResistance(0.5);
            ref2.setIsEcoFriendly(false);
            ref2.setManufacturer("BuildStrong Co.");
            ref2.setCostPerBrick(7.80);

            String shape2 = ref2.getShape();
            String usage2 = ref2.getUsage();
            String grade2 = ref2.getGrade();
            double thermal2 = ref2.getThermalResistance();
            boolean eco2 = ref2.getIsEcoFriendly();
            String maker2 = ref2.getManufacturer();
            double cost2 = ref2.getCostPerBrick();

            System.out.println("Brick Shape           : " + shape2);
            System.out.println("Usage                 : " + usage2);
            System.out.println("Grade                 : " + grade2);
            System.out.println("Thermal Resistance    : " + thermal2);
            System.out.println("Eco-Friendly          : " + eco2);
            System.out.println("Manufacturer          : " + maker2);
            System.out.println("Cost per Brick (₹)    : " + cost2);
            System.out.println();

            Itke ref3 = new Itke();
            ref3.setShape("Hollow");
            ref3.setUsage("Partition Walls");
            ref3.setGrade("A+");
            ref3.setThermalResistance(1.1);
            ref3.setIsEcoFriendly(true);
            ref3.setManufacturer("EcoBricks India");
            ref3.setCostPerBrick(10.25);

            String shape3 = ref3.getShape();
            String usage3 = ref3.getUsage();
            String grade3 = ref3.getGrade();
            double thermal3 = ref3.getThermalResistance();
            boolean eco3 = ref3.getIsEcoFriendly();
            String maker3 = ref3.getManufacturer();
            double cost3 = ref3.getCostPerBrick();

            System.out.println("Brick Shape           : " + shape3);
            System.out.println("Usage                 : " + usage3);
            System.out.println("Grade                 : " + grade3);
            System.out.println("Thermal Resistance    : " + thermal3);
            System.out.println("Eco-Friendly          : " + eco3);
            System.out.println("Manufacturer          : " + maker3);
            System.out.println("Cost per Brick (₹)    : " + cost3);
            System.out.println();

            Itke ref4 = new Itke();
            ref4.setShape("Interlocking");
            ref4.setUsage("Garden Pathways");
            ref4.setGrade("Premium");
            ref4.setThermalResistance(0.6);
            ref4.setIsEcoFriendly(true);
            ref4.setManufacturer("GreenBuild");
            ref4.setCostPerBrick(12.00);

            String shape4 = ref4.getShape();
            String usage4 = ref4.getUsage();
            String grade4 = ref4.getGrade();
            double thermal4 = ref4.getThermalResistance();
            boolean eco4 = ref4.getIsEcoFriendly();
            String maker4 = ref4.getManufacturer();
            double cost4 = ref4.getCostPerBrick();

            System.out.println("Brick Shape           : " + shape4);
            System.out.println("Usage                 : " + usage4);
            System.out.println("Grade                 : " + grade4);
            System.out.println("Thermal Resistance    : " + thermal4);
            System.out.println("Eco-Friendly          : " + eco4);
            System.out.println("Manufacturer          : " + maker4);
            System.out.println("Cost per Brick (₹)    : " + cost4);
            System.out.println();

            Itke ref5 = new Itke();
            ref5.setShape("Custom");
            ref5.setUsage("Decorative Walls");
            ref5.setGrade("Luxury");
            ref5.setThermalResistance(0.9);
            ref5.setIsEcoFriendly(false);
            ref5.setManufacturer("DesignBricks Ltd.");
            ref5.setCostPerBrick(15.75);


            String shape5 = ref5.getShape();
            String usage5 = ref5.getUsage();
            String grade5 = ref5.getGrade();
            double thermal5 = ref5.getThermalResistance();
            boolean eco5 = ref5.getIsEcoFriendly();
            String maker5 = ref5.getManufacturer();
            double cost5 = ref5.getCostPerBrick();

            System.out.println("Brick Shape           : " + shape5);
            System.out.println("Usage                 : " + usage5);
            System.out.println("Grade                 : " + grade5);
            System.out.println("Thermal Resistance    : " + thermal5);
            System.out.println("Eco-Friendly          : " + eco5);
            System.out.println("Manufacturer          : " + maker5);
            System.out.println("Cost per Brick (₹)    : " + cost5);
            System.out.println();

        }
    }


