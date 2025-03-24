class Bell {

    String buildMaterial;
    double diameter;
    String toneType;
    boolean forDecoration;

    Bell() {
        System.out.println("A new bell has been crafted!");
    }

    Bell(String buildMaterial, double diameter, String toneType, boolean forDecoration) {
        System.out.println("A new bell has been crafted!");
        this.buildMaterial = buildMaterial;
        this.diameter = diameter;
        this.toneType = toneType;
        this.forDecoration = forDecoration;
    }
}
