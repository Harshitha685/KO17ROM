class PhotoFrameRunner {

public static void main(String photo[]) {

    // 1
    PhotoFrame p1 = new PhotoFrame();
    p1.shape = "Rectangle";
    p1.color = "Black";
    p1.width = 10.5;
    p1.photoType = "Portrait";
    System.out.println("Shape : " + p1.shape);
    System.out.println("Color : " + p1.color);
    System.out.println("Width : " + p1.width);
    System.out.println("PhotoType : " + p1.photoType);
    System.out.println();

    p1 = new PhotoFrame("Rectangle", "Black", 10.5, "Portrait");
    System.out.println("Shape : " + p1.shape);
    System.out.println("Color : " + p1.color);
    System.out.println("Width : " + p1.width);
    System.out.println("PhotoType : " + p1.photoType);
    System.out.println();

    // 2
    PhotoFrame p2 = new PhotoFrame();
    p2.shape = "Square";
    p2.color = "White";
    p2.width = 8.0;
    p2.photoType = "Landscape";
    System.out.println("Shape : " + p2.shape);
    System.out.println("Color : " + p2.color);
    System.out.println("Width : " + p2.width);
    System.out.println("PhotoType : " + p2.photoType);
    System.out.println();

    p2 = new PhotoFrame("Square", "White", 8.0, "Landscape");
    System.out.println("Shape : " + p2.shape);
    System.out.println("Color : " + p2.color);
    System.out.println("Width : " + p2.width);
    System.out.println("PhotoType : " + p2.photoType);
    System.out.println();

    // 3
    PhotoFrame p3 = new PhotoFrame();
    p3.shape = "Oval";
    p3.color = "Golden";
    p3.width = 9.2;
    p3.photoType = "Vintage";
    System.out.println("Shape : " + p3.shape);
    System.out.println("Color : " + p3.color);
    System.out.println("Width : " + p3.width);
    System.out.println("PhotoType : " + p3.photoType);
    System.out.println();

    p3 = new PhotoFrame("Oval", "Golden", 9.2, "Vintage");
    System.out.println("Shape : " + p3.shape);
    System.out.println("Color : " + p3.color);
    System.out.println("Width : " + p3.width);
    System.out.println("PhotoType : " + p3.photoType);
    System.out.println();

    // 4
    PhotoFrame p4 = new PhotoFrame();
    p4.shape = "Circle";
    p4.color = "Silver";
    p4.width = 7.5;
    p4.photoType = "Modern";
    System.out.println("Shape : " + p4.shape);
    System.out.println("Color : " + p4.color);
    System.out.println("Width : " + p4.width);
    System.out.println("PhotoType : " + p4.photoType);
    System.out.println();

    p4 = new PhotoFrame("Circle", "Silver", 7.5, "Modern");
    System.out.println("Shape : " + p4.shape);
    System.out.println("Color : " + p4.color);
    System.out.println("Width : " + p4.width);
    System.out.println("PhotoType : " + p4.photoType);
    System.out.println();

    // 5
    PhotoFrame p5 = new PhotoFrame();
    p5.shape = "Heart";
    p5.color = "Red";
    p5.width = 6.5;
    p5.photoType = "Romantic";
    System.out.println("Shape : " + p5.shape);
    System.out.println("Color : " + p5.color);
    System.out.println("Width : " + p5.width);
    System.out.println("PhotoType : " + p5.photoType);
    System.out.println();

    p5 = new PhotoFrame("Heart", "Red", 6.5, "Romantic");
    System.out.println("Shape : " + p5.shape);
    System.out.println("Color : " + p5.color);
    System.out.println("Width : " + p5.width);
    System.out.println("PhotoType : " + p5.photoType);
    System.out.println();

    // 6
    PhotoFrame p6 = new PhotoFrame();
    p6.shape = "Triangle";
    p6.color = "Blue";
    p6.width = 5.0;
    p6.photoType = "Abstract";
    System.out.println("Shape : " + p6.shape);
    System.out.println("Color : " + p6.color);
    System.out.println("Width : " + p6.width);
    System.out.println("PhotoType : " + p6.photoType);
    System.out.println();

    p6 = new PhotoFrame("Triangle", "Blue", 5.0, "Abstract");
    System.out.println("Shape : " + p6.shape);
    System.out.println("Color : " + p6.color);
    System.out.println("Width : " + p6.width);
    System.out.println("PhotoType : " + p6.photoType);
    System.out.println();

    // 7
    PhotoFrame p7 = new PhotoFrame();
    p7.shape = "Hexagon";
    p7.color = "Brown";
    p7.width = 11.3;
    p7.photoType = "Artistic";
    System.out.println("Shape : " + p7.shape);
    System.out.println("Color : " + p7.color);
    System.out.println("Width : " + p7.width);
    System.out.println("PhotoType : " + p7.photoType);
    System.out.println();

    p7 = new PhotoFrame("Hexagon", "Brown", 11.3, "Artistic");
    System.out.println("Shape : " + p7.shape);
    System.out.println("Color : " + p7.color);
    System.out.println("Width : " + p7.width);
    System.out.println("PhotoType : " + p7.photoType);
    System.out.println();
    }
}
