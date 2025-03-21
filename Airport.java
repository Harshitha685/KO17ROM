class Airport{
static long id = 34546578L;
static String name = "Kempegowda International Airport";
 
public static void main(String aa[]){
		
System.out.println("Before re-intialization");
System.out.println("The id of the airport is:" +id);
System.out.println("The name of the airport is:" +name);
		updateID();
		id = 79656780;
		name = "Mangalore International airport";
		
System.out.println("After re-intialization");
System.out.println("The id of the airport is:" +id);
System.out.println("The name of the airport is:" +name);
		
}

public static void updateID(){
	id = 79656780;
	
}
}