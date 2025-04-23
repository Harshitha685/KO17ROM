package com.xworkz.objectmethodtask.constructionmaterial;

public class ConstructionMaterialRunner {

        public static void main(String[] args) {

            ConstructionMaterialDto material = new ConstructionMaterialDto();

            material.setMaterialName("Cement");
            material.setMaterialType("Building Material");
            material.setPricePerUnit(350.75);
            material.setQuantity(100);
            material.setAvailable(true);

            System.out.println(material);
        }
    }


