class SewingMachine{
//single copy
static String brand = "USHA";
static String color = "White & Black";
static String productDimensions = "8D x 14.5W x 11H Centimeters";
static String material = "Plastic";

public static void main(String kl[]){

System.out.println("Before updation");
System.out.println("The brand of the SewingMachine is:" +brand);
System.out.println("The color of the SewingMachine is:" +color);
System.out.println("The productDimensions  is:" +productDimensions);
System.out.println("The material is:" +material);

brand = "akiara - Makes life easy";
color = "White";
productDimensions = "5.1D x 9.5W x 9.3H Centimeters";
material = "Plastic";

System.out.println("After updation");
System.out.println("The brand of the SewingMachine is:" +brand);
System.out.println("The color of the SewingMachine is:" +color);
System.out.println("The productDimensions  is:" +productDimensions);
System.out.println("The material is:" +material);

updateProductDimensions();
}

public static void updateProductDimensions(){
productDimensions = "5.1D x 9.5W x 9.3H Centimeters";
}
}