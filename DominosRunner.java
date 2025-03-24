class DominosRunner{

public static void main(String[] dom){
String pizzaName = null;

double ref = Dominos.userOrders("Corn and Cheese Volcano");
System.out.println("The price of the pizza is :" +ref);

double msg = Dominos.userOrders("Blazing Onion and Paprika",3);
System.out.println("The price of the pizza is :" +msg);

}
}