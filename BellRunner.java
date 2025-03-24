class BellRunner {

public static void main(String bell[]) {

    // 1
    Bell bell1 = new Bell();
    bell1.material = "Brass";
    bell1.size = 5.0;
    bell1.soundType = "Clear";
    bell1.isDecorative = false;
    System.out.println("Material : " + bell1.material);
    System.out.println("Size (inches) : " + bell1.size);
    System.out.println("Sound Type    : " + bell1.soundType);
    System.out.println("Decorative: " + bell1.isDecorative);
    System.out.println();
	
    bell1 = new Bell(bell1.material, bell1.size, bell1.soundType, bell1.isDecorative);
	System.out.println("Material : " + bell1.material);
    System.out.println("Size (inches) : " + bell1.size);
    System.out.println("Sound Type    : " + bell1.soundType);
    System.out.println("Decorative: " + bell1.isDecorative);
    System.out.println();

    // 2
    Bell bell2 = new Bell();
    bell2.material = "Copper";
    bell2.size = 3.5;
    bell2.soundType = "Soft";
    bell2.isDecorative = true;
    System.out.println("Material      : " + bell2.material);
    System.out.println("Size (inches) : " + bell2.size);
    System.out.println("Sound Type    : " + bell2.soundType);
    System.out.println("Decorative    : " + bell2.isDecorative);
    System.out.println();
	
    bell2 = new Bell(bell2.material, bell2.size, bell2.soundType, bell2.isDecorative);
	System.out.println("Material      : " + bell2.material);
    System.out.println("Size (inches) : " + bell2.size);
    System.out.println("Sound Type    : " + bell2.soundType);
    System.out.println("Decorative    : " + bell2.isDecorative);
    System.out.println();

    // 3
    Bell bell3 = new Bell();
    bell3.material = "Iron";
    bell3.size = 7.0;
    bell3.soundType = "Loud";
    bell3.isDecorative = false;
    System.out.println("Material      : " + bell3.material);
    System.out.println("Size (inches) : " + bell3.size);
    System.out.println("Sound Type    : " + bell3.soundType);
    System.out.println("Decorative    : " + bell3.isDecorative);
    System.out.println();
	
    bell3 = new Bell(bell3.material, bell3.size, bell3.soundType, bell3.isDecorative);
	System.out.println("Material      : " + bell3.material);
    System.out.println("Size (inches) : " + bell3.size);
    System.out.println("Sound Type    : " + bell3.soundType);
    System.out.println("Decorative    : " + bell3.isDecorative);
    System.out.println();

    // 4
    Bell bell4 = new Bell();
    bell4.material = "Silver";
    bell4.size = 4.2;
    bell4.soundType = "Chime";
    bell4.isDecorative = true;
    System.out.println("Material      : " + bell4.material);
    System.out.println("Size (inches) : " + bell4.size);
    System.out.println("Sound Type    : " + bell4.soundType);
    System.out.println("Decorative    : " + bell4.isDecorative);
    System.out.println();
	
    bell4 = new Bell(bell4.material, bell4.size, bell4.soundType, bell4.isDecorative);
	System.out.println("Material      : " + bell4.material);
    System.out.println("Size (inches) : " + bell4.size);
    System.out.println("Sound Type    : " + bell4.soundType);
    System.out.println("Decorative    : " + bell4.isDecorative);
    System.out.println();

    // 5
    Bell bell5 = new Bell();
    bell5.material = "Bronze";
    bell5.size = 6.8;
    bell5.soundType = "Deep";
    bell5.isDecorative = false;
    System.out.println("Material      : " + bell5.material);
    System.out.println("Size (inches) : " + bell5.size);
    System.out.println("Sound Type    : " + bell5.soundType);
    System.out.println("Decorative    : " + bell5.isDecorative);
    System.out.println();
	
    bell5 = new Bell(bell5.material, bell5.size, bell5.soundType, bell5.isDecorative);
	System.out.println("Material      : " + bell5.material);
    System.out.println("Size (inches) : " + bell5.size);
    System.out.println("Sound Type    : " + bell5.soundType);
    System.out.println("Decorative    : " + bell5.isDecorative);
    System.out.println();

    // 6
    Bell bell6 = new Bell();
    bell6.material = "Steel";
    bell6.size = 5.5;
    bell6.soundType = "High-pitched";
    bell6.isDecorative = true;
    System.out.println("Material      : " + bell6.material);
    System.out.println("Size (inches) : " + bell6.size);
    System.out.println("Sound Type    : " + bell6.soundType);
    System.out.println("Decorative    : " + bell6.isDecorative);
    System.out.println();
	
    bell6 = new Bell(bell6.material, bell6.size, bell6.soundType, bell6.isDecorative);
	System.out.println("Material      : " + bell6.material);
    System.out.println("Size (inches) : " + bell6.size);
    System.out.println("Sound Type    : " + bell6.soundType);
    System.out.println("Decorative    : " + bell6.isDecorative);
    System.out.println();

    // 7
    Bell bell7 = new Bell();
    bell7.material = "Aluminum";
    bell7.size = 2.5;
    bell7.soundType = "Light";
    bell7.isDecorative = true;
    System.out.println("Material      : " + bell7.material);
    System.out.println("Size (inches) : " + bell7.size);
    System.out.println("Sound Type    : " + bell7.soundType);
    System.out.println("Decorative    : " + bell7.isDecorative);
    System.out.println();
	
    bell7 = new Bell(bell7.material, bell7.size, bell7.soundType, bell7.isDecorative);
	System.out.println("Material      : " + bell7.material);
    System.out.println("Size (inches) : " + bell7.size);
    System.out.println("Sound Type    : " + bell7.soundType);
    System.out.println("Decorative    : " + bell7.isDecorative);
    System.out.println();
    }
}
