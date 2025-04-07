package com.xworkz.cropsapp;

public class CropsRunner {

        public static void main(String[] args) {
            Crops ref1 = new Crops();
            ref1.setCropName("Wheat");
            ref1.setCropType("Cereal");
            ref1.setSeason("Rabi");
            ref1.setSoilType("Loamy");
            ref1.setYieldPerAcre(25.5);
            ref1.setIsOrganic(true);
            ref1.setMarketPrice(2100.50);

            String name1 = ref1.getCropName();
            String type1 = ref1.getCropType();
            String season1 = ref1.getSeason();
            String soil1 = ref1.getSoilType();
            double yield1 = ref1.getYieldPerAcre();
            boolean organic1 = ref1.getIsOrganic();
            double price1 = ref1.getMarketPrice();

            System.out.println("Crop Name          : " + name1);
            System.out.println("Crop Type          : " + type1);
            System.out.println("Season             : " + season1);
            System.out.println("Soil Type          : " + soil1);
            System.out.println("Yield per Acre     : " + yield1 + " quintals");
            System.out.println("Organic Crop       : " + organic1);
            System.out.println("Market Price       : ₹" + price1);
            System.out.println();

            Crops ref2 = new Crops();
            ref2.setCropName("Rice");
            ref2.setCropType("Cereal");
            ref2.setSeason("Kharif");
            ref2.setSoilType("Clay");
            ref2.setYieldPerAcre(32.8);
            ref2.setIsOrganic(false);
            ref2.setMarketPrice(1890.75);

            String name2 = ref2.getCropName();
            String type2 = ref2.getCropType();
            String season2 = ref2.getSeason();
            String soil2 = ref2.getSoilType();
            double yield2 = ref2.getYieldPerAcre();
            boolean organic2 = ref2.getIsOrganic();
            double price2 = ref2.getMarketPrice();

            System.out.println("Crop Name          : " + name2);
            System.out.println("Crop Type          : " + type2);
            System.out.println("Season             : " + season2);
            System.out.println("Soil Type          : " + soil2);
            System.out.println("Yield per Acre     : " + yield2 + " quintals");
            System.out.println("Organic Crop       : " + organic2);
            System.out.println("Market Price       : ₹" + price2);
            System.out.println();

            Crops ref3 = new Crops();
            ref3.setCropName("Cotton");
            ref3.setCropType("Commercial");
            ref3.setSeason("Kharif");
            ref3.setSoilType("Black");
            ref3.setYieldPerAcre(12.0);
            ref3.setIsOrganic(true);
            ref3.setMarketPrice(6500.00);

            String name3 = ref3.getCropName();
            String type3 = ref3.getCropType();
            String season3 = ref3.getSeason();
            String soil3 = ref3.getSoilType();
            double yield3 = ref3.getYieldPerAcre();
            boolean organic3 = ref3.getIsOrganic();
            double price3 = ref3.getMarketPrice();

            System.out.println("Crop Name          : " + name3);
            System.out.println("Crop Type          : " + type3);
            System.out.println("Season             : " + season3);
            System.out.println("Soil Type          : " + soil3);
            System.out.println("Yield per Acre     : " + yield3 + " quintals");
            System.out.println("Organic Crop       : " + organic3);
            System.out.println("Market Price       : ₹" + price3);
            System.out.println();

            Crops ref4 = new Crops();
            ref4.setCropName("Sugarcane");
            ref4.setCropType("Commercial");
            ref4.setSeason("Annual");
            ref4.setSoilType("Alluvial");
            ref4.setYieldPerAcre(45.3);
            ref4.setIsOrganic(false);
            ref4.setMarketPrice(3200.25);

            String name4 = ref4.getCropName();
            String type4 = ref4.getCropType();
            String season4 = ref4.getSeason();
            String soil4 = ref4.getSoilType();
            double yield4 = ref4.getYieldPerAcre();
            boolean organic4 = ref4.getIsOrganic();
            double price4 = ref4.getMarketPrice();

            System.out.println("Crop Name          : " + name4);
            System.out.println("Crop Type          : " + type4);
            System.out.println("Season             : " + season4);
            System.out.println("Soil Type          : " + soil4);
            System.out.println("Yield per Acre     : " + yield4 + " quintals");
            System.out.println("Organic Crop       : " + organic4);
            System.out.println("Market Price       : ₹" + price4);
            System.out.println();

            Crops ref5 = new Crops();
            ref5.setCropName("Turmeric");
            ref5.setCropType("Spice");
            ref5.setSeason("Kharif");
            ref5.setSoilType("Red");
            ref5.setYieldPerAcre(18.7);
            ref5.setIsOrganic(true);
            ref5.setMarketPrice(9500.60);

            String name5 = ref5.getCropName();
            String type5 = ref5.getCropType();
            String season5 = ref5.getSeason();
            String soil5 = ref5.getSoilType();
            double yield5 = ref5.getYieldPerAcre();
            boolean organic5 = ref5.getIsOrganic();
            double price5 = ref5.getMarketPrice();

            System.out.println("Crop Name          : " + name5);
            System.out.println("Crop Type          : " + type5);
            System.out.println("Season             : " + season5);
            System.out.println("Soil Type          : " + soil5);
            System.out.println("Yield per Acre     : " + yield5 + " quintals");
            System.out.println("Organic Crop       : " + organic5);
            System.out.println("Market Price       : ₹" + price5);
            System.out.println();
        }
    }



