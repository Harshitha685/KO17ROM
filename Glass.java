class Glass {

    // Instance variables
    int id;
    String type;
    String brand;
    double price;
    String color;
    String material;
    boolean isTransparent;
    double height;
    double diameter;
    int capacityInMl;
    boolean isMicrowaveSafe;

    // 1. No-args constructor
    Glass() {
        this(1); 
        System.out.println(" No-args constructor invoked");
    }

    // 2. 
    Glass(int id) {
        this("Tempered"); 
        System.out.println(" Constructor with int invoked");
        this.id = id;
    }

    // 3. 
    Glass(String type) {
        this(199.99); 
        System.out.println(" Constructor with type invoked");
        this.type = type;
    }

    // 4. 
    Glass(double price) {
        this("Clear", "Borosil"); 
        System.out.println(" Constructor with price invoked");
        this.price = price;
    }

    // 5. 
    Glass(String color, String brand) {
        this(true); 
        System.out.println(" Constructor with color and brand invoked");
        this.color = color;
        this.brand = brand;
    }

    // 6. 
    Glass(boolean isTransparent) {
        this("Glass", 12.5, 7.5); 
        System.out.println(" Constructor with isTransparent invoked");
        this.isTransparent = isTransparent;
    }

    // 7. 
    Glass(String material, double height, double diameter) {
        System.out.println(" Constructor with material, height, diameter invoked");
        this.material = material;
        this.height = height;
        this.diameter = diameter;
        this.capacityInMl = 300;
        this.isMicrowaveSafe = true;
    }

    // Display method
    public void displayDetails() {
        System.out.println("\n--- Glass Details ---");
        System.out.println("ID                : " + id);
        System.out.println("Type              : " + type);
        System.out.println("Brand             : " + brand);
        System.out.println("Price             : " + price);
        System.out.println("Color             : " + color);
        System.out.println("Material          : " + material);
        System.out.println("Transparent?      : " + isTransparent);
        System.out.println("Height (cm)       : " + height);
        System.out.println("Diameter (cm)     : " + diameter);
        System.out.println("Capacity (ml)     : " + capacityInMl);
        System.out.println("Microwave Safe?   : " + isMicrowaveSafe);
    }
}
