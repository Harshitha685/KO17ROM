class Shampoo {

    int shampooId;
    String brand;
    double quantityInMl;
    boolean isAntiDandruff;

    Shampoo() {
        System.out.println("A new shampoo product is launched!");
    }

    Shampoo(int shampooId, String brand, double quantityInMl, boolean isAntiDandruff) {
        System.out.println("A new shampoo product is launched!");
        this.shampooId = shampooId;
        this.brand = brand;
        this.quantityInMl = quantityInMl;
        this.isAntiDandruff = isAntiDandruff;
    }
}
