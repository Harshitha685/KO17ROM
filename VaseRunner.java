class VaseRunner {

public static void main(String vase[]) {

    // 1
    Vase vase1 = new Vase(); // default
    vase1.designType = "Round";
    vase1.buildMaterial = "Ceramic";
    vase1.shade = "White";
    vase1.size = 10.5;
	System.out.println("Design Type   : " + vase1.designType);
    System.out.println("Material      : " + vase1.buildMaterial);
    System.out.println("Color/Shade   : " + vase1.shade);
    System.out.println("Height (inch) : " + vase1.size);
    System.out.println();

    vase1 = new Vase("Round", "Ceramic", "White", 10.5); // parameterized
    System.out.println("Design Type   : " + vase1.designType);
    System.out.println("Material      : " + vase1.buildMaterial);
    System.out.println("Color/Shade   : " + vase1.shade);
    System.out.println("Height (inch) : " + vase1.size);
    System.out.println();

    // 2
    Vase vase2 = new Vase();
    vase2.designType = "Oval";
    vase2.buildMaterial = "Glass";
    vase2.shade = "Blue";
    vase2.size = 12.0;
	System.out.println("Design Type   : " + vase2.designType);
    System.out.println("Material      : " + vase2.buildMaterial);
    System.out.println("Color/Shade   : " + vase2.shade);
    System.out.println("Height (inch) : " + vase2.size);
    System.out.println();

    vase2 = new Vase("Oval", "Glass", "Blue", 12.0);
    System.out.println("Design Type   : " + vase2.designType);
    System.out.println("Material      : " + vase2.buildMaterial);
    System.out.println("Color/Shade   : " + vase2.shade);
    System.out.println("Height (inch) : " + vase2.size);
    System.out.println();

    // 3
    Vase vase3 = new Vase();
    vase3.designType = "Square";
    vase3.buildMaterial = "Wood";
    vase3.shade = "Brown";
    vase3.size = 9.5;
	System.out.println("Design Type   : " + vase3.designType);
    System.out.println("Material      : " + vase3.buildMaterial);
    System.out.println("Color/Shade   : " + vase3.shade);
    System.out.println("Height (inch) : " + vase3.size);
    System.out.println();

    vase3 = new Vase("Square", "Wood", "Brown", 9.5);
    System.out.println("Design Type   : " + vase3.designType);
    System.out.println("Material      : " + vase3.buildMaterial);
    System.out.println("Color/Shade   : " + vase3.shade);
    System.out.println("Height (inch) : " + vase3.size);
    System.out.println();

    // 4
    Vase vase4 = new Vase();
    vase4.designType = "Hexagonal";
    vase4.buildMaterial = "Metal";
    vase4.shade = "Silver";
    vase4.size = 14.0;
	System.out.println("Design Type   : " + vase4.designType);
    System.out.println("Material      : " + vase4.buildMaterial);
    System.out.println("Color/Shade   : " + vase4.shade);
    System.out.println("Height (inch) : " + vase4.size);
    System.out.println();

    vase4 = new Vase("Hexagonal", "Metal", "Silver", 14.0);
    System.out.println("Design Type   : " + vase4.designType);
    System.out.println("Material      : " + vase4.buildMaterial);
    System.out.println("Color/Shade   : " + vase4.shade);
    System.out.println("Height (inch) : " + vase4.size);
    System.out.println();

    // 5
    Vase vase5 = new Vase();
    vase5.designType = "Conical";
    vase5.buildMaterial = "Plastic";
    vase5.shade = "Pink";
    vase5.size = 8.75;
	System.out.println("Design Type   : " + vase5.designType);
    System.out.println("Material      : " + vase5.buildMaterial);
    System.out.println("Color/Shade   : " + vase5.shade);
    System.out.println("Height (inch) : " + vase5.size);
    System.out.println();

    vase5 = new Vase("Conical", "Plastic", "Pink", 8.75);
    System.out.println("Design Type   : " + vase5.designType);
    System.out.println("Material      : " + vase5.buildMaterial);
    System.out.println("Color/Shade   : " + vase5.shade);
    System.out.println("Height (inch) : " + vase5.size);
    System.out.println();

    // 6
    Vase vase6 = new Vase();
    vase6.designType = "Cylindrical";
    vase6.buildMaterial = "Marble";
    vase6.shade = "Green";
    vase6.size = 11.25;
	System.out.println("Design Type   : " + vase6.designType);
    System.out.println("Material      : " + vase6.buildMaterial);
    System.out.println("Color/Shade   : " + vase6.shade);
    System.out.println("Height (inch) : " + vase6.size);
    System.out.println();

    vase6 = new Vase("Cylindrical", "Marble", "Green", 11.25);
    System.out.println("Design Type   : " + vase6.designType);
    System.out.println("Material      : " + vase6.buildMaterial);
    System.out.println("Color/Shade   : " + vase6.shade);
    System.out.println("Height (inch) : " + vase6.size);
    System.out.println();

    // 7
    Vase vase7 = new Vase();
    vase7.designType = "Triangular";
    vase7.buildMaterial = "Clay";
    vase7.shade = "Terracotta";
    vase7.size = 13.0;
	System.out.println("Design Type   : " + vase7.designType);
    System.out.println("Material      : " + vase7.buildMaterial);
    System.out.println("Color/Shade   : " + vase7.shade);
    System.out.println("Height (inch) : " + vase7.size);
    System.out.println();

    vase7 = new Vase("Triangular", "Clay", "Terracotta", 13.0);
    System.out.println("Design Type   : " + vase7.designType);
    System.out.println("Material      : " + vase7.buildMaterial);
    System.out.println("Color/Shade   : " + vase7.shade);
    System.out.println("Height (inch) : " + vase7.size);
    System.out.println();
    }
}
