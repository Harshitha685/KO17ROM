class Paper {

    // Instance Variables
    int id;
    String brand;
    String color;
    double price;
    String size;
    String weight;
    String thickness;
    String coating;
    boolean isRecyclable;
    int gsm;
    String usage;

    // 1. No-args constructor
    Paper() {
        this(11); 
        System.out.println(" No-args constructor");
    }

    // 2. 
    Paper(int id) {
        this("Classmate", "White"); 
        System.out.println(" Constructor with int");
        this.id = id;
    }

    // 3. 
    Paper(String brand, String color) {
        this(45.75); 
        System.out.println(" Constructor with brand and color");
        this.brand = brand;
        this.color = color;
    }

    // 4. 
    Paper(double price) {
        this("A4", "70gsm", "0.09mm"); 
        System.out.println(" Constructor with price");
        this.price = price;
    }

    // 5. 
    Paper(String size, String weight, String thickness) {
        this("Glossy", true); 
        System.out.println(" Constructor with size, weight, thickness");
        this.size = size;
        this.weight = weight;
        this.thickness = thickness;
    }

    // 6. 
    Paper(String coating, boolean isRecyclable) {
        this(80, "Printing"); 
        System.out.println(" Constructor with coating and isRecyclable");
        this.coating = coating;
        this.isRecyclable = isRecyclable;
    }

    // 7. 
    Paper(int gsm, String usage) {
        System.out.println(" Constructor with gsm and usage");
        this.gsm = gsm;
        this.usage = usage;
    }

    
    public void displayDetails() {
        System.out.println("\n--- Paper Details ---");
        System.out.println("ID           : " + id);
        System.out.println("Brand        : " + brand);
        System.out.println("Color        : " + color);
        System.out.println("Price        : " + price);
        System.out.println("Size         : " + size);
        System.out.println("Weight       : " + weight);
        System.out.println("Thickness    : " + thickness);
        System.out.println("Coating      : " + coating);
        System.out.println("Recyclable   : " + isRecyclable);
        System.out.println("GSM          : " + gsm);
        System.out.println("Usage        : " + usage);
    }
}
