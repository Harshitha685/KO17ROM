class ColdDrink {

    String manufacturer;
    String essence;
    double bottleSize;
    boolean isSparkling;

    ColdDrink() {
        System.out.println("A new cold drink is available in the market!");
    }

    ColdDrink(String manufacturer, String essence, double bottleSize, boolean isSparkling) {
        System.out.println("A new cold drink is available in the market!");
        this.manufacturer = manufacturer;
        this.essence = essence;
        this.bottleSize = bottleSize;
        this.isSparkling = isSparkling;
    }
}
