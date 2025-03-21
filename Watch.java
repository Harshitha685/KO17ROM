class Watch{

static String brand = "Fastrack";
static String color = "Rosegold";
static String type = "analog";
public static void main(String an[]){

System.out.println("Before updation");
System.out.println("The brand of the watch is:" +brand);
System.out.println("The color of watch is:" +color);
System.out.println("The type of the watch is:" +type);

brand = "Redmi";
color = "Black";
type = "digital";

updateBrand();
System.out.println("After updation");		
System.out.println("The brand of the watch is:" +brand);
System.out.println("The color of watch is:" +color);
System.out.println("The type of the watch is:" +type);
}

public static void updateBrand(){
brand = "Redmi";
}
}