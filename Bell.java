class Bell {

    String material;
    double size;
    String soundType;
    boolean isDecorative;

    Bell() {
        System.out.println("A new bell has been crafted!");
    }

    Bell(String material, double size, String soundType, boolean isDecorative) {
        System.out.println("A new bell has been crafted!");
        this.material = material;
        this.size = size;
        this.soundType = soundType;
        this.isDecorative = isDecorative;
    }
}
