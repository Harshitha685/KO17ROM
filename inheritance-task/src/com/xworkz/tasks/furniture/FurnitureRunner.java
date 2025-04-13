package com.xworkz.tasks.furniture;

public class FurnitureRunner {
    public static void main(String[] args) {
        Furniture furniture = new Furniture();
        furniture.assembleFurniture();
        furniture.isHeavy();

        Table table = new Table();
        table.assembleFurniture();
        table.isHeavy();

        Furniture furniture1 = new Table();

        Table table1 = (Table) furniture1;
        System.out.println(table1);
    }
}
