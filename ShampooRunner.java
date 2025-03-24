class ShampooRunner {

public static void main(String shampoo[]) {

    // 1
    Shampoo s1 = new Shampoo();
    s1.shampooId = 101;
    s1.brand = "Head & Shoulders";
    s1.quantityInMl = 180.0;
    s1.isAntiDandruff = true;
    System.out.println("ID : " + s1.shampooId);
    System.out.println("Brand : " + s1.brand);
    System.out.println("Quantity (ml) : " + s1.quantityInMl);
    System.out.println("Anti-Dandruff : " + s1.isAntiDandruff);
    System.out.println();
	
    s1 = new Shampoo(s1.shampooId, s1.brand, s1.quantityInMl, s1.isAntiDandruff);
	System.out.println("ID : " + s1.shampooId);
    System.out.println("Brand : " + s1.brand);
    System.out.println("Quantity (ml) : " + s1.quantityInMl);
    System.out.println("Anti-Dandruff : " + s1.isAntiDandruff);
    System.out.println();

    // 2
    Shampoo s2 = new Shampoo();
    s2.shampooId = 102;
    s2.brand = "Dove";
    s2.quantityInMl = 200.0;
    s2.isAntiDandruff = false;
    System.out.println("ID : " + s2.shampooId);
    System.out.println("Brand : " + s2.brand);
    System.out.println("Quantity (ml) : " + s2.quantityInMl);
    System.out.println("Anti-Dandruff : " + s2.isAntiDandruff);
    System.out.println();
	
    s2 = new Shampoo(s2.shampooId, s2.brand, s2.quantityInMl, s2.isAntiDandruff);
	System.out.println("ID : " + s2.shampooId);
    System.out.println("Brand : " + s2.brand);
    System.out.println("Quantity (ml) : " + s2.quantityInMl);
    System.out.println("Anti-Dandruff : " + s2.isAntiDandruff);
    System.out.println();

    // 3
    Shampoo s3 = new Shampoo();
    s3.shampooId = 103;
    s3.brand = "Clinic Plus";
    s3.quantityInMl = 340.0;
    s3.isAntiDandruff = false;
    System.out.println("ID : " + s3.shampooId);
    System.out.println("Brand  : " + s3.brand);
    System.out.println("Quantity (ml) : " + s3.quantityInMl);
    System.out.println("Anti-Dandruff : " + s3.isAntiDandruff);
    System.out.println();
	
    s3 = new Shampoo(s3.shampooId, s3.brand, s3.quantityInMl, s3.isAntiDandruff);
	System.out.println("ID : " + s3.shampooId);
    System.out.println("Brand  : " + s3.brand);
    System.out.println("Quantity (ml) : " + s3.quantityInMl);
    System.out.println("Anti-Dandruff : " + s3.isAntiDandruff);
    System.out.println();

    // 4
    Shampoo s4 = new Shampoo();
    s4.shampooId = 104;
    s4.brand = "Pantene";
    s4.quantityInMl = 250.0;
    s4.isAntiDandruff = false;
    System.out.println("ID  : " + s4.shampooId);
    System.out.println("Brand : " + s4.brand);
    System.out.println("Quantity (ml) : " + s4.quantityInMl);
    System.out.println("Anti-Dandruff : " + s4.isAntiDandruff);
    System.out.println();
	
    s4 = new Shampoo(s4.shampooId, s4.brand, s4.quantityInMl, s4.isAntiDandruff);
	System.out.println("ID  : " + s4.shampooId);
    System.out.println("Brand : " + s4.brand);
    System.out.println("Quantity (ml) : " + s4.quantityInMl);
    System.out.println("Anti-Dandruff : " + s4.isAntiDandruff);
    System.out.println();

    // 5
    Shampoo s5 = new Shampoo();
    s5.shampooId = 105;
    s5.brand = "Sunsilk";
    s5.quantityInMl = 180.0;
    s5.isAntiDandruff = true;
    System.out.println("ID : " + s5.shampooId);
    System.out.println("Brand : " + s5.brand);
    System.out.println("Quantity (ml) : " + s5.quantityInMl);
    System.out.println("Anti-Dandruff : " + s5.isAntiDandruff);
    System.out.println();
	
    s5 = new Shampoo(s5.shampooId, s5.brand, s5.quantityInMl, s5.isAntiDandruff);
	System.out.println("ID : " + s5.shampooId);
    System.out.println("Brand : " + s5.brand);
    System.out.println("Quantity (ml) : " + s5.quantityInMl);
    System.out.println("Anti-Dandruff : " + s5.isAntiDandruff);
    System.out.println();

    // 6
    Shampoo s6 = new Shampoo();
    s6.shampooId = 106;
    s6.brand = "Tresemme";
    s6.quantityInMl = 225.0;
    s6.isAntiDandruff = false;
    System.out.println("ID : " + s6.shampooId);
    System.out.println("Brand  : " + s6.brand);
    System.out.println("Quantity (ml) : " + s6.quantityInMl);
    System.out.println("Anti-Dandruff : " + s6.isAntiDandruff);
    System.out.println();
	
    s6 = new Shampoo(s6.shampooId, s6.brand, s6.quantityInMl, s6.isAntiDandruff);
	System.out.println("ID : " + s6.shampooId);
    System.out.println("Brand  : " + s6.brand);
    System.out.println("Quantity (ml) : " + s6.quantityInMl);
    System.out.println("Anti-Dandruff : " + s6.isAntiDandruff);
    System.out.println();

    // 7
    Shampoo s7 = new Shampoo();
    s7.shampooId = 107;
    s7.brand = "Biotique";
    s7.quantityInMl = 300.0;
    s7.isAntiDandruff = true;
    System.out.println("ID : " + s7.shampooId);
    System.out.println("Brand  : " + s7.brand);
    System.out.println("Quantity (ml) : " + s7.quantityInMl);
    System.out.println("Anti-Dandruff : " + s7.isAntiDandruff);
    System.out.println();
	
    s7 = new Shampoo(s7.shampooId, s7.brand, s7.quantityInMl, s7.isAntiDandruff);
	System.out.println("ID : " + s7.shampooId);
    System.out.println("Brand  : " + s7.brand);
    System.out.println("Quantity (ml) : " + s7.quantityInMl);
    System.out.println("Anti-Dandruff : " + s7.isAntiDandruff);
    System.out.println();
    }
}
