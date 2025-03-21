class SwiggyRunner{

public static void main(String[] swi){
String foodStarters = null;
double ref = Swiggy.takeOrder("Panner Tikka");
System.out.println("The price of the foodStarter is :" +ref);

double msg = Swiggy.takeOrder("Panner Tikka",5);
System.out.println("The price of the pizza is :" +msg);

}
}