class Area{
	
static int pinCodes[] = {560012,560013,560072,560001};	

public static void main(String area[]){
System.out.println("Main started");
getPinCodes();
System.out.println("main ended");   
}

public static void getPinCodes() {
System.out.println("inside getPinCodes");
System.out.println("List of area pincodes available are:");

for(int pinCode : pinCodes){
	System.out.println(pinCode);
System.out.println("end of getPinCodes");

}
}

}
