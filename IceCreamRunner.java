class IceCreamRunner{

public static void main(String ice[]){

IceCream copy1 = new IceCream();

copy1.name = "vanilla";
copy1.state = "solid";
copy1.texture = "smoothy";
copy1.taste = "sweet";
copy1.price = 35.00;
copy1.meltingPoint = 3;

	
	System.out.println("name : "+copy1.name);
	System.out.println("state : "+copy1.state);
	System.out.println("texture : "+copy1.texture);
	System.out.println("taste : "+copy1.taste);
	System.out.println("price : "+copy1.price);
	System.out.println("meltingPoint : "+copy1.meltingPoint);
	System.out.println("\n");
	
	
IceCream copy2 = new IceCream();

copy2.name = "butterscoth";
copy2.state = "semi-solid";
copy2.texture = "creamy";
copy2.taste = "sweet";
copy2.price = 50.00;
copy2.meltingPoint = 4;

	
	System.out.println("name : "+copy2.name);
	System.out.println("state : "+copy2.state);
	System.out.println("texture : "+copy2.texture);
	System.out.println("taste : "+copy2.taste);
	System.out.println("price : "+copy2.price);
	System.out.println("meltingPoint : "+copy2.meltingPoint);
	System.out.println("\n");


}
}