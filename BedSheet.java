class BedSheet{
static String size = "Double Bed";
static String color = "Light Blue";
static String material = "Cotton";
static String pattern = "Floral";
static String brand = "Status Contract";

public static void main(String aa[]){

System.out.println("Before update");
System.out.println("The size is:" +size);
System.out.println("The color used in Bedsheet is:" +color);
System.out.println("The material is:" +material);
System.out.println("The pattern of Bedsheet is:" +pattern);
System.out.println("The brand is:" +brand);

updateMaterial();
size = "Single Bed";
color = "Blue";
material = "Polymer";
pattern = "Mehendi";
brand = "Spaces";

System.out.println("After updation");
System.out.println("The size is:" +size);
System.out.println("The color used in Bedsheet is:" +color);
System.out.println("The material is:" +material);
System.out.println("The pattern of Bedsheet is:" +pattern);
System.out.println("The brand is:" +brand);
}

public static void updateMaterial(){
material = "Polymer";
}
}


