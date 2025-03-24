class MatRunner {

public static void main(String mat[]) {

    // 1
    Mat mat1 = new Mat();
    mat1.shape = "Rectangle";
    mat1.usageArea = "Entrance";
    mat1.thickness = 0.8;
    mat1.hasGrip = true;
    System.out.println("Shape     : " + mat1.shape);
    System.out.println("Usage Area: " + mat1.usageArea);
    System.out.println("Thickness : " + mat1.thickness + " cm");
    System.out.println("Has Grip  : " + mat1.hasGrip);
    System.out.println();

    mat1 = new Mat("Rectangle", "Entrance", 0.8, true);
    System.out.println("Shape     : " + mat1.shape);
    System.out.println("Usage Area: " + mat1.usageArea);
    System.out.println("Thickness : " + mat1.thickness + " cm");
    System.out.println("Has Grip  : " + mat1.hasGrip);
    System.out.println();

    // 2
    Mat mat2 = new Mat();
    mat2.shape = "Round";
    mat2.usageArea = "Bathroom";
    mat2.thickness = 0.5;
    mat2.hasGrip = false;
    System.out.println("Shape     : " + mat2.shape);
    System.out.println("Usage Area: " + mat2.usageArea);
    System.out.println("Thickness : " + mat2.thickness + " cm");
    System.out.println("Has Grip  : " + mat2.hasGrip);
    System.out.println();

    mat2 = new Mat("Round", "Bathroom", 0.5, false);
    System.out.println("Shape     : " + mat2.shape);
    System.out.println("Usage Area: " + mat2.usageArea);
    System.out.println("Thickness : " + mat2.thickness + " cm");
    System.out.println("Has Grip  : " + mat2.hasGrip);
    System.out.println();

    // 3
    Mat mat3 = new Mat();
    mat3.shape = "Oval";
    mat3.usageArea = "Living Room";
    mat3.thickness = 1.2;
    mat3.hasGrip = true;
    System.out.println("Shape     : " + mat3.shape);
    System.out.println("Usage Area: " + mat3.usageArea);
    System.out.println("Thickness : " + mat3.thickness + " cm");
    System.out.println("Has Grip  : " + mat3.hasGrip);
    System.out.println();

    mat3 = new Mat("Oval", "Living Room", 1.2, true);
    System.out.println("Shape     : " + mat3.shape);
    System.out.println("Usage Area: " + mat3.usageArea);
    System.out.println("Thickness : " + mat3.thickness + " cm");
    System.out.println("Has Grip  : " + mat3.hasGrip);
    System.out.println();

    // 4
    Mat mat4 = new Mat();
    mat4.shape = "Square";
    mat4.usageArea = "Kitchen";
    mat4.thickness = 0.9;
    mat4.hasGrip = false;
    System.out.println("Shape     : " + mat4.shape);
    System.out.println("Usage Area: " + mat4.usageArea);
    System.out.println("Thickness : " + mat4.thickness + " cm");
    System.out.println("Has Grip  : " + mat4.hasGrip);
    System.out.println();

    mat4 = new Mat("Square", "Kitchen", 0.9, false);
    System.out.println("Shape     : " + mat4.shape);
    System.out.println("Usage Area: " + mat4.usageArea);
    System.out.println("Thickness : " + mat4.thickness + " cm");
    System.out.println("Has Grip  : " + mat4.hasGrip);
    System.out.println();

    // 5
    Mat mat5 = new Mat();
    mat5.shape = "Hexagon";
    mat5.usageArea = "Balcony";
    mat5.thickness = 1.0;
    mat5.hasGrip = true;
    System.out.println("Shape     : " + mat5.shape);
    System.out.println("Usage Area: " + mat5.usageArea);
    System.out.println("Thickness : " + mat5.thickness + " cm");
    System.out.println("Has Grip  : " + mat5.hasGrip);
    System.out.println();

    mat5 = new Mat("Hexagon", "Balcony", 1.0, true);
    System.out.println("Shape     : " + mat5.shape);
    System.out.println("Usage Area: " + mat5.usageArea);
    System.out.println("Thickness : " + mat5.thickness + " cm");
    System.out.println("Has Grip  : " + mat5.hasGrip);
    System.out.println();

    // 6
    Mat mat6 = new Mat();
    mat6.shape = "Triangle";
    mat6.usageArea = "Garden";
    mat6.thickness = 0.7;
    mat6.hasGrip = false;
    System.out.println("Shape     : " + mat6.shape);
    System.out.println("Usage Area: " + mat6.usageArea);
    System.out.println("Thickness : " + mat6.thickness + " cm");
    System.out.println("Has Grip  : " + mat6.hasGrip);
    System.out.println();

    mat6 = new Mat("Triangle", "Garden", 0.7, false);
    System.out.println("Shape     : " + mat6.shape);
    System.out.println("Usage Area: " + mat6.usageArea);
    System.out.println("Thickness : " + mat6.thickness + " cm");
    System.out.println("Has Grip  : " + mat6.hasGrip);
    System.out.println();

    // 7
    Mat mat7 = new Mat();
    mat7.shape = "Octagon";
    mat7.usageArea = "Study Room";
    mat7.thickness = 1.5;
    mat7.hasGrip = true;
    System.out.println("Shape     : " + mat7.shape);
    System.out.println("Usage Area: " + mat7.usageArea);
    System.out.println("Thickness : " + mat7.thickness + " cm");
    System.out.println("Has Grip  : " + mat7.hasGrip);
    System.out.println();

    mat7 = new Mat("Octagon", "Study Room", 1.5, true);
    System.out.println("Shape     : " + mat7.shape);
    System.out.println("Usage Area: " + mat7.usageArea);
    System.out.println("Thickness : " + mat7.thickness + " cm");
    System.out.println("Has Grip  : " + mat7.hasGrip);
    System.out.println();
    }
}
