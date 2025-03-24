class CarryBag {

    String brand;
    double capacityInLiters;
    boolean isWaterProof;
    String color;

    CarryBag() {
        System.out.println("A new carry bag is launched!");
    }

    CarryBag(String brand, double capacityInLiters, boolean isWaterProof, String color) {
        System.out.println("A new carry bag is launched!");
        this.brand = brand;
        this.capacityInLiters = capacityInLiters;
        this.isWaterProof = isWaterProof;
        this.color = color;
    }
}
