package com.xworkz.tasks.furniture;

public class FurnitureRunner {
    public static void main(String[] args) {
        Furniture furniture = new Furniture();
        furniture.assembleFurniture();
        furniture.isHeavy();
        furniture.moveFurniture();
        furniture.addFeatures();
        furniture.calculateArea();

        Furniture furniture2 = new Table();
        furniture2.assembleFurniture();
        furniture2.isHeavy();
        furniture2.moveFurniture();
        furniture2.addFeatures();
        furniture2.calculateArea();

        Table table = new Table();
        table.addTablecloth();
        table.changeTableColor();
        table.adjustHeight();
        table.addLegs();
        table.cleanTable();

        Furniture furniture1 = new Table();

        Table table1 = (Table) furniture1;
        System.out.println(table1);
    }
}
