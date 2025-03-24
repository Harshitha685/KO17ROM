class Vase {

    String designType;     
    String buildMaterial; 
    String shade;          
    double size;           

    Vase() {
        System.out.println("A new vase has been added to the collection!");
    }

    Vase(String designType, String buildMaterial, String shade, double size) {
        System.out.println("A new vase has been added to the collection!");
        this.designType = designType;
        this.buildMaterial = buildMaterial;
        this.shade = shade;
        this.size = size;
    }
}
