class FoodPandaRunner{

public static void main(String[] panda){
String food = null;
double ref = FoodPanda.dineIn("Sup Ayam");
System.out.println("The price of the food is :" +ref);
double msg = FoodPanda.dineIn("Sup Ayam",6);
System.out.println("The price of the food is :" +msg);

}
}