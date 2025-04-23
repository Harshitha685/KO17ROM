package com.xworkz.objectmethodtask.farm;

public class FarmRunner {

        public static void main(String[] args) {

            FarmDto farm = new FarmDto();

            farm.setFarmName("Green Acres");
            farm.setLocation("California");
            farm.setAreaInAcres(250.5);
            farm.setCropType("Wheat");
            farm.setOrganic(true);

            System.out.println(farm);
        }
    }


