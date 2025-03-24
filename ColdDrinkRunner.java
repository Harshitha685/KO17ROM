class ColdDrinkRunner {

public static void main(String cold[]) {
        
    // 1
    ColdDrink c1 = new ColdDrink();
    c1.brand = "Coca-Cola";
    c1.flavour = "Classic";
    c1.volumeInLitres = 1.5;
    c1.isCarbonated = true;
    System.out.println("Brand: " + c1.brand);
    System.out.println("Flavour: " + c1.flavour);
    System.out.println("Volume: " + c1.volumeInLitres + "L");
    System.out.println("Carbonated: " + c1.isCarbonated);
    System.out.println();
	
    c1 = new ColdDrink(c1.brand, c1.flavour, c1.volumeInLitres, c1.isCarbonated);
	System.out.println("Brand: " + c1.brand);
    System.out.println("Flavour: " + c1.flavour);
    System.out.println("Volume: " + c1.volumeInLitres + "L");
    System.out.println("Carbonated: " + c1.isCarbonated);
    System.out.println();

    // 2
    ColdDrink c2 = new ColdDrink();
    c2.brand = "Pepsi";
    c2.flavour = "Cola";
    c2.volumeInLitres = 2.0;
    c2.isCarbonated = true;
    System.out.println("Brand: " + c2.brand);
    System.out.println("Flavour: " + c2.flavour);
    System.out.println("Volume: " + c2.volumeInLitres + "L");
    System.out.println("Carbonated: " + c2.isCarbonated);
    System.out.println();
	
    c2 = new ColdDrink(c2.brand, c2.flavour, c2.volumeInLitres, c2.isCarbonated);
	System.out.println("Brand: " + c2.brand);
    System.out.println("Flavour: " + c2.flavour);
    System.out.println("Volume: " + c2.volumeInLitres + "L");
    System.out.println("Carbonated: " + c2.isCarbonated);
    System.out.println();

    // 3
    ColdDrink c3 = new ColdDrink();
    c3.brand = "Sprite";
    c3.flavour = "Lemon-Lime";
    c3.volumeInLitres = 1.0;
    c3.isCarbonated = true;
    System.out.println("Brand: " + c3.brand);
    System.out.println("Flavour: " + c3.flavour);
    System.out.println("Volume: " + c3.volumeInLitres + "L");
    System.out.println("Carbonated: " + c3.isCarbonated);
    System.out.println();
	
    c3 = new ColdDrink(c3.brand, c3.flavour, c3.volumeInLitres, c3.isCarbonated);
	System.out.println("Brand: " + c3.brand);
    System.out.println("Flavour: " + c3.flavour);
    System.out.println("Volume: " + c3.volumeInLitres + "L");
    System.out.println("Carbonated: " + c3.isCarbonated);
    System.out.println();

    // 4
    ColdDrink c4 = new ColdDrink();
    c4.brand = "Maaza";
    c4.flavour = "Mango";
    c4.volumeInLitres = 0.75;
    c4.isCarbonated = false;
    System.out.println("Brand: " + c4.brand);
    System.out.println("Flavour: " + c4.flavour);
    System.out.println("Volume: " + c4.volumeInLitres + "L");
    System.out.println("Carbonated: " + c4.isCarbonated);
    System.out.println();
	
    c4 = new ColdDrink(c4.brand, c4.flavour, c4.volumeInLitres, c4.isCarbonated);
	System.out.println("Brand: " + c4.brand);
    System.out.println("Flavour: " + c4.flavour);
    System.out.println("Volume: " + c4.volumeInLitres + "L");
    System.out.println("Carbonated: " + c4.isCarbonated);
    System.out.println();

    // 5
    ColdDrink c5 = new ColdDrink();
    c5.brand = "Fanta";
    c5.flavour = "Orange";
    c5.volumeInLitres = 1.25;
    c5.isCarbonated = true;
    System.out.println("Brand: " + c5.brand);
    System.out.println("Flavour: " + c5.flavour);
    System.out.println("Volume: " + c5.volumeInLitres + "L");
    System.out.println("Carbonated: " + c5.isCarbonated);
    System.out.println();
	
    c5 = new ColdDrink(c5.brand, c5.flavour, c5.volumeInLitres, c5.isCarbonated);
	System.out.println("Brand: " + c5.brand);
    System.out.println("Flavour: " + c5.flavour);
    System.out.println("Volume: " + c5.volumeInLitres + "L");
    System.out.println("Carbonated: " + c5.isCarbonated);
    System.out.println();

    // 6
    ColdDrink c6 = new ColdDrink();
    c6.brand = "Slice";
    c6.flavour = "Mango";
    c6.volumeInLitres = 0.5;
    c6.isCarbonated = false;
    System.out.println("Brand: " + c6.brand);
    System.out.println("Flavour: " + c6.flavour);
    System.out.println("Volume: " + c6.volumeInLitres + "L");
    System.out.println("Carbonated: " + c6.isCarbonated);
    System.out.println();
	
    c6 = new ColdDrink(c6.brand, c6.flavour, c6.volumeInLitres, c6.isCarbonated);
	System.out.println("Brand: " + c6.brand);
    System.out.println("Flavour: " + c6.flavour);
    System.out.println("Volume: " + c6.volumeInLitres + "L");
    System.out.println("Carbonated: " + c6.isCarbonated);
    System.out.println();

    // 7
    ColdDrink c7 = new ColdDrink();
    c7.brand = "7Up";
    c7.flavour = "Lemon";
    c7.volumeInLitres = 1.0;
    c7.isCarbonated = true;
    System.out.println("Brand: " + c7.brand);
    System.out.println("Flavour: " + c7.flavour);
    System.out.println("Volume: " + c7.volumeInLitres + "L");
    System.out.println("Carbonated: " + c7.isCarbonated);
    System.out.println();
	
    c7 = new ColdDrink(c7.brand, c7.flavour, c7.volumeInLitres, c7.isCarbonated);
	System.out.println("Brand: " + c7.brand);
    System.out.println("Flavour: " + c7.flavour);
    System.out.println("Volume: " + c7.volumeInLitres + "L");
    System.out.println("Carbonated: " + c7.isCarbonated);
    System.out.println();
    }
}
