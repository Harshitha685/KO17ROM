class Pizza{

static long id = 67855768;
static String name = "SIGNAMIO";
static String size = "medium";
static int price = 499;
 
public static void main(String ar[]){

System.out.println("Before updation");
System.out.println("The id of the pizza is:" +id);
System.out.println("The name of the pizza is:" +name);
System.out.println("The size of pizza is:" +size);
System.out.println("The price of pizza is:" +price);

id = 2345;
name = "Sauce";
size = "large";
price = 799;
 
updatePrice();
System.out.println("After updation");
System.out.println("The id of the pizza is:" +id);
System.out.println("The name of the pizza is:" +name);
System.out.println("The size of pizza is:" +size);
System.out.println("The price of pizza is:" +price);

}

public static void updatePrice(){
price = 799;
}
}