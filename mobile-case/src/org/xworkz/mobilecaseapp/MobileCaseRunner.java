package org.xworkz.mobilecaseapp;

import org.xworkz.mobilecaseapp.mobilecase.MobileCase;

public class MobileCaseRunner {

        public static void main(String[] args) {

            MobileCase ref1 = new MobileCase();
            ref1.setCompany("Spigen");
            ref1.setCaseType("Back Cover");
            ref1.setTexture("Matte");
            ref1.setThickness(1.2);
            ref1.setIsShockProof(true);
            ref1.setModelName("iPhone 13");
            ref1.setCost(999.99);

            String company1 = ref1.getCompany();
            String type1 = ref1.getCaseType();
            String texture1 = ref1.getTexture();
            double thickness1 = ref1.getThickness();
            boolean shock1 = ref1.getIsShockProof();
            String model1 = ref1.getModelName();
            double cost1 = ref1.getCost();

            System.out.println("Mobile Case Company   : " + company1);
            System.out.println("Case Type             : " + type1);
            System.out.println("Texture               : " + texture1);
            System.out.println("Thickness             : " + thickness1 + " mm");
            System.out.println("Is Shock Proof        : " + shock1);
            System.out.println("Model Name            : " + model1);
            System.out.println("Cost                  : ₹" + cost1);
            System.out.println();

            MobileCase ref2 = new MobileCase();
            ref2.setCompany("Ringke");
            ref2.setCaseType("Transparent");
            ref2.setTexture("Glossy");
            ref2.setThickness(1.0);
            ref2.setIsShockProof(false);
            ref2.setModelName("Samsung S22");
            ref2.setCost(799.00);

            String company2 = ref2.getCompany();
            String type2 = ref2.getCaseType();
            String texture2 = ref2.getTexture();
            double thickness2 = ref2.getThickness();
            boolean shock2 = ref2.getIsShockProof();
            String model2 = ref2.getModelName();
            double cost2 = ref2.getCost();

            System.out.println("Mobile Case Company   : " + company2);
            System.out.println("Case Type             : " + type2);
            System.out.println("Texture               : " + texture2);
            System.out.println("Thickness             : " + thickness2 + " mm");
            System.out.println("Is Shock Proof        : " + shock2);
            System.out.println("Model Name            : " + model2);
            System.out.println("Cost                  : ₹" + cost2);
            System.out.println();

            MobileCase ref3 = new MobileCase();
            ref3.setCompany("OtterBox");
            ref3.setCaseType("Defender");
            ref3.setTexture("Rough");
            ref3.setThickness(2.5);
            ref3.setIsShockProof(true);
            ref3.setModelName("OnePlus 11");
            ref3.setCost(1199.50);

            String company3 = ref3.getCompany();
            String type3 = ref3.getCaseType();
            String texture3 = ref3.getTexture();
            double thickness3 = ref3.getThickness();
            boolean shock3 = ref3.getIsShockProof();
            String model3 = ref3.getModelName();
            double cost3 = ref3.getCost();

            System.out.println("Mobile Case Company   : " + company3);
            System.out.println("Case Type             : " + type3);
            System.out.println("Texture               : " + texture3);
            System.out.println("Thickness             : " + thickness3 + " mm");
            System.out.println("Is Shock Proof        : " + shock3);
            System.out.println("Model Name            : " + model3);
            System.out.println("Cost                  : ₹" + cost3);
            System.out.println();

            MobileCase ref4 = new MobileCase();
            ref4.setCompany("Caseology");
            ref4.setCaseType("Slim");
            ref4.setTexture("Soft");
            ref4.setThickness(0.9);
            ref4.setIsShockProof(false);
            ref4.setModelName("Pixel 6a");
            ref4.setCost(549.75);

            String company4 = ref4.getCompany();
            String type4 = ref4.getCaseType();
            String texture4 = ref4.getTexture();
            double thickness4 = ref4.getThickness();
            boolean shock4 = ref4.getIsShockProof();
            String model4 = ref4.getModelName();
            double cost4 = ref4.getCost();

            System.out.println("Mobile Case Company   : " + company4);
            System.out.println("Case Type             : " + type4);
            System.out.println("Texture               : " + texture4);
            System.out.println("Thickness             : " + thickness4 + " mm");
            System.out.println("Is Shock Proof        : " + shock4);
            System.out.println("Model Name            : " + model4);
            System.out.println("Cost                  : ₹" + cost4);
            System.out.println();

            MobileCase ref5 = new MobileCase();
            ref5.setCompany("AmazonBasics");
            ref5.setCaseType("Rugged");
            ref5.setTexture("Grippy");
            ref5.setThickness(1.8);
            ref5.setIsShockProof(true);
            ref5.setModelName("Redmi Note 12 Pro");
            ref5.setCost(649.00);

            String company5 = ref5.getCompany();
            String type5 = ref5.getCaseType();
            String texture5 = ref5.getTexture();
            double thickness5 = ref5.getThickness();
            boolean shock5 = ref5.getIsShockProof();
            String model5 = ref5.getModelName();
            double cost5 = ref5.getCost();

            System.out.println("Mobile Case Company   : " + company5);
            System.out.println("Case Type             : " + type5);
            System.out.println("Texture               : " + texture5);
            System.out.println("Thickness             : " + thickness5 + " mm");
            System.out.println("Is Shock Proof        : " + shock5);
            System.out.println("Model Name            : " + model5);
            System.out.println("Cost                  : ₹" + cost5);
            System.out.println();
        }
    }

