class Weapon {

    // Instance variables
    int id;
    String name;
    String type;
    double weight;
    double damage;
    double range;
    boolean isRanged;
    boolean isMelee;
    String material;
    String color;

    // 1. No-args constructor
    Weapon() {
        this(1);
        System.out.println(" No-args constructor called");
    }

    // 2.
    Weapon(int id) {
        this("Sword");
        System.out.println(" Constructor with int id called");
        this.id = id;
    }

    // 3. 
    Weapon(String name) {
        this(10.5); 
        System.out.println(" Constructor with String name called");
        this.name = name;
    }

    // 4. 
    Weapon(double weight) {
        this("Steel", "Silver");
        System.out.println(" Constructor with weight called");
        this.weight = weight;
    }

    // 5. 
    Weapon(String material, String color) {
        this(50.0, 20.0);
        System.out.println(" Constructor with material and color called");
        this.material = material;
        this.color = color;
    }

    // 6. 
    Weapon(boolean isRanged) {
        this(10.0, 100.0); 
        System.out.println(" Constructor with isRanged called");
        this.isRanged = isRanged;
    }

    // 7. 
    Weapon(double damage, double range) {
        System.out.println(" Constructor with damage and range called");
        this.damage = damage;
        this.range = range;
        
    }

    
    public void displayDetails() {
        System.out.println("\n--- Weapon Details ---");
        System.out.println("ID          : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Type        : " + type);
        System.out.println("Weight (kg) : " + weight);
        System.out.println("Damage      : " + damage);
        System.out.println("Range (m)   : " + range);
        System.out.println("Is Ranged?  : " + isRanged);
        System.out.println("Is Melee?   : " + isMelee);
        System.out.println("Material    : " + material);
        System.out.println("Color       : " + color);
    }

}