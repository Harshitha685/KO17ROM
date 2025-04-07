package com.xworkz.tilesapp;

import com.xworkz.tilesapp.tiles.Tiles;

public class TilesRunner {
        public static void main(String[] args) {
            Tiles ref1 = new Tiles();
            ref1.setTileType("Vitrified");
            ref1.setOriginCountry("India");
            ref1.setSurfaceFinish("Glossy");
            ref1.setThickness(8.5);
            ref1.setWeightPerTile(2.3);
            ref1.setCostPerBox(750.00);
            ref1.setIsSlipResistant(false);

            String type1 = ref1.getTileType();
            String country1 = ref1.getOriginCountry();
            String finish1 = ref1.getSurfaceFinish();
            double thickness1 = ref1.getThickness();
            double weight1 = ref1.getWeightPerTile();
            double cost1 = ref1.getCostPerBox();
            boolean slip1 = ref1.getIsSlipResistant();

            System.out.println("Tile Type: " + type1);
            System.out.println("Made in: " + country1);
            System.out.println("Surface Finish: " + finish1);
            System.out.println("Thickness: " + thickness1 + " mm");
            System.out.println("Weight per Tile: " + weight1 + " kg");
            System.out.println("Cost per Box: ₹" + cost1);
            System.out.println("Slip Resistant: " + slip1);
            System.out.println();

            Tiles ref2 = new Tiles();
            ref2.setTileType("Ceramic");
            ref2.setOriginCountry("Spain");
            ref2.setSurfaceFinish("Matte");
            ref2.setThickness(7.0);
            ref2.setWeightPerTile(2.0);
            ref2.setCostPerBox(690.00);
            ref2.setIsSlipResistant(true);

            String type2 = ref2.getTileType();
            String country2 = ref2.getOriginCountry();
            String finish2 = ref2.getSurfaceFinish();
            double thickness2 = ref2.getThickness();
            double weight2 = ref2.getWeightPerTile();
            double cost2 = ref2.getCostPerBox();
            boolean slip2 = ref2.getIsSlipResistant();

            System.out.println("Tile Type: " + type2);
            System.out.println("Made in: " + country2);
            System.out.println("Surface Finish: " + finish2);
            System.out.println("Thickness: " + thickness2 + " mm");
            System.out.println("Weight per Tile: " + weight2 + " kg");
            System.out.println("Cost per Box: ₹" + cost2);
            System.out.println("Slip Resistant: " + slip2);
            System.out.println();

            Tiles ref3 = new Tiles();
            ref3.setTileType("Granite");
            ref3.setOriginCountry("Brazil");
            ref3.setSurfaceFinish("Polished");
            ref3.setThickness(10.0);
            ref3.setWeightPerTile(3.5);
            ref3.setCostPerBox(1200.00);
            ref3.setIsSlipResistant(false);

            String type3 = ref3.getTileType();
            String country3 = ref3.getOriginCountry();
            String finish3 = ref3.getSurfaceFinish();
            double thickness3 = ref3.getThickness();
            double weight3 = ref3.getWeightPerTile();
            double cost3 = ref3.getCostPerBox();
            boolean slip3 = ref3.getIsSlipResistant();

            System.out.println("Tile Type: " + type3);
            System.out.println("Made in: " + country3);
            System.out.println("Surface Finish: " + finish3);
            System.out.println("Thickness: " + thickness3 + " mm");
            System.out.println("Weight per Tile: " + weight3 + " kg");
            System.out.println("Cost per Box: ₹" + cost3);
            System.out.println("Slip Resistant: " + slip3);
            System.out.println();

            Tiles ref4 = new Tiles();
            ref4.setTileType("Slate");
            ref4.setOriginCountry("Italy");
            ref4.setSurfaceFinish("Textured");
            ref4.setThickness(6.5);
            ref4.setWeightPerTile(2.8);
            ref4.setCostPerBox(950.00);
            ref4.setIsSlipResistant(true);

            String type4 = ref4.getTileType();
            String country4 = ref4.getOriginCountry();
            String finish4 = ref4.getSurfaceFinish();
            double thickness4 = ref4.getThickness();
            double weight4 = ref4.getWeightPerTile();
            double cost4 = ref4.getCostPerBox();
            boolean slip4 = ref4.getIsSlipResistant();

            System.out.println("Tile Type: " + type4);
            System.out.println("Made in: " + country4);
            System.out.println("Surface Finish: " + finish4);
            System.out.println("Thickness: " + thickness4 + " mm");
            System.out.println("Weight per Tile: " + weight4 + " kg");
            System.out.println("Cost per Box: ₹" + cost4);
            System.out.println("Slip Resistant: " + slip4);
            System.out.println();

            Tiles ref5 = new Tiles();
            ref5.setTileType("Marble");
            ref5.setOriginCountry("Turkey");
            ref5.setSurfaceFinish("High Gloss");
            ref5.setThickness(12.0);
            ref5.setWeightPerTile(4.2);
            ref5.setCostPerBox(1450.00);
            ref5.setIsSlipResistant(false);

            String type5 = ref5.getTileType();
            String country5 = ref5.getOriginCountry();
            String finish5 = ref5.getSurfaceFinish();
            double thickness5 = ref5.getThickness();
            double weight5 = ref5.getWeightPerTile();
            double cost5 = ref5.getCostPerBox();
            boolean slip5 = ref5.getIsSlipResistant();

            System.out.println("Tile Type: " + type5);
            System.out.println("Made in: " + country5);
            System.out.println("Surface Finish: " + finish5);
            System.out.println("Thickness: " + thickness5 + " mm");
            System.out.println("Weight per Tile: " + weight5 + " kg");
            System.out.println("Cost per Box: ₹" + cost5);
            System.out.println("Slip Resistant: " + slip5);
            System.out.println();
        }
}


