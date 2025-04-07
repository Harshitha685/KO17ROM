package com.xworkz.defenceapp;

import com.xworkz.defenceapp.defence.Defence;

public class DefenceRunner {

        public static void main(String[] args) {
            Defence ref1 = new Defence();
            ref1.setCountry("India");
            ref1.setBranch("Army");
            ref1.setStrength(1300000);
            ref1.setHeadquarters("New Delhi");
            ref1.setIsNuclearCapable(true);
            ref1.setAnnualBudget(73.62);
            ref1.setCommanderInChief("President of India");

            String country1 = ref1.getCountry();
            String branch1 = ref1.getBranch();
            int strength1 = ref1.getStrength();
            String hq1 = ref1.getHeadquarters();
            boolean nuclear1 = ref1.getIsNuclearCapable();
            double budget1 = ref1.getAnnualBudget();
            String chief1 = ref1.getCommanderInChief();

            System.out.println("Country             : " + country1);
            System.out.println("Defence Branch      : " + branch1);
            System.out.println("Total Strength      : " + strength1);
            System.out.println("Headquarters        : " + hq1);
            System.out.println("Nuclear Capable     : " + nuclear1);
            System.out.println("Annual Budget (B$)  : " + budget1);
            System.out.println("Commander-in-Chief  : " + chief1);
            System.out.println();

            Defence ref2 = new Defence();
            ref2.setCountry("USA");
            ref2.setBranch("Navy");
            ref2.setStrength(340000);
            ref2.setHeadquarters("Pentagon, Arlington");
            ref2.setIsNuclearCapable(true);
            ref2.setAnnualBudget(816.70);
            ref2.setCommanderInChief("President of USA");

            String country2 = ref2.getCountry();
            String branch2 = ref2.getBranch();
            int strength2 = ref2.getStrength();
            String hq2 = ref2.getHeadquarters();
            boolean nuclear2 = ref2.getIsNuclearCapable();
            double budget2 = ref2.getAnnualBudget();
            String chief2 = ref2.getCommanderInChief();

            System.out.println("Country             : " + country2);
            System.out.println("Defence Branch      : " + branch2);
            System.out.println("Total Strength      : " + strength2);
            System.out.println("Headquarters        : " + hq2);
            System.out.println("Nuclear Capable     : " + nuclear2);
            System.out.println("Annual Budget (B$)  : " + budget2);
            System.out.println("Commander-in-Chief  : " + chief2);
            System.out.println();

            Defence ref3 = new Defence();
            ref3.setCountry("Russia");
            ref3.setBranch("Air Force");
            ref3.setStrength(165000);
            ref3.setHeadquarters("Moscow");
            ref3.setIsNuclearCapable(true);
            ref3.setAnnualBudget(82.60);
            ref3.setCommanderInChief("President of Russia");

            String country3 = ref3.getCountry();
            String branch3 = ref3.getBranch();
            int strength3 = ref3.getStrength();
            String hq3 = ref3.getHeadquarters();
            boolean nuclear3 = ref3.getIsNuclearCapable();
            double budget3 = ref3.getAnnualBudget();
            String chief3 = ref3.getCommanderInChief();

            System.out.println("Country             : " + country3);
            System.out.println("Defence Branch      : " + branch3);
            System.out.println("Total Strength      : " + strength3);
            System.out.println("Headquarters        : " + hq3);
            System.out.println("Nuclear Capable     : " + nuclear3);
            System.out.println("Annual Budget (B$)  : " + budget3);
            System.out.println("Commander-in-Chief  : " + chief3);
            System.out.println();

            Defence ref4 = new Defence();
            ref4.setCountry("China");
            ref4.setBranch("People's Liberation Army");
            ref4.setStrength(2000000);
            ref4.setHeadquarters("Beijing");
            ref4.setIsNuclearCapable(true);
            ref4.setAnnualBudget(293.00);
            ref4.setCommanderInChief("President of China");

            String country4 = ref4.getCountry();
            String branch4 = ref4.getBranch();
            int strength4 = ref4.getStrength();
            String hq4 = ref4.getHeadquarters();
            boolean nuclear4 = ref4.getIsNuclearCapable();
            double budget4 = ref4.getAnnualBudget();
            String chief4 = ref4.getCommanderInChief();

            System.out.println("Country             : " + country4);
            System.out.println("Defence Branch      : " + branch4);
            System.out.println("Total Strength      : " + strength4);
            System.out.println("Headquarters        : " + hq4);
            System.out.println("Nuclear Capable     : " + nuclear4);
            System.out.println("Annual Budget (B$)  : " + budget4);
            System.out.println("Commander-in-Chief  : " + chief4);
            System.out.println();

            Defence ref5 = new Defence();
            ref5.setCountry("Germany");
            ref5.setBranch("Bundeswehr");
            ref5.setStrength(184000);
            ref5.setHeadquarters("Bonn");
            ref5.setIsNuclearCapable(false);
            ref5.setAnnualBudget(56.60);
            ref5.setCommanderInChief("Federal Chancellor");

            String country5 = ref5.getCountry();
            String branch5 = ref5.getBranch();
            int strength5 = ref5.getStrength();
            String hq5 = ref5.getHeadquarters();
            boolean nuclear5 = ref5.getIsNuclearCapable();
            double budget5 = ref5.getAnnualBudget();
            String chief5 = ref5.getCommanderInChief();

            System.out.println("Country             : " + country5);
            System.out.println("Defence Branch      : " + branch5);
            System.out.println("Total Strength      : " + strength5);
            System.out.println("Headquarters        : " + hq5);
            System.out.println("Nuclear Capable     : " + nuclear5);
            System.out.println("Annual Budget (B$)  : " + budget5);
            System.out.println("Commander-in-Chief  : " + chief5);
            System.out.println();
        }
    }


