class ColdDrink {

    String brand;
    String flavour;
    double volumeInLitres;
    boolean isCarbonated;

    ColdDrink() {
        System.out.println("A new cold drink is available in the market!");
    }

    ColdDrink(String brand, String flavour, double volumeInLitres, boolean isCarbonated) {
        System.out.println("A new cold drink is available in the market!");
        this.brand = brand;
        this.flavour = flavour;
        this.volumeInLitres = volumeInLitres;
        this.isCarbonated = isCarbonated;
    }
}
