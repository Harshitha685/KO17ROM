class AC{

static boolean isConnected = false;
static int currentTemp;
static int maxTemp = 6;
static int minTemp;

public static void OnOff(){

if(isConnected == false){
	isConnected = true;
	System.out.println("AC is On...");
} else if(isConnected == true){
	isConnected = false;
}
}

public static void increaseTemp(){
	if(isConnected == true ){
		if(currentTemp < maxTemp ){
	currentTemp = currentTemp + 1; //updating
		System.out.println("The currentTemp is:" +currentTemp);	
	}else System.out.println("Max temp reached");
	}else System.out.println("Gubee...Turn on the AC first");
	}


public static void decreaseTemp(){
	if(isConnected == true ){
		if(currentTemp > minTemp){
		currentTemp = currentTemp - 1;
		System.out.println("The currentTemp is:" +currentTemp);	
	}else System.out.println("Min temp reached");
	}else System.out.println("Turn on the AC First");
}
}