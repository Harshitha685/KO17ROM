class Curtain{
static String brand = "S2S";
static String colour = "Green";
static String material = "Polycotton";
static String productDimensions = "138L x 244W Centimeters";

public static void main(String kk[]){

System.out.println("Before updation");
System.out.println("The brand of the Curtain is:" +brand);
System.out.println("The colour of the Curtain is:" +colour);
System.out.println("The material used in Curtain is:" +material);
System.out.println("The productDimensions is:" +productDimensions);

brand = "Story@Home";
colour = "Navy Blue";
material = "Faux Silk";
productDimensions = "2.15L x 1.16W Meters";

System.out.println("Before updation");
System.out.println("The brand of the Curtain is:" +brand);
System.out.println("The colour of the Curtain is:" +colour);
System.out.println("The material used in Curtain is:" +material);
System.out.println("The productDimensions is:" +productDimensions);
updateMaterial();

}

public static void updateMaterial(){
material = "Faux Silk";
}
}