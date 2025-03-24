class BellRunner {

public static void main(String bell[]) {

    // 1
    Bell bell1 = new Bell();
    bell1.buildMaterial = "Brass";
    bell1.diameter = 4.5;
    bell1.toneType = "Clear";
    bell1.forDecoration = true;
    System.out.println("Material  : " + bell1.buildMaterial);
    System.out.println("Diameter : " + bell1.diameter + " inches");
    System.out.println("Tone Type: " + bell1.toneType);
    System.out.println("Decorative  : " + bell1.forDecoration);
    System.out.println();

    bell1 = new Bell("Brass", 4.5, "Clear", true);
    System.out.println("Material  : " + bell1.buildMaterial);
    System.out.println("Diameter  : " + bell1.diameter + " inches");
    System.out.println("Tone Type : " + bell1.toneType);
    System.out.println("Decorative    : " + bell1.forDecoration);
    System.out.println();

    // 2
    Bell bell2 = new Bell();
    bell2.buildMaterial = "Iron";
    bell2.diameter = 6.0;
    bell2.toneType = "Deep";
    bell2.forDecoration = false;
    System.out.println("Material : " + bell2.buildMaterial);
    System.out.println("Diameter : " + bell2.diameter + " inches");
    System.out.println("Tone Type: " + bell2.toneType);
    System.out.println("Decorative    : " + bell2.forDecoration);
    System.out.println();

    bell2 = new Bell("Iron", 6.0, "Deep", false);
    System.out.println("Material  : " + bell2.buildMaterial);
    System.out.println("Diameter  : " + bell2.diameter + " inches");
    System.out.println("Tone Type : " + bell2.toneType);
    System.out.println("Decorative    : " + bell2.forDecoration);
    System.out.println();

    // 3
    Bell bell3 = new Bell();
    bell3.buildMaterial = "Copper";
    bell3.diameter = 3.5;
    bell3.toneType = "Melodic";
    bell3.forDecoration = true;
    System.out.println("Material: " + bell3.buildMaterial);
    System.out.println("Diameter: " + bell3.diameter + " inches");
    System.out.println("Tone Type: " + bell3.toneType);
    System.out.println("Decorative    : " + bell3.forDecoration);
    System.out.println();

    bell3 = new Bell("Copper", 3.5, "Melodic", true);
    System.out.println("Material  : " + bell3.buildMaterial);
    System.out.println("Diameter  : " + bell3.diameter + " inches");
    System.out.println("Tone Type : " + bell3.toneType);
    System.out.println("Decorative    : " + bell3.forDecoration);
    System.out.println();

    // 4
    Bell bell4 = new Bell();
    bell4.buildMaterial = "Steel";
    bell4.diameter = 5.0;
    bell4.toneType = "High-pitched";
    bell4.forDecoration = false;
    System.out.println("Material  : " + bell4.buildMaterial);
    System.out.println("Diameter  : " + bell4.diameter + " inches");
    System.out.println("Tone Type : " + bell4.toneType);
    System.out.println("Decorative    : " + bell4.forDecoration);
    System.out.println();

    bell4 = new Bell("Steel", 5.0, "High-pitched", false);
    System.out.println("Material  : " + bell4.buildMaterial);
    System.out.println("Diameter  : " + bell4.diameter + " inches");
    System.out.println("Tone Type : " + bell4.toneType);
    System.out.println("Decorative    : " + bell4.forDecoration);
    System.out.println();

    // 5
    Bell bell5 = new Bell();
    bell5.buildMaterial = "Bronze";
    bell5.diameter = 7.2;
    bell5.toneType = "Resonant";
    bell5.forDecoration = true;
    System.out.println("Material : " + bell5.buildMaterial);
    System.out.println("Diameter : " + bell5.diameter + " inches");
    System.out.println("Tone Type: " + bell5.toneType);
    System.out.println("Decorative    : " + bell5.forDecoration);
    System.out.println();

    bell5 = new Bell("Bronze", 7.2, "Resonant", true);
    System.out.println("Material  : " + bell5.buildMaterial);
    System.out.println("Diameter  : " + bell5.diameter + " inches");
    System.out.println("Tone Type : " + bell5.toneType);
    System.out.println("Decorative    : " + bell5.forDecoration);
    System.out.println();

    // 6
    Bell bell6 = new Bell();
    bell6.buildMaterial = "Aluminum";
    bell6.diameter = 2.8;
    bell6.toneType = "Soft";
    bell6.forDecoration = true;
    System.out.println("Material  : " + bell6.buildMaterial);
    System.out.println("Diameter  : " + bell6.diameter + " inches");
    System.out.println("Tone Type : " + bell6.toneType);
    System.out.println("Decorative    : " + bell6.forDecoration);
    System.out.println();

    bell6 = new Bell("Aluminum", 2.8, "Soft", true);
    System.out.println("Material  : " + bell6.buildMaterial);
    System.out.println("Diameter  : " + bell6.diameter + " inches");
    System.out.println("Tone Type : " + bell6.toneType);
    System.out.println("Decorative    : " + bell6.forDecoration);
    System.out.println();

    // 7
    Bell bell7 = new Bell();
    bell7.buildMaterial = "Glass";
    bell7.diameter = 3.0;
    bell7.toneType = "Tingling";
    bell7.forDecoration = true;
    System.out.println("Material: " + bell7.buildMaterial);
    System.out.println("Diameter: " + bell7.diameter + " inches");
    System.out.println("Tone Type: " + bell7.toneType);
    System.out.println("Decorative    : " + bell7.forDecoration);
    System.out.println();

    bell7 = new Bell("Glass", 3.0, "Tingling", true);
    System.out.println("Material : " + bell7.buildMaterial);
    System.out.println("Diameter : " + bell7.diameter + " inches");
    System.out.println("Tone Type: " + bell7.toneType);
    System.out.println("Decorative    : " + bell7.forDecoration);
    System.out.println();
    }
}
