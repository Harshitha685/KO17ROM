class Radio {

static String brand = "PHILIPS";
static String color = "Grey";
static String specialFeature = "Portable, Lightweight, Built-In AM Antenna";
public static void main(String hha[]){

System.out.println("Before reinitialize");
System.out.println("The brand of the Radio is:" +brand);
System.out.println("The color of the Radio is:" +color);
System.out.println("The specialFeature is:" +specialFeature);
		
brand = "Greadio";
color = "Black";
specialFeature = "LCD Display, Time Setting";

System.out.println("After reinitialize");
System.out.println("The brand of the Radio is:" +brand);
System.out.println("The color of the Radio is:" +color);
System.out.println("The specialFeature is:" +specialFeature);

updateBrand();
}

public static void updateBrand(){
brand = "Greadio";
}
}