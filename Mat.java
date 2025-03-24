class Mat {

    String shape;
    String usageArea;
    double thickness;
    boolean hasGrip;

    Mat() {
        System.out.println("A new mat model is added to the inventory!");
    }

    Mat(String shape, String usageArea, double thickness, boolean hasGrip) {
        System.out.println("A new mat model is added to the inventory!");
        this.shape = shape;
        this.usageArea = usageArea;
        this.thickness = thickness;
        this.hasGrip = hasGrip;
    }
}
