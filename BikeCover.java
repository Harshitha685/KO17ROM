class BikeCover{

static String material	= "POLY COATED";
static String colour = "SILVER";
static String brand = "Amazon Brand - Solimo";
static String itemWeight	= "300 Grams";

public static void main(String ath[]){
System.out.println("Before updation");
System.out.println("The material used in BikeCover is:" +material);
System.out.println("The colour of the BikeCover is:" +colour);
System.out.println("The brand of the BikeCover is:" +brand);
System.out.println("The itemWeight is:" +itemWeight);

material	= "Fabric";
colour = "Black";
brand = "TVS";
itemWeight	= "500 Grams";

System.out.println("After updation");
System.out.println("The material used in BikeCover is:" +material);
System.out.println("The colour of the BikeCover is:" +colour);
System.out.println("The brand of the BikeCover is:" +brand);
System.out.println("The itemWeight is:" +itemWeight);
		
updateBrand();		

}

public static void updateBrand(){
brand = "TVS";
}
}