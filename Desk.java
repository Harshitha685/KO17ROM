class Desk{

static String brand = "XYZ";
static String dimension = "2.5inches";
static String material = "Fiber";

public static void main(String de[]){

System.out.println("Before updation");
System.out.println("The brand of desk is:" +brand);
System.out.println("The dimensions is:" +dimension);
System.out.println("The material used is:" +material);

brand = "ABC";
dimension = "1.9inches";
material = "Plastic";

System.out.println("After updation");
System.out.println("The brand of desk is:" +brand);
System.out.println("The dimensions is:" +dimension);
System.out.println("The material used is:" +material);

updateDimension();
}

public static void updateDimension(){
dimension = "1.9inches";

}
}