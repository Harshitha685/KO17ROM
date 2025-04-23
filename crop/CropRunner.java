package com.xworkz.objectmethodtask.crop;

public class CropRunner {

        public static void main(String[] args) {

            CropDto crop = new CropDto();

            crop.setCropName("Wheat");
            crop.setSeason("Winter");
            crop.setYieldPerHectare(2.5);
            crop.setFarmingMethod("Traditional");
            crop.setOrganic(true);

            System.out.println(crop);

    }

}
