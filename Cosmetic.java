class Cosmetic {

    String name;
    String category; 
    String shade;
    double price;

    Cosmetic() {
        System.out.println("A new cosmetic product is launched!");
    }

    Cosmetic(String name, String category, String shade, double price) {
        System.out.println("A new cosmetic product is launched!");
        this.name = name;
        this.category = category;
        this.shade = shade;
        this.price = price;
    }
}
