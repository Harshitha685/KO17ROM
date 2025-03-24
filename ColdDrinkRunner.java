class ColdDrinkRunner {

public static void main(String cold[]) {

    // 1
    ColdDrink cd1 = new ColdDrink();
    cd1.manufacturer = "FizzCo";
    cd1.essence = "Cola";
    cd1.bottleSize = 1.25;
    cd1.isSparkling = true;

    System.out.println("Default Constructor:");
    System.out.println("Manufacturer : " + cd1.manufacturer);
    System.out.println("Essence      : " + cd1.essence);
    System.out.println("Bottle Size  : " + cd1.bottleSize + " L");
    System.out.println("Is Sparkling : " + cd1.isSparkling);
    System.out.println();

    cd1 = new ColdDrink("FizzCo", "Cola", 1.25, true);
    System.out.println("Parameterized Constructor:");
    System.out.println("Manufacturer : " + cd1.manufacturer);
    System.out.println("Essence      : " + cd1.essence);
    System.out.println("Bottle Size  : " + cd1.bottleSize + " L");
    System.out.println("Is Sparkling : " + cd1.isSparkling);
    System.out.println();

    // 2
    ColdDrink cd2 = new ColdDrink();
    cd2.manufacturer = "CoolSip";
    cd2.essence = "Lemon";
    cd2.bottleSize = 0.5;
    cd2.isSparkling = false;

    System.out.println("Default Constructor:");
    System.out.println("Manufacturer : " + cd2.manufacturer);
    System.out.println("Essence      : " + cd2.essence);
    System.out.println("Bottle Size  : " + cd2.bottleSize + " L");
    System.out.println("Is Sparkling : " + cd2.isSparkling);
    System.out.println();

    cd2 = new ColdDrink("CoolSip", "Lemon", 0.5, false);
    System.out.println("Parameterized Constructor:");
    System.out.println("Manufacturer : " + cd2.manufacturer);
    System.out.println("Essence      : " + cd2.essence);
    System.out.println("Bottle Size  : " + cd2.bottleSize + " L");
    System.out.println("Is Sparkling : " + cd2.isSparkling);
    System.out.println();

    // 3
    ColdDrink cd3 = new ColdDrink();
    cd3.manufacturer = "ZingPop";
    cd3.essence = "Orange";
    cd3.bottleSize = 0.75;
    cd3.isSparkling = true;

    System.out.println("Default Constructor:");
    System.out.println("Manufacturer : " + cd3.manufacturer);
    System.out.println("Essence      : " + cd3.essence);
    System.out.println("Bottle Size  : " + cd3.bottleSize + " L");
    System.out.println("Is Sparkling : " + cd3.isSparkling);
    System.out.println();

    cd3 = new ColdDrink("ZingPop", "Orange", 0.75, true);
    System.out.println("Parameterized Constructor:");
    System.out.println("Manufacturer : " + cd3.manufacturer);
    System.out.println("Essence      : " + cd3.essence);
    System.out.println("Bottle Size  : " + cd3.bottleSize + " L");
    System.out.println("Is Sparkling : " + cd3.isSparkling);
    System.out.println();

    // 4
    ColdDrink cd4 = new ColdDrink();
    cd4.manufacturer = "SparkFizz";
    cd4.essence = "Ginger Ale";
    cd4.bottleSize = 1.0;
    cd4.isSparkling = true;

    System.out.println("Default Constructor:");
    System.out.println("Manufacturer : " + cd4.manufacturer);
    System.out.println("Essence      : " + cd4.essence);
    System.out.println("Bottle Size  : " + cd4.bottleSize + " L");
    System.out.println("Is Sparkling : " + cd4.isSparkling);
    System.out.println();

    cd4 = new ColdDrink("SparkFizz", "Ginger Ale", 1.0, true);
    System.out.println("Parameterized Constructor:");
    System.out.println("Manufacturer : " + cd4.manufacturer);
    System.out.println("Essence      : " + cd4.essence);
    System.out.println("Bottle Size  : " + cd4.bottleSize + " L");
    System.out.println("Is Sparkling : " + cd4.isSparkling);
    System.out.println();

    // 5
    ColdDrink cd5 = new ColdDrink();
    cd5.manufacturer = "BubbleJoy";
    cd5.essence = "Apple";
    cd5.bottleSize = 0.33;
    cd5.isSparkling = false;

    System.out.println("Default Constructor:");
    System.out.println("Manufacturer : " + cd5.manufacturer);
    System.out.println("Essence      : " + cd5.essence);
    System.out.println("Bottle Size  : " + cd5.bottleSize + " L");
    System.out.println("Is Sparkling : " + cd5.isSparkling);
    System.out.println();

    cd5 = new ColdDrink("BubbleJoy", "Apple", 0.33, false);
    System.out.println("Parameterized Constructor:");
    System.out.println("Manufacturer : " + cd5.manufacturer);
    System.out.println("Essence      : " + cd5.essence);
    System.out.println("Bottle Size  : " + cd5.bottleSize + " L");
    System.out.println("Is Sparkling : " + cd5.isSparkling);
    System.out.println();

    // 6
    ColdDrink cd6 = new ColdDrink();
    cd6.manufacturer = "ChillZone";
    cd6.essence = "Berry";
    cd6.bottleSize = 1.5;
    cd6.isSparkling = true;

    System.out.println("Default Constructor:");
    System.out.println("Manufacturer : " + cd6.manufacturer);
    System.out.println("Essence      : " + cd6.essence);
    System.out.println("Bottle Size  : " + cd6.bottleSize + " L");
    System.out.println("Is Sparkling : " + cd6.isSparkling);
    System.out.println();

    cd6 = new ColdDrink("ChillZone", "Berry", 1.5, true);
    System.out.println("Parameterized Constructor:");
    System.out.println("Manufacturer : " + cd6.manufacturer);
    System.out.println("Essence      : " + cd6.essence);
    System.out.println("Bottle Size  : " + cd6.bottleSize + " L");
    System.out.println("Is Sparkling : " + cd6.isSparkling);
    System.out.println();

    // 7
    ColdDrink cd7 = new ColdDrink();
    cd7.manufacturer = "RefreshIt";
    cd7.essence = "Mango";
    cd7.bottleSize = 0.6;
    cd7.isSparkling = false;

    System.out.println("Default Constructor:");
    System.out.println("Manufacturer : " + cd7.manufacturer);
    System.out.println("Essence      : " + cd7.essence);
    System.out.println("Bottle Size  : " + cd7.bottleSize + " L");
    System.out.println("Is Sparkling : " + cd7.isSparkling);
    System.out.println();

    cd7 = new ColdDrink("RefreshIt", "Mango", 0.6, false);
    System.out.println("Parameterized Constructor:");
    System.out.println("Manufacturer : " + cd7.manufacturer);
    System.out.println("Essence      : " + cd7.essence);
    System.out.println("Bottle Size  : " + cd7.bottleSize + " L");
    System.out.println("Is Sparkling : " + cd7.isSparkling);
    System.out.println();
    }
}
