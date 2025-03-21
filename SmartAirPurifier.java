class SmartAirPurifier{
static String colour = "White";
static String brand = "Philips";
static String productDimensions = "27.3Dx48.6Wx27.3HCentimeters";
static String floorArea = "380SquareFeet";
static String specificationMet = "RoHS Certified";

public static void main(String jjj[]){

System.out.println("Before updation");
System.out.println("The colour of the SmartAirPurifier is:" +colour);
System.out.println("The brand of the SmartAirPurifier is:" +brand);
System.out.println("The productDimensions of the SmartAirPurifier is:" +productDimensions);
System.out.println("The floorArea of the SmartAirPurifier  is:" +floorArea);
System.out.println("The specification that met the SmartAirPurifier is:" +specificationMet);

colour = "White";
brand = "Honeywell";
productDimensions = "21.5D x 21.5W x 32.2H Centimeters";
floorArea = "235 Square Feet";
specificationMet = "HEPA";

System.out.println("After updation");
System.out.println("The colour of the SmartAirPurifier is:" +colour);
System.out.println("The brand of the SmartAirPurifier is:" +brand);
System.out.println("The productDimensions of the SmartAirPurifier is:" +productDimensions);
System.out.println("The floorArea of the SmartAirPurifier  is:" +floorArea);
System.out.println("The specification that met the SmartAirPurifier is:" +specificationMet);

}

public static void updateBrand(){
brand = "Honeywell";
}
}