class Helmet{

static String colour = "Glossy Black Grey with Night Vision Blue Visor";
static String material	 = "High Impact Resistant Thermoplastic shell";
static String sport = "Paw petrol";
static String brand = "Steelbird";

public static void main(String args[]){

System.out.println("Before initialize");
System.out.println("The colour of the Helmet is:" +colour);
System.out.println("The material used in Helmet is:" +material);
System.out.println("The sport is:" +sport);
System.out.println("The brand of the Helmet is:" +brand);

colour = "black";
material	 = "High-quality fiberglass and composite materials.";
sport = "sgjhka";
brand = "Arai:";

System.out.println("After initialize");
System.out.println("The colour of the Helmet is:" +colour);
System.out.println("The material used in Helmet is:" +material);
System.out.println("The sport is:" +sport);
System.out.println("The brand of the Helmet is:" +brand);
 updateSport();
}

public static void updateSport(){
sport = "sgjhka";
}

}