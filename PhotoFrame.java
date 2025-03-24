class PhotoFrame {

    String shape;
    String color;
    double width;
    String photoType;

    PhotoFrame() {
        System.out.println("A stylish photo frame is created!");
    }

    PhotoFrame(String shape, String color, double width, String photoType) {
        System.out.println("A stylish photo frame is created!");
        this.shape = shape;
        this.color = color;
        this.width = width;
        this.photoType = photoType;
    }
}
