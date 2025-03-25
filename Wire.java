class Wire {

    // Instance variables
    int id;
    String material;
    double length;
    double diameter;
    double resistance;
    String color;
    boolean isInsulated;
    boolean isCopper;
    boolean isFlexible;
    String insulationType;
    String purpose;

    // 1. No-args constructor
    Wire() {
        this(101);
        System.out.println(" No-args constructor invoked");
    }

    // 2. 
    Wire(int id) {
        this("Copper");
        System.out.println(" Constructor with int id invoked");
        this.id = id;
    }

    // 3. 
    Wire(String material) {
        this(100.0); 
        System.out.println(" Constructor with String material invoked");
        this.material = material;
    }

    // 4. 
    Wire(double length) {
        this("Red", "Electrical");
        System.out.println(" Constructor with length invoked");
        this.length = length;
    }

    // 5. 
    Wire(double diameter, double resistance) {
        this(true);
        System.out.println(" Constructor with diameter and resistance invoked");
        this.diameter = diameter;
        this.resistance = resistance;
    }

    // 6. 
    Wire(boolean isInsulated) {
        this("Plastic", "Communication");
        System.out.println("6. Constructor with isInsulated invoked");
        this.isInsulated = isInsulated;
    }

    // 7. 
    Wire(String color, String purpose) {
        System.out.println(" Constructor with color and purpose invoked");
        this.color = color;
        this.purpose = purpose;
        
    }

    
    public void displayDetails() {
        System.out.println("\n--- Wire Details ---");
        System.out.println("ID                 : " + id);
        System.out.println("Material           : " + material);
        System.out.println("Length (meters)    : " + length);
        System.out.println("Diameter (mm)      : " + diameter);
        System.out.println("Resistance (ohms)  : " + resistance);
        System.out.println("Color              : " + color);
        System.out.println("Is Insulated?      : " + isInsulated);
        System.out.println("Is Copper?         : " + isCopper);
        System.out.println("Is Flexible?       : " + isFlexible);
        System.out.println("Insulation Type    : " + insulationType);
        System.out.println("Purpose            : " + purpose);
    }

}
