class ShampooRunner {

public static void main(String[] args) {

    // 1
    Shampoo s1 = new Shampoo();
    s1.quantityInMl = 180.0;
    s1.price = 150.0;
    s1.hairType = "Oily";
    s1.isHerbal = false;
    System.out.println("Quantity (ml): " + s1.quantityInMl);
    System.out.println("Price: " + s1.price);
    System.out.println("Hair Type: " + s1.hairType);
    System.out.println("Herbal: " + s1.isHerbal);
    System.out.println();

    s1 = new Shampoo(180.0, 150.0, "Oily", false);
    System.out.println("Quantity (ml): " + s1.quantityInMl);
    System.out.println("Price: " + s1.price);
    System.out.println("Hair Type: " + s1.hairType);
    System.out.println("Herbal: " + s1.isHerbal);
    System.out.println();

    // 2
    Shampoo s2 = new Shampoo();
    s2.quantityInMl = 200.0;
    s2.price = 170.0;
    s2.hairType = "Dry";
    s2.isHerbal = true;
    System.out.println("Quantity (ml): " + s2.quantityInMl);
    System.out.println("Price: " + s2.price);
    System.out.println("Hair Type: " + s2.hairType);
    System.out.println("Herbal: " + s2.isHerbal);
    System.out.println();

    s2 = new Shampoo(200.0, 170.0, "Dry", true);
    System.out.println("Quantity (ml): " + s2.quantityInMl);
    System.out.println("Price: " + s2.price);
    System.out.println("Hair Type: " + s2.hairType);
    System.out.println("Herbal: " + s2.isHerbal);
    System.out.println();

    // 3
    Shampoo s3 = new Shampoo();
    s3.quantityInMl = 250.0;
    s3.price = 190.0;
    s3.hairType = "Normal";
    s3.isHerbal = false;
    System.out.println("Quantity (ml): " + s3.quantityInMl);
    System.out.println("Price: " + s3.price);
    System.out.println("Hair Type: " + s3.hairType);
    System.out.println("Herbal: " + s3.isHerbal);
    System.out.println();

    s3 = new Shampoo(250.0, 190.0, "Normal", false);
    System.out.println("Quantity (ml): " + s3.quantityInMl);
    System.out.println("Price: " + s3.price);
    System.out.println("Hair Type: " + s3.hairType);
    System.out.println("Herbal: " + s3.isHerbal);
    System.out.println();

    // 4
    Shampoo s4 = new Shampoo();
    s4.quantityInMl = 300.0;
    s4.price = 220.0;
    s4.hairType = "Curly";
    s4.isHerbal = true;
    System.out.println("Quantity (ml): " + s4.quantityInMl);
    System.out.println("Price: " + s4.price);
    System.out.println("Hair Type: " + s4.hairType);
    System.out.println("Herbal: " + s4.isHerbal);
    System.out.println();

    s4 = new Shampoo(300.0, 220.0, "Curly", true);
    System.out.println("Quantity (ml): " + s4.quantityInMl);
    System.out.println("Price: " + s4.price);
    System.out.println("Hair Type: " + s4.hairType);
    System.out.println("Herbal: " + s4.isHerbal);
    System.out.println();

    // 5
    Shampoo s5 = new Shampoo();
    s5.quantityInMl = 150.0;
    s5.price = 130.0;
    s5.hairType = "Frizzy";
    s5.isHerbal = false;
    System.out.println("Quantity (ml): " + s5.quantityInMl);
    System.out.println("Price: " + s5.price);
    System.out.println("Hair Type: " + s5.hairType);
    System.out.println("Herbal: " + s5.isHerbal);
    System.out.println();

    s5 = new Shampoo(150.0, 130.0, "Frizzy", false);
    System.out.println("Quantity (ml): " + s5.quantityInMl);
    System.out.println("Price: " + s5.price);
    System.out.println("Hair Type: " + s5.hairType);
    System.out.println("Herbal: " + s5.isHerbal);
    System.out.println();

    // 6
    Shampoo s6 = new Shampoo();
    s6.quantityInMl = 275.0;
    s6.price = 210.0;
    s6.hairType = "Straight";
    s6.isHerbal = true;
    System.out.println("Quantity (ml): " + s6.quantityInMl);
    System.out.println("Price: " + s6.price);
    System.out.println("Hair Type: " + s6.hairType);
    System.out.println("Herbal: " + s6.isHerbal);
    System.out.println();

    s6 = new Shampoo(275.0, 210.0, "Straight", true);
    System.out.println("Quantity (ml): " + s6.quantityInMl);
    System.out.println("Price: " + s6.price);
    System.out.println("Hair Type: " + s6.hairType);
    System.out.println("Herbal: " + s6.isHerbal);
    System.out.println();

    // 7
    Shampoo s7 = new Shampoo();
    s7.quantityInMl = 320.0;
    s7.price = 250.0;
    s7.hairType = "Colored";
    s7.isHerbal = false;
    System.out.println("Quantity (ml): " + s7.quantityInMl);
    System.out.println("Price: " + s7.price);
    System.out.println("Hair Type: " + s7.hairType);
    System.out.println("Herbal: " + s7.isHerbal);
    System.out.println();

    s7 = new Shampoo(320.0, 250.0, "Colored", false);
    System.out.println("Quantity (ml): " + s7.quantityInMl);
    System.out.println("Price: " + s7.price);
    System.out.println("Hair Type: " + s7.hairType);
    System.out.println("Herbal: " + s7.isHerbal);
    System.out.println();
    }
}
