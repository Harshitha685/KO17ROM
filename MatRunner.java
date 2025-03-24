class MatRunner {

public static void main(String mat[]) {

    // 1
    Mat mat1 = new Mat();
    mat1.material = "Cotton";
    mat1.color = "Blue";
    mat1.length = 4.5;
    mat1.isWashable = true;
    System.out.println("Material : " + mat1.material);
    System.out.println("Color  : " + mat1.color);
    System.out.println("Length : " + mat1.length);
    System.out.println("Washable : " + mat1.isWashable);
    System.out.println();
	
    mat1 = new Mat(mat1.material, mat1.color, mat1.length, mat1.isWashable);
	System.out.println("Material : " + mat1.material);
    System.out.println("Color  : " + mat1.color);
    System.out.println("Length : " + mat1.length);
    System.out.println("Washable : " + mat1.isWashable);
    System.out.println();

    // 2
    Mat mat2 = new Mat();
    mat2.material = "Silk";
    mat2.color = "Red";
    mat2.length = 3.8;
    mat2.isWashable = false;
    System.out.println("Material: " + mat2.material);
    System.out.println("Color : " + mat2.color);
    System.out.println("Length : " + mat2.length);
    System.out.println("Washable: " + mat2.isWashable);
    System.out.println();
	
    mat2 = new Mat(mat2.material, mat2.color, mat2.length, mat2.isWashable);
	System.out.println("Material: " + mat2.material);
    System.out.println("Color : " + mat2.color);
    System.out.println("Length : " + mat2.length);
    System.out.println("Washable: " + mat2.isWashable);
    System.out.println();

    // 3
    Mat mat3 = new Mat();
    mat3.material = "Jute";
    mat3.color = "Brown";
    mat3.length = 5.0;
    mat3.isWashable = true;
    System.out.println("Material: " + mat3.material);
    System.out.println("Color : " + mat3.color);
    System.out.println("Length: " + mat3.length);
    System.out.println("Washable : " + mat3.isWashable);
    System.out.println();
	
    mat3 = new Mat(mat3.material, mat3.color, mat3.length, mat3.isWashable);
	System.out.println("Material: " + mat3.material);
    System.out.println("Color : " + mat3.color);
    System.out.println("Length: " + mat3.length);
    System.out.println("Washable : " + mat3.isWashable);
    System.out.println();

    // 4
    Mat mat4 = new Mat();
    mat4.material = "Nylon";
    mat4.color = "Black";
    mat4.length = 6.2;
    mat4.isWashable = true;
    System.out.println("Material: " + mat4.material);
    System.out.println("Color : " + mat4.color);
    System.out.println("Length: " + mat4.length);
    System.out.println("Washable   : " + mat4.isWashable);
    System.out.println();
	
    mat4 = new Mat(mat4.material, mat4.color, mat4.length, mat4.isWashable);
	System.out.println("Material: " + mat4.material);
    System.out.println("Color : " + mat4.color);
    System.out.println("Length: " + mat4.length);
    System.out.println("Washable   : " + mat4.isWashable);
    System.out.println();

    // 5
    Mat mat5 = new Mat();
    mat5.material = "Rubber";
    mat5.color = "Grey";
    mat5.length = 3.0;
    mat5.isWashable = false;
    System.out.println("Material: " + mat5.material);
    System.out.println("Color : " + mat5.color);
    System.out.println("Length: " + mat5.length);
    System.out.println("Washable   : " + mat5.isWashable);
    System.out.println();
	
    mat5 = new Mat(mat5.material, mat5.color, mat5.length, mat5.isWashable);
	System.out.println("Material: " + mat5.material);
    System.out.println("Color : " + mat5.color);
    System.out.println("Length: " + mat5.length);
    System.out.println("Washable   : " + mat5.isWashable);
    System.out.println();

    // 6
    Mat mat6 = new Mat();
    mat6.material = "Foam";
    mat6.color = "Green";
    mat6.length = 4.0;
    mat6.isWashable = true;
    System.out.println("Material : " + mat6.material);
    System.out.println("Color  : " + mat6.color);
    System.out.println("Length : " + mat6.length);
    System.out.println("Washable : " + mat6.isWashable);
    System.out.println();
	
    mat6 = new Mat(mat6.material, mat6.color, mat6.length, mat6.isWashable);
	System.out.println("Material : " + mat6.material);
    System.out.println("Color  : " + mat6.color);
    System.out.println("Length : " + mat6.length);
    System.out.println("Washable : " + mat6.isWashable);
    System.out.println();

    // 7
    Mat mat7 = new Mat();
    mat7.material = "Wool";
    mat7.color = "White";
    mat7.length = 2.5;
    mat7.isWashable = false;
    System.out.println("Material: " + mat7.material);
    System.out.println("Color : " + mat7.color);
    System.out.println("Length : " + mat7.length);
    System.out.println("Washable   : " + mat7.isWashable);
    System.out.println();
    mat7 = new Mat(mat7.material, mat7.color, mat7.length, mat7.isWashable);
    }
}
