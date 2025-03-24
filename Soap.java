class Soap {

    int soapId;
    String brand;
    double weightInGrams;
    boolean isFragrant;

    Soap() {
        System.out.println("A new soap brand is introduced!");
    }

    Soap(int soapId, String brand, double weightInGrams, boolean isFragrant) {
        System.out.println("A new soap brand is introduced!");
        this.soapId = soapId;
        this.brand = brand;
        this.weightInGrams = weightInGrams;
        this.isFragrant = isFragrant;
    }
}
