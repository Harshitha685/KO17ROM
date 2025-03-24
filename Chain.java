class Chain {

    int chainId;
    String material;
    double lengthInInches;
    boolean isGoldPlated;

    Chain() {
        System.out.println("A new chain design is launched!");
    }

    Chain(int chainId, String material, double lengthInInches, boolean isGoldPlated) {
        System.out.println("A new chain design is launched!");
        this.chainId = chainId;
        this.material = material;
        this.lengthInInches = lengthInInches;
        this.isGoldPlated = isGoldPlated;
    }
}
