class StorageRack{

static String brand = "Kuber Industries";
static String productDimensions = "28D x 28W x 78H Centimeters";
static String shelfType = "Tiered Shelf";
static String material	= "1 Pcs-Black";
public static void main(String ff[]){

System.out.println("Before updation");
System.out.println("The brand of the StorageRack is:" +brand);
System.out.println("The productDimensions  is:" +productDimensions);
System.out.println("The shelfType is used:"+shelfType);
System.out.println("The material is:" +material);

brand = "House of Quirk";
productDimensions = "38D x 110W x 147H Centimeters";
shelfType = "Shelf";
material	= "2 Pcs-Black";

System.out.println("After updation");
System.out.println("The brand of the StorageRack is:" +brand);
System.out.println("The productDimensions  is:" +productDimensions);
System.out.println("The shelfType is used:"+shelfType);
System.out.println("The material is:" +material);
updateShelfType();
}

public static void updateShelfType(){
shelfType = "Shelf";
}
}