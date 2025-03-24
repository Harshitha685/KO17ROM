class Chain {

    String chainType; 
    String material;
    double lengthInInches;
    boolean isGoldPlated;

    Chain() {
        System.out.println("A new chain design is launched!");
    }

    Chain(String chainType, String material, double lengthInInches, boolean isGoldPlated) {
        System.out.println("A new chain design is launched!");
        this.chainType = chainType;
        this.material = material;
        this.lengthInInches = lengthInInches;
        this.isGoldPlated = isGoldPlated;
    }
}
