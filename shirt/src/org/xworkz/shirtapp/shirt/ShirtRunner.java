package org.xworkz.shirtapp.shirt;

public class ShirtRunner {

    public static void main(String[] args) {
        System.out.println("Main started");
        Shirt ref1 = new Shirt();
        ref1.setBrand("Van Housen");
        ref1.setColor("Green");
        ref1.setSize("36");
        ref1.setFabric("Cotton");
        ref1.setPrice(600.99);
        ref1.setIsFullSleve(false);
        ref1.setPattern("Checks");

        String brand1 = ref1.getBrand();
        String color1 = ref1.getColor();
       String size1  = ref1.getSize();
       String fabric1 = ref1.getFabric();
        double price1 = ref1.getPrice();
        boolean sleeve1 = ref1.getIsFullSleve();
        String pattern1 = ref1.getPattern();

        System.out.println("Shirt Brand name : " +brand1);
        System.out.println("Shirt color : " +color1);
        System.out.println("Shirt size : " +size1);
        System.out.println("Fabric used : " +fabric1);
        System.out.println("Shirt price : " +price1);
        System.out.println("Is full sleve : " +sleeve1);
        System.out.println("Shirt pattern : " +pattern1);
        System.out.println();


        Shirt ref2 = new Shirt();
        ref2.setBrand("Peter England");
        ref2.setColor("Blue");
        ref2.setSize("38");
        ref2.setFabric("Linen");
        ref2.setPrice(799.50);
        ref2.setIsFullSleve(true);
        ref2.setPattern("Solid");

        String brand2 = ref2.getBrand();
        String color2 = ref2.getColor();
        String size2 = ref2.getSize();
        String fabric2 = ref2.getFabric();
        double price2 = ref2.getPrice();
        boolean sleeve2 = ref2.getIsFullSleve();
        String pattern2 = ref2.getPattern();

        System.out.println("Shirt Brand name : " + brand2);
        System.out.println("Shirt color : " + color2);
        System.out.println("Shirt size : " + size2);
        System.out.println("Fabric used : " + fabric2);
        System.out.println("Shirt price : " + price2);
        System.out.println("Is full sleve : " + sleeve2);
        System.out.println("Shirt pattern : " + pattern2);
        System.out.println();

        Shirt ref3 = new Shirt();
        ref3.setBrand("Zara");
        ref3.setColor("White");
        ref3.setSize("40");
        ref3.setFabric("Polyester");
        ref3.setPrice(999.99);
        ref3.setIsFullSleve(false);
        ref3.setPattern("Printed");

        String brand3 = ref3.getBrand();
        String color3 = ref3.getColor();
        String size3 = ref3.getSize();
        String fabric3 = ref3.getFabric();
        double price3 = ref3.getPrice();
        boolean sleeve3 = ref3.getIsFullSleve();
        String pattern3 = ref3.getPattern();

        System.out.println("Shirt Brand name : " + brand3);
        System.out.println("Shirt color : " + color3);
        System.out.println("Shirt size : " + size3);
        System.out.println("Fabric used : " + fabric3);
        System.out.println("Shirt price : " + price3);
        System.out.println("Is full sleve : " + sleeve3);
        System.out.println("Shirt pattern : " + pattern3);
        System.out.println();

        Shirt ref4 = new Shirt();
        ref4.setBrand("Allen Solly");
        ref4.setColor("Black");
        ref4.setSize("42");
        ref4.setFabric("Silk");
        ref4.setPrice(1200.00);
        ref4.setIsFullSleve(true);
        ref4.setPattern("Stripes");

        String brand4 = ref4.getBrand();
        String color4 = ref4.getColor();
        String size4 = ref4.getSize();
        String fabric4 = ref4.getFabric();
        double price4 = ref4.getPrice();
        boolean sleeve4 = ref4.getIsFullSleve();
        String pattern4 = ref4.getPattern();

        System.out.println("Shirt Brand name : " + brand4);
        System.out.println("Shirt color : " + color4);
        System.out.println("Shirt size : " + size4);
        System.out.println("Fabric used : " + fabric4);
        System.out.println("Shirt price : " + price4);
        System.out.println("Is full sleve : " + sleeve4);
        System.out.println("Shirt pattern : " + pattern4);
        System.out.println();

        Shirt ref5 = new Shirt();
        ref5.setBrand("Raymond");
        ref5.setColor("Maroon");
        ref5.setSize("44");
        ref5.setFabric("Blended");
        ref5.setPrice(850.75);
        ref5.setIsFullSleve(true);
        ref5.setPattern("Polka Dots");

        String brand5 = ref5.getBrand();
        String color5 = ref5.getColor();
        String size5 = ref5.getSize();
        String fabric5 = ref5.getFabric();
        double price5 = ref5.getPrice();
        boolean sleeve5 = ref5.getIsFullSleve();
        String pattern5 = ref5.getPattern();

        System.out.println("Shirt Brand name : " + brand5);
        System.out.println("Shirt color : " + color5);
        System.out.println("Shirt size : " + size5);
        System.out.println("Fabric used : " + fabric5);
        System.out.println("Shirt price : " + price5);
        System.out.println("Is full sleve : " + sleeve5);
        System.out.println("Shirt pattern : " + pattern5);
        System.out.println();

        System.out.println("Main ended");
    }
}
