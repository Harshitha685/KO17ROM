package com.dmart.supermarketapp;

import com.dmart.supermarketapp.market.SuperMarket;
import com.dmart.supermarketapp.product.Products;
import com.dmart.supermarketapp.section.Sections;

public class SuperMarketRunner {
    public static void main(String[] args) {

        System.out.println("Main started");
        String sectionsForDmart[] = {"Vegetables","Fruits","Pulses","Chocolates"};
        SuperMarket market = new SuperMarket();

        market.marketName = "DMart";
        market.location = "Rajajinagar";
        market.sections = sectionsForDmart;



        String productsForVegetables[] = new String[]{"Carrot","Beans","Cucumber"};
        Sections sec[] = new Sections[2];

        Sections sec1 = new Sections();
        sec1.sectionName = "Vegetables";
        sec1.sectionCode = "Y267";
        sec1.products = productsForVegetables;

        Sections sec2 = new Sections();
        sec2.sectionName = "Vegetables";
        sec2.sectionCode = "Y267";
        String productsForFruits[] = {"Banana","Apple","Grapes"};
        sec2.products = productsForFruits;


        String ingredientsForChocolates[] = {"Sugar","Milk","Coco","Vanilla"};
        Products prod   = new Products();
        prod.productName="Chocolates";
        prod.price=60.0;
        prod.quantity = 2;
        prod.ingredients= ingredientsForChocolates;

        prod.displayProductsInfo();
        sec1.displaySection1Info();
        market.displayInfo();

        System.out.println("Main ended");
    }
}