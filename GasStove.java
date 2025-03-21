class GasStove{
static String colour = "Black";
static String material = "Glass";
static String name = "MILTON";
static int heatingElements = 3;
static String specialFeature = "Safety Features - (1) Don't put hot vessels directly on the glass surface";
public static void main(String arg[]){

System.out.println("Before updation");
System.out.println("The colour of the GasStove is:" +colour);
System.out.println("The material used in the GasStove is:" +material);
System.out.println("The name of the GasStove is:" +name);
System.out.println("The specialFeature of the GasStove  is:" +specialFeature);

colour = "Blue";
material = "Glass/Fiber";
name = "Butterfly";
heatingElements = 4;
specialFeature = "Gas";
System.out.println("After updation");
System.out.println("The colour of the GasStove is:" +colour);
System.out.println("The material used in the GasStove is:" +material);
System.out.println("The name of the GasStove is:" +name);
System.out.println("The specialFeature of the GasStove  is:" +specialFeature);
}

public static void updateName(){
name = "Butterfly";
}
}