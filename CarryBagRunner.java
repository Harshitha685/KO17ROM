class CarryBagRunner {

public static void main(String[] args) {

    // 1
    CarryBag bag1 = new CarryBag();
    bag1.brand = "Wildcraft";
    bag1.capacityInLiters = 30;
    bag1.isWaterProof = true;
    bag1.color = "Black";
    System.out.println("Brand : " + bag1.brand);
    System.out.println("Capacity  : " + bag1.capacityInLiters + "L");
    System.out.println("Waterproof  : " + bag1.isWaterProof);
    System.out.println("Color : " + bag1.color);
    System.out.println();
	
    bag1 = new CarryBag(bag1.brand, bag1.capacityInLiters, bag1.isWaterProof, bag1.color);
	System.out.println("Brand : " + bag1.brand);
    System.out.println("Capacity  : " + bag1.capacityInLiters + "L");
    System.out.println("Waterproof  : " + bag1.isWaterProof);
    System.out.println("Color : " + bag1.color);
    System.out.println();

    // 2
    CarryBag bag2 = new CarryBag();
    bag2.brand = "Skybags";
    bag2.capacityInLiters = 25;
    bag2.isWaterProof = false;
    bag2.color = "Blue";
    System.out.println("Brand : " + bag2.brand);
    System.out.println("Capacity  : " + bag2.capacityInLiters + "L");
    System.out.println("Waterproof    : " + bag2.isWaterProof);
    System.out.println("Color  : " + bag2.color);
    System.out.println();
	
    bag2 = new CarryBag(bag2.brand, bag2.capacityInLiters, bag2.isWaterProof, bag2.color);
	System.out.println("Brand : " + bag2.brand);
    System.out.println("Capacity  : " + bag2.capacityInLiters + "L");
    System.out.println("Waterproof    : " + bag2.isWaterProof);
    System.out.println("Color  : " + bag2.color);
    System.out.println();

    // 3
    CarryBag bag3 = new CarryBag();
    bag3.brand = "American Tourister";
    bag3.capacityInLiters = 35;
    bag3.isWaterProof = true;
    bag3.color = "Red";
    System.out.println("Brand  : " + bag3.brand);
    System.out.println("Capacity : " + bag3.capacityInLiters + "L");
    System.out.println("Waterproof    : " + bag3.isWaterProof);
    System.out.println("Color  : " + bag3.color);
    System.out.println();
	
    bag3 = new CarryBag(bag3.brand, bag3.capacityInLiters, bag3.isWaterProof, bag3.color);
	System.out.println("Brand  : " + bag3.brand);
    System.out.println("Capacity : " + bag3.capacityInLiters + "L");
    System.out.println("Waterproof    : " + bag3.isWaterProof);
    System.out.println("Color  : " + bag3.color);
    System.out.println();

    // 4
    CarryBag bag4 = new CarryBag();
    bag4.brand = "Puma";
    bag4.capacityInLiters = 20;
    bag4.isWaterProof = false;
    bag4.color = "Green";
    System.out.println("Brand : " + bag4.brand);
    System.out.println("Capacity : " + bag4.capacityInLiters + "L");
    System.out.println("Waterproof    : " + bag4.isWaterProof);
    System.out.println("Color  : " + bag4.color);
    System.out.println();
	
    bag4 = new CarryBag(bag4.brand, bag4.capacityInLiters, bag4.isWaterProof, bag4.color);
	System.out.println("Brand : " + bag4.brand);
    System.out.println("Capacity : " + bag4.capacityInLiters + "L");
    System.out.println("Waterproof    : " + bag4.isWaterProof);
    System.out.println("Color  : " + bag4.color);
    System.out.println();

    // 5
    CarryBag bag5 = new CarryBag();
    bag5.brand = "Nike";
    bag5.capacityInLiters = 28;
    bag5.isWaterProof = true;
    bag5.color = "Gray";
    System.out.println("Brand : " + bag5.brand);
    System.out.println("Capacity : " + bag5.capacityInLiters + "L");
    System.out.println("Waterproof    : " + bag5.isWaterProof);
    System.out.println("Color : " + bag5.color);
    System.out.println();
	
    bag5 = new CarryBag(bag5.brand, bag5.capacityInLiters, bag5.isWaterProof, bag5.color);
	System.out.println("Brand : " + bag5.brand);
    System.out.println("Capacity      : " + bag5.capacityInLiters + "L");
    System.out.println("Waterproof    : " + bag5.isWaterProof);
    System.out.println("Color : " + bag5.color);
    System.out.println();

    // 6
    CarryBag bag6 = new CarryBag();
    bag6.brand = "Fastrack";
    bag6.capacityInLiters = 32;
    bag6.isWaterProof = false;
    bag6.color = "Orange";
    System.out.println("Brand : " + bag6.brand);
    System.out.println("Capacity : " + bag6.capacityInLiters + "L");
    System.out.println("Waterproof    : " + bag6.isWaterProof);
    System.out.println("Color: " + bag6.color);
    System.out.println();
	
    bag6 = new CarryBag(bag6.brand, bag6.capacityInLiters, bag6.isWaterProof, bag6.color);
	System.out.println("Brand : " + bag6.brand);
    System.out.println("Capacity : " + bag6.capacityInLiters + "L");
    System.out.println("Waterproof    : " + bag6.isWaterProof);
    System.out.println("Color: " + bag6.color);
    System.out.println();
	
    // 7
    CarryBag bag7 = new CarryBag();
    bag7.brand = "Aristocrat";
    bag7.capacityInLiters = 40;
    bag7.isWaterProof = true;
    bag7.color = "Yellow";
    System.out.println("Brand: " + bag7.brand);
    System.out.println("Capacity      : " + bag7.capacityInLiters + "L");
    System.out.println("Waterproof    : " + bag7.isWaterProof);
    System.out.println("Color  : " + bag7.color);
    System.out.println();
	
    bag7 = new CarryBag(bag7.brand, bag7.capacityInLiters, bag7.isWaterProof, bag7.color);
	System.out.println("Brand: " + bag7.brand);
    System.out.println("Capacity      : " + bag7.capacityInLiters + "L");
    System.out.println("Waterproof    : " + bag7.isWaterProof);
    System.out.println("Color  : " + bag7.color);
    System.out.println();
    }
}
