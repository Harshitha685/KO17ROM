class UberEatsRunner{

public static void main(String[] eats){

double ref = UberEats.orders("Mint Chocolate Chip");
System.out.println("The iceCream price is :" +ref);

double msg = UberEats.orders("Mint Chocolate Chip" , 8);
System.out.println("The iceCream price is :" +msg);
}
}