class Stove {

    int stoveId;
    String brand;
    int numberOfBurners;
    boolean isGasStove;

    Stove() {
        System.out.println("A new stove is introduced!");
    }

    Stove(int stoveId, String brand, int numberOfBurners, boolean isGasStove) {
        System.out.println("A new stove is introduced!");
        this.stoveId = stoveId;
        this.brand = brand;
        this.numberOfBurners = numberOfBurners;
        this.isGasStove = isGasStove;
    }
}
