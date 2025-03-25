class Switch {

    // Instance variables
    int id;
    String brand;
    String type;
    double price;
    String color;
    String material;
    int numberOfButtons;
    boolean isSmart;
    boolean hasIndicator;
    boolean isWaterResistant;
    String installationType;

    // 1. No-args constructor
    Switch() {
        this(101);
        System.out.println(" No-args constructor invoked");
    }

    // 2.
    Switch(int id) {
        this("GM");
        System.out.println(" Constructor with int invoked");
        this.id = id;
    }

    // 3. 
    Switch(String brand) {
        this(299.99);
        System.out.println(" Constructor with brand invoked");
        this.brand = brand;
    }

    // 4.
    Switch(double price) {
        this("White", "Modular");
        System.out.println(" Constructor with price invoked");
        this.price = price;
    }

    // 5. 
    Switch(String color, String type) {
        this(true);
        System.out.println(" Constructor with color & type invoked");
        this.color = color;
        this.type = type;
    }

    // 6. 
    Switch(boolean isSmart) {
        this("Plastic", 3, true);
        System.out.println(" Constructor with isSmart invoked");
        this.isSmart = isSmart;
    }

    // 7. 
    Switch(String material, int numberOfButtons, boolean hasIndicator) {
        System.out.println(" Constructor with material, buttons, indicator invoked");
        this.material = material;
        this.numberOfButtons = numberOfButtons;
        this.hasIndicator = hasIndicator;
        
    }

    
    public void displayDetails() {
        System.out.println("\n--- Switch Details ---");
        System.out.println("ID                : " + id);
        System.out.println("Brand             : " + brand);
        System.out.println("Type              : " + type);
        System.out.println("Price             : " + price);
        System.out.println("Color             : " + color);
        System.out.println("Material          : " + material);
        System.out.println("Number of Buttons : " + numberOfButtons);
        System.out.println("Smart?            : " + isSmart);
        System.out.println("Has Indicator?    : " + hasIndicator);
        System.out.println("Water Resistant?  : " + isWaterResistant);
        System.out.println("Installation Type : " + installationType);
    }
}
