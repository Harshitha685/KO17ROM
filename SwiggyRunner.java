class SwiggyRunner{

public static void main(String swiggy[]){

double msg = Swiggy.takeOrder("Burger");
System.out.println("The price of one burger is:" +msg);

double ref = Swiggy.takeOrder("Burger",5);
System.out.println("The price of the burger quantity is:" +ref);
}
}