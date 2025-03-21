class Processor{
static long id = 3567897654L;
static String name = "Intel Core";
static String gen = "i5";
static String clockSpeed = "2.9GHz";

public static void main(String aa[]){

System.out.println("Before updation");
System.out.println("The id of the processor is:" +id);
System.out.println("The name of the processor is:" +name);
System.out.println("The generation of processor is:" +gen);
System.out.println("The speed of the processor is:" +clockSpeed);

id = 8987L;
name = "AMD";
gen = "i3";
clockSpeed = "1.4GHz";

updateGen();
System.out.println("Before updation");
System.out.println("The id of the processor is:" +id);
System.out.println("The name of the processor is:" +name);
System.out.println("The generation of processor is:" +gen);
System.out.println("The speed of the processor is:" +clockSpeed);
}

public static void updateGen(){
gen = "i3";
}
}