class SoapRunner {

public static void main(String soap[]) {

    // 1
    Soap s1 = new Soap(); // default constructor
    s1.skinType = "Dry";
    s1.color = "White";
    s1.isOrganic = true;
    System.out.println("Skin Type : " + s1.skinType);
    System.out.println("Color     : " + s1.color);
    System.out.println("Is Organic: " + s1.isOrganic);
    System.out.println();

    s1 = new Soap(s1.skinType, s1.color, s1.isOrganic); // parameterized
    System.out.println("Skin Type : " + s1.skinType);
    System.out.println("Color     : " + s1.color);
    System.out.println("Is Organic: " + s1.isOrganic);
    System.out.println();

    // 2
    Soap s2 = new Soap();
    s2.skinType = "Oily";
    s2.color = "Green";
    s2.isOrganic = false;
    System.out.println("Skin Type : " + s2.skinType);
    System.out.println("Color     : " + s2.color);
    System.out.println("Is Organic: " + s2.isOrganic);
    System.out.println();

    s2 = new Soap(s2.skinType, s2.color, s2.isOrganic);
    System.out.println("Skin Type : " + s2.skinType);
    System.out.println("Color     : " + s2.color);
    System.out.println("Is Organic: " + s2.isOrganic);
    System.out.println();

    // 3
    Soap s3 = new Soap();
    s3.skinType = "Sensitive";
    s3.color = "Yellow";
    s3.isOrganic = true;
    System.out.println("Skin Type : " + s3.skinType);
    System.out.println("Color     : " + s3.color);
    System.out.println("Is Organic: " + s3.isOrganic);
    System.out.println();

    s3 = new Soap(s3.skinType, s3.color, s3.isOrganic);
    System.out.println("Skin Type : " + s3.skinType);
    System.out.println("Color     : " + s3.color);
    System.out.println("Is Organic: " + s3.isOrganic);
    System.out.println();

    // 4
    Soap s4 = new Soap();
    s4.skinType = "Combination";
    s4.color = "Pink";
    s4.isOrganic = false;
    System.out.println("Skin Type : " + s4.skinType);
    System.out.println("Color     : " + s4.color);
    System.out.println("Is Organic: " + s4.isOrganic);
    System.out.println();

    s4 = new Soap(s4.skinType, s4.color, s4.isOrganic);
    System.out.println("Skin Type : " + s4.skinType);
    System.out.println("Color     : " + s4.color);
    System.out.println("Is Organic: " + s4.isOrganic);
    System.out.println();

    // 5
    Soap s5 = new Soap();
    s5.skinType = "Normal";
    s5.color = "Blue";
    s5.isOrganic = true;
    System.out.println("Skin Type : " + s5.skinType);
    System.out.println("Color     : " + s5.color);
    System.out.println("Is Organic: " + s5.isOrganic);
    System.out.println();

    s5 = new Soap(s5.skinType, s5.color, s5.isOrganic);
    System.out.println("Skin Type : " + s5.skinType);
    System.out.println("Color     : " + s5.color);
    System.out.println("Is Organic: " + s5.isOrganic);
    System.out.println();
	
	 // 6
    Soap s6 = new Soap();
    s6.skinType = "Acne-Prone";
    s6.color = "Orange";
    s6.isOrganic = false;
    System.out.println("Skin Type : " + s6.skinType);
    System.out.println("Color     : " + s6.color);
    System.out.println("Is Organic: " + s6.isOrganic);
    System.out.println();

    s6 = new Soap(s6.skinType, s6.color, s6.isOrganic);
    System.out.println("Skin Type : " + s6.skinType);
    System.out.println("Color     : " + s6.color);
    System.out.println("Is Organic: " + s6.isOrganic);
    System.out.println();

    // 7
    Soap s7 = new Soap();
    s7.skinType = "All Types";
    s7.color = "Purple";
    s7.isOrganic = true;
    System.out.println("Skin Type : " + s7.skinType);
    System.out.println("Color     : " + s7.color);
    System.out.println("Is Organic: " + s7.isOrganic);
    System.out.println();

    s7 = new Soap(s7.skinType, s7.color, s7.isOrganic);
    System.out.println("Skin Type : " + s7.skinType);
    System.out.println("Color     : " + s7.color);
    System.out.println("Is Organic: " + s7.isOrganic);
    System.out.println();

    }
}
