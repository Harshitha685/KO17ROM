class Charger { 

static long id = 9787658585L;
static	String brand = "HAMMER";
static	String color = "White + 45W GaN";

public static void main(String game[]){

System.out.println("Before updation");
System.out.println("The charger id is:" +id);
System.out.println("The brand of the charger is:" +brand);
System.out.println("The color of charger is:" +color);

	 id = 2345676L;
	 brand = "Apple";
	 color = "White";
updateColor();
System.out.println("After updation");		
System.out.println("The charger id is:" +id);
System.out.println("The brand of the charger is:" +brand);
System.out.println("The color of charger is:" +color);
}

public static void updateColor(){
color = "White";
}
} 
