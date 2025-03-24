class SoapRunner {

public static void main(String soap[]) {

    // 1
    Soap s1 = new Soap();
    s1.soapId = 1;
    s1.brand = "Lux";
    s1.weightInGrams = 100;
    s1.isFragrant = true;
    System.out.println("Soap ID : " + s1.soapId);
    System.out.println("Brand  : " + s1.brand);
    System.out.println("Weight : " + s1.weightInGrams);
    System.out.println("Is Fragrant : " + s1.isFragrant);
    System.out.println();
	
    s1 = new Soap(s1.soapId, s1.brand, s1.weightInGrams, s1.isFragrant);
	System.out.println("Soap ID : " + s1.soapId);
    System.out.println("Brand  : " + s1.brand);
    System.out.println("Weight : " + s1.weightInGrams);
    System.out.println("Is Fragrant : " + s1.isFragrant);
    System.out.println();

    // 2
    Soap s2 = new Soap();
    s2.soapId = 2;
    s2.brand = "Dove";
    s2.weightInGrams = 125;
    s2.isFragrant = true;
    System.out.println("Soap ID  : " + s2.soapId);
    System.out.println("Brand : " + s2.brand);
    System.out.println("Weight : " + s2.weightInGrams);
    System.out.println("Is Fragrant : " + s2.isFragrant);
    System.out.println();
	
    s2 = new Soap(s2.soapId, s2.brand, s2.weightInGrams, s2.isFragrant);
    System.out.println("Soap ID  : " + s2.soapId);
    System.out.println("Brand : " + s2.brand);
    System.out.println("Weight : " + s2.weightInGrams);
    System.out.println("Is Fragrant : " + s2.isFragrant);
    System.out.println();

    // 3
    Soap s3 = new Soap();
    s3.soapId = 3;
    s3.brand = "Pears";
    s3.weightInGrams = 115;
    s3.isFragrant = true;
    System.out.println("Soap ID : " + s3.soapId);
    System.out.println("Brand  : " + s3.brand);
    System.out.println("Weight : " + s3.weightInGrams);
    System.out.println("Is Fragrant : " + s3.isFragrant);
    System.out.println();
	
    s3 = new Soap(s3.soapId, s3.brand, s3.weightInGrams, s3.isFragrant);
	System.out.println("Soap ID : " + s3.soapId);
    System.out.println("Brand  : " + s3.brand);
    System.out.println("Weight : " + s3.weightInGrams);
    System.out.println("Is Fragrant : " + s3.isFragrant);
    System.out.println();

    // 4
    Soap s4 = new Soap();
    s4.soapId = 4;
    s4.brand = "Cinthol";
    s4.weightInGrams = 100;
    s4.isFragrant = true;
    System.out.println("Soap ID : " + s4.soapId);
    System.out.println("Brand  : " + s4.brand);
    System.out.println("Weight: " + s4.weightInGrams);
    System.out.println("Is Fragrant : " + s4.isFragrant);
    System.out.println();
	
    s4 = new Soap(s4.soapId, s4.brand, s4.weightInGrams, s4.isFragrant);
	System.out.println("Soap ID : " + s4.soapId);
    System.out.println("Brand  : " + s4.brand);
    System.out.println("Weight: " + s4.weightInGrams);
    System.out.println("Is Fragrant : " + s4.isFragrant);
    System.out.println();

    // 5
    Soap s5 = new Soap();
    s5.soapId = 5;
    s5.brand = "Liril";
    s5.weightInGrams = 120;
    s5.isFragrant = true;
    System.out.println("Soap ID  : " + s5.soapId);
    System.out.println("Brand  : " + s5.brand);
    System.out.println("Weight: " + s5.weightInGrams);
    System.out.println("Is Fragrant : " + s5.isFragrant);
    System.out.println();
	
    s5 = new Soap(s5.soapId, s5.brand, s5.weightInGrams, s5.isFragrant);
	System.out.println("Soap ID  : " + s5.soapId);
    System.out.println("Brand  : " + s5.brand);
    System.out.println("Weight: " + s5.weightInGrams);
    System.out.println("Is Fragrant : " + s5.isFragrant);
    System.out.println();

    // 6
    Soap s6 = new Soap();
    s6.soapId = 6;
    s6.brand = "Medimix";
    s6.weightInGrams = 105;
    s6.isFragrant = false;
    System.out.println("Soap ID  : " + s6.soapId);
    System.out.println("Brand : " + s6.brand);
    System.out.println("Weight  : " + s6.weightInGrams);
    System.out.println("Is Fragrant  : " + s6.isFragrant);
    System.out.println();
	
    s6 = new Soap(s6.soapId, s6.brand, s6.weightInGrams, s6.isFragrant);
	System.out.println("Soap ID  : " + s6.soapId);
    System.out.println("Brand : " + s6.brand);
    System.out.println("Weight  : " + s6.weightInGrams);
    System.out.println("Is Fragrant  : " + s6.isFragrant);
    System.out.println();

    // 7
    Soap s7 = new Soap();
    s7.soapId = 7;
    s7.brand = "Dettol";
    s7.weightInGrams = 110;
    s7.isFragrant = false;
    System.out.println("Soap ID  : " + s7.soapId);
    System.out.println("Brand : " + s7.brand);
    System.out.println("Weight : " + s7.weightInGrams);
    System.out.println("Is Fragrant : " + s7.isFragrant);
    System.out.println();
	
    s7 = new Soap(s7.soapId, s7.brand, s7.weightInGrams, s7.isFragrant);
	System.out.println("Soap ID  : " + s7.soapId);
    System.out.println("Brand : " + s7.brand);
    System.out.println("Weight : " + s7.weightInGrams);
    System.out.println("Is Fragrant : " + s7.isFragrant);
    System.out.println();
    }
}
