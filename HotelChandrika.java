class HotelChandrika{

static String northIndianGravies[] = {"Panner butter masala","Panner Kholapuri","Palak Panner","Panner Pasand","Mix Veg Curry","Veg Kurma","Aloo Gobi masala","Aloo Gobi Dry","Tomato Curry","Green Peas"};

public static void main(String hot[]){
System.out.println("Main started:");
gravies();
System.out.println("Main ended:");

}

public static void gravies(){
	
System.out.println("start of gravies");
for(String gravie: northIndianGravies){
	System.out.println(gravie);
}
System.out.println("end of gravies");

//external reference
String ref1 = northIndianGravies[0];
System.out.println(ref1);

}
}