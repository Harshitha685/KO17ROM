class ScientificCalculator{

static String brand = "DR SMARTX";
static String color = "Black";
static String type = "Engineering/Scientific";
public static void main(String aa[]){

System.out.println("Before updation");
System.out.println("The brand of the ScientificCalculator is:" +brand);
System.out.println("The color of the ScientificCalculator is:" +color);
System.out.println("The type of ScientificCalculator is:" +type);
		
brand = "Casio";
color = "Blue";
type = "Scientific";

System.out.println("After updation");
System.out.println("The brand of the ScientificCalculator is:" +brand);
System.out.println("The color of the ScientificCalculator is:" +color);
System.out.println("The type of ScientificCalculator is:" +type);

updateColor();
}

public static void updateColor(){
color = "Blue";
}
}