class Swiggy{

public static double takeOrder(String orderName){

double Price = 0.0;

if(orderName == "Burger"){
	Price = 99.00;
	
}
return Price;
}

	
public static double takeOrder(String orderName, int quantity){

double price = 0.0;
if(orderName == "Burger"){
	price = 99.0 * quantity;
	
}
return price;
}
	
}
