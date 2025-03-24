class OlaFoodsRunner{

public static void main(String[] ola){

double ref = OlaFoods.foodOrders("bisi bele bath");
System.out.println("The dishes price is :" +ref);

double logIn = OlaFoods.foodOrders("bisi bele bath",5);
System.out.println("The dishes price is :" +logIn);
}
}