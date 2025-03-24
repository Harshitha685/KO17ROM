class Noodles {

    String brand;
    String flavor;
    int cookingTimeInMinutes;
    boolean isSpicy;

    Noodles() {
        System.out.println("A new noodles variety has been launched!");
    }

    Noodles(String brand, String flavor, int cookingTimeInMinutes, boolean isSpicy) {
        System.out.println("A new noodles variety has been launched!");
        this.brand = brand;
        this.flavor = flavor;
        this.cookingTimeInMinutes = cookingTimeInMinutes;
        this.isSpicy = isSpicy;
    }
}
