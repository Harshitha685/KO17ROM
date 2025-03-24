class CarryBagRunner {

public static void main(String bag[]) {

    // 1
    CarryBag cb1 = new CarryBag();  // default constructor
    cb1.label = "Wildcraft";
    cb1.capacityInLiters = 30.0;
    cb1.isWaterProof = true;
    cb1.color = "Black";

    System.out.println("Label      : " + cb1.label);
    System.out.println("Capacity   : " + cb1.capacityInLiters + " L");
    System.out.println("Waterproof : " + cb1.isWaterProof);
    System.out.println("Color      : " + cb1.color);
    System.out.println();

    cb1 = new CarryBag("Wildcraft", 30.0, true, "Black");  // parameterized constructor
    System.out.println("Label      : " + cb1.label);
    System.out.println("Capacity   : " + cb1.capacityInLiters + " L");
    System.out.println("Waterproof : " + cb1.isWaterProof);
    System.out.println("Color      : " + cb1.color);
    System.out.println();

    // 2
    CarryBag cb2 = new CarryBag();
    cb2.label = "American Tourister";
    cb2.capacityInLiters = 25.5;
    cb2.isWaterProof = false;
    cb2.color = "Red";

    System.out.println("Label      : " + cb2.label);
    System.out.println("Capacity   : " + cb2.capacityInLiters + " L");
    System.out.println("Waterproof : " + cb2.isWaterProof);
    System.out.println("Color      : " + cb2.color);
    System.out.println();

    cb2 = new CarryBag("American Tourister", 25.5, false, "Red");
    System.out.println("Label      : " + cb2.label);
    System.out.println("Capacity   : " + cb2.capacityInLiters + " L");
    System.out.println("Waterproof : " + cb2.isWaterProof);
    System.out.println("Color      : " + cb2.color);
    System.out.println();

    // 3
    CarryBag cb3 = new CarryBag();
    cb3.label = "Nike";
    cb3.capacityInLiters = 35.0;
    cb3.isWaterProof = true;
    cb3.color = "Blue";

    System.out.println("Label      : " + cb3.label);
    System.out.println("Capacity   : " + cb3.capacityInLiters + " L");
    System.out.println("Waterproof : " + cb3.isWaterProof);
    System.out.println("Color      : " + cb3.color);
    System.out.println();

    cb3 = new CarryBag("Nike", 35.0, true, "Blue");
    System.out.println("Label      : " + cb3.label);
    System.out.println("Capacity   : " + cb3.capacityInLiters + " L");
    System.out.println("Waterproof : " + cb3.isWaterProof);
    System.out.println("Color      : " + cb3.color);
    System.out.println();

    // 4
    CarryBag cb4 = new CarryBag();
    cb4.label = "Skybags";
    cb4.capacityInLiters = 28.0;
    cb4.isWaterProof = false;
    cb4.color = "Grey";

    System.out.println("Label      : " + cb4.label);
    System.out.println("Capacity   : " + cb4.capacityInLiters + " L");
    System.out.println("Waterproof : " + cb4.isWaterProof);
    System.out.println("Color      : " + cb4.color);
    System.out.println();

    cb4 = new CarryBag("Skybags", 28.0, false, "Grey");
    System.out.println("Label      : " + cb4.label);
    System.out.println("Capacity   : " + cb4.capacityInLiters + " L");
    System.out.println("Waterproof : " + cb4.isWaterProof);
    System.out.println("Color      : " + cb4.color);
    System.out.println();

    // 5
    CarryBag cb5 = new CarryBag();
    cb5.label = "Fastrack";
    cb5.capacityInLiters = 20.0;
    cb5.isWaterProof = true;
    cb5.color = "Yellow";

    System.out.println("Label      : " + cb5.label);
    System.out.println("Capacity   : " + cb5.capacityInLiters + " L");
    System.out.println("Waterproof : " + cb5.isWaterProof);
    System.out.println("Color      : " + cb5.color);
    System.out.println();

    cb5 = new CarryBag("Fastrack", 20.0, true, "Yellow");
    System.out.println("Label      : " + cb5.label);
    System.out.println("Capacity   : " + cb5.capacityInLiters + " L");
    System.out.println("Waterproof : " + cb5.isWaterProof);
    System.out.println("Color      : " + cb5.color);
    System.out.println();

    // 6
    CarryBag cb6 = new CarryBag();
    cb6.label = "Puma";
    cb6.capacityInLiters = 18.0;
    cb6.isWaterProof = false;
    cb6.color = "Green";

    System.out.println("Label      : " + cb6.label);
    System.out.println("Capacity   : " + cb6.capacityInLiters + " L");
    System.out.println("Waterproof : " + cb6.isWaterProof);
    System.out.println("Color      : " + cb6.color);
    System.out.println();

    cb6 = new CarryBag("Puma", 18.0, false, "Green");
    System.out.println("Label      : " + cb6.label);
    System.out.println("Capacity   : " + cb6.capacityInLiters + " L");
    System.out.println("Waterproof : " + cb6.isWaterProof);
    System.out.println("Color      : " + cb6.color);
    System.out.println();

    // 7
    CarryBag cb7 = new CarryBag();
    cb7.label = "Adidas";
    cb7.capacityInLiters = 22.0;
    cb7.isWaterProof = true;
    cb7.color = "White";

    System.out.println("Label      : " + cb7.label);
    System.out.println("Capacity   : " + cb7.capacityInLiters + " L");
    System.out.println("Waterproof : " + cb7.isWaterProof);
    System.out.println("Color      : " + cb7.color);
    System.out.println();

    cb7 = new CarryBag("Adidas", 22.0, true, "White");
    System.out.println("Label      : " + cb7.label);
    System.out.println("Capacity   : " + cb7.capacityInLiters + " L");
    System.out.println("Waterproof : " + cb7.isWaterProof);
    System.out.println("Color      : " + cb7.color);
    System.out.println();
    }
}
