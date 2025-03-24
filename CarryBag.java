class CarryBag {

    String label;  
    double capacityInLiters;
    boolean isWaterProof;
    String color;

    CarryBag() {
        System.out.println("A new carry bag is launched!");
    }

    CarryBag(String label, double capacityInLiters, boolean isWaterProof, String color) {
        System.out.println("A new carry bag is launched!");
        this.label = label;
        this.capacityInLiters = capacityInLiters;
        this.isWaterProof = isWaterProof;
        this.color = color;
    }
}
