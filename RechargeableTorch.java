class RechargeableTorch{

static String specialFeature = "Portable, Adjustable Light Modes, Rechargeable";
static String colour = "Black";
static String powerSource	= "Battery Powered";
static String lightSourcetype = "LED";
static String material	= "Plastic";

public static void main(String aaa[]){
System.out.println("Before updation");
System.out.println("The specialFeature of the RechargeableTorch  is:" +specialFeature);
System.out.println("The colour of the RechargeableTorch is:" +colour);
System.out.println("The powerSource of the RechargeableTorch is:" +powerSource);
System.out.println("The lightSourcetype that was used in RechargeableTorch is:" +lightSourcetype);
System.out.println("The material used in RechargeableTorch is:" +material);

specialFeature = "Lightweight";
colour = "Blue";
powerSource	= "Battery Powered";
lightSourcetype = "LED";
material	= "Fiber";

System.out.println("After updation");
System.out.println("The specialFeature of the RechargeableTorch  is:" +specialFeature);
System.out.println("The colour of the RechargeableTorch is:" +colour);
System.out.println("The powerSource of the RechargeableTorch is:" +powerSource);
System.out.println("The lightSourcetype that was used in RechargeableTorch is:" +lightSourcetype);
System.out.println("The material used in RechargeableTorch is:" +material);

updateColour();

}
public static void updateColour(){
colour = "Blue";
}

}