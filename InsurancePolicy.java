class InsurancePolicy{

public static double policyPrice(String insuranceName){

double price = 0.0;

if(insuranceName == "LIC"){
	price = 10000.00;
}

else if(insuranceName == "Max Life Insurance"){
	price = 7000.00;
}

else if(insuranceName == "SBI Life Insurance"){
	price = 11000.0;
}

else if(insuranceName == "Tata AIA Insurance"){
	price = 11150.0;
}

else if(insuranceName == "HDFC Life Insurance")
	price = 80000;
	
else if(insuranceName == "KOTAK Life Insurance")
	price = 60000;
	
else if(insuranceName == "AXIS Bank Life Insurance")
	price = 6500.99;
	
else if(insuranceName == "ICICI Life Insurance")
	price = 12000.99;
	
else if(insuranceName == "Bajaj Alliance Insurance")
	price = 13000.99;
	
else if(insuranceName == "Smart Bazar Insurance")
	price = 14000.99;
	
else
System.out.println("Insurance price not found");
return price;
}
}