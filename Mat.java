class Mat {

    String material;
    String color;
    double length;
    boolean isWashable;

    Mat() {
        System.out.println("A new mat is available in the store!");
    }

    Mat(String material, String color, double length, boolean isWashable) {
        System.out.println("A new mat is available in the store!");
        this.material = material;
        this.color = color;
        this.length = length;
        this.isWashable = isWashable;
    }
}
