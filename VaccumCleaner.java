class VaccumCleaner{

static String brand = "amazon basics";
static String voltage	= "12 Volts";
static String powerSource	= "Corded Electric";
static String noiseLevel	= "92 dB";
static String specialFeature	= "Portable";
public static void main(String hh[]){

System.out.println("Before updation");
System.out.println("The brand of the VaccumCleaner is:" +brand);
System.out.println("The voltage is:" +voltage);
System.out.println("The powerSource used in VaccumCleaner is:" +powerSource);
System.out.println("The noiseLevel is:" +noiseLevel);
System.out.println("The specialFeature of VaccumCleaner is:" +specialFeature);

brand = "AGARO";
voltage	= "800 Volts";
powerSource	= "Corded Electric";
noiseLevel	= "100 dB";
specialFeature	= "Lightweight,Durable,Flexible";


System.out.println("After updation");
System.out.println("The brand of the VaccumCleaner is:" +brand);
System.out.println("The voltage is:" +voltage);
System.out.println("The powerSource used in VaccumCleaner is:" +powerSource);
System.out.println("The noiseLevel is:" +noiseLevel);
System.out.println("The specialFeature of VaccumCleaner is:" +specialFeature);

updateVoltage();

}

public static void updateVoltage(){
voltage	= "12 Volts";
}
}