class TubeLight {

    String brand;
    int watts;
    String color;
    boolean isLED;

    TubeLight() {
        System.out.println("A new tube light is added!");
    }

    TubeLight(String brand, int watts, String color, boolean isLED) {
        System.out.println("A new tube light is added!");
        this.brand = brand;
        this.watts = watts;
        this.color = color;
        this.isLED = isLED;
    }
}
