class Shampoo {

    double quantityInMl;
    double price;
    String hairType;
    boolean isHerbal;

    // Default constructor
    Shampoo() {
        System.out.println("A new shampoo has been added to the catalog!");
    }

    // Parameterized constructor 
    Shampoo(double quantityInMl, double price, String hairType, boolean isHerbal) {
        System.out.println("A new shampoo has been added to the catalog!");
        this.quantityInMl = quantityInMl;
        this.price = price;
        this.hairType = hairType;
        this.isHerbal = isHerbal;
    }
}
