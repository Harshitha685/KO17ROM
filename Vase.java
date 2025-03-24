class Vase {

    String shape;
    String material;
    String color;
    double height;

    Vase() {
        System.out.println("A new vase has been added to the collection!");
    }

    Vase(String shape, String material, String color, double height) {
        System.out.println("A new vase has been added to the collection!");
        this.shape = shape;
        this.material = material;
        this.color = color;
        this.height = height;
    }
}
