class FlashDrive{

static String brand = "HP";
static String memoryStorageCapacity = "128GB";
static String hardwareInterface = "USB";
static String specialFeature = "Lightweight";

public static void main(String ayi[]){

System.out.println("Before updation");
System.out.println("The brand of the FlashDrive is:" +brand);
System.out.println("The memoryStorageCapacity of the FlashDrive is:" +memoryStorageCapacity);
System.out.println("The hardwareInterface of FlashDrive is:" +hardwareInterface);
System.out.println("The specialFeature of the FlashDrive  is:" +specialFeature);

brand = "SanDisk";
memoryStorageCapacity = "256GB";
hardwareInterface = "USB 3.2 Gen 1";
specialFeature = "Dual USB Connector";

System.out.println("After updation");
System.out.println("The brand of the FlashDrive is:" +brand);
System.out.println("The memoryStorageCapacity of the FlashDrive is:" +memoryStorageCapacity);
System.out.println("The hardwareInterface of FlashDrive is:" +hardwareInterface);
System.out.println("The specialFeature of the FlashDrive  is:" +specialFeature);

updateHardwareInterface();

}

public static void updateHardwareInterface(){

}
}