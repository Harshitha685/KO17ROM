class Soap {

    String skinType;
    String color;
    boolean isOrganic;

    // Default constructor
    Soap() {
        System.out.println("A new soap brand is introduced!");
    }

    // Parameterized constructor
    Soap(String skinType, String color, boolean isOrganic) {
        System.out.println("A new soap brand is introduced!");
        this.skinType = skinType;
        this.color = color;
        this.isOrganic = isOrganic;
    }
}
