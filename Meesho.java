class Meesho{

public static String register(String fullName , String phoneNumber , String emailId , String location , String dob)
{

String obi = null;
boolean ref = validCustomerDetails(fullName , phoneNumber , emailId , location , dob);
if(ref == true){
System.out.println("user registration successful");
}
else{
System.out.println("user registration unsuccessful");
}

return obi;

}


public static boolean validCustomerDetails(String fullName , String phoneNumber , String emailId , String location , String dob)
{
boolean customerValid = false;
boolean isfullName = false;
boolean isphoneNumber = false;
boolean isemailId = false;
boolean islocation = false;
boolean isdob = false;


//fullName
if(fullName != null && !fullName.isEmpty() && fullName.length() > 3 ){
	isfullName = true;
}
else{
System.out.println("please provide valid fullName");
}

//phoneNumber
if(phoneNumber != null && !phoneNumber.isEmpty() && phoneNumber.length() == 10){
	isphoneNumber = true;
}
else{
System.out.println("Invalid phoneNumber");
}


//emailId
if(emailId != null && !emailId.isEmpty()){
	isemailId = true;
}
else{
System.out.println("please provide valid emailId");
}


//location
if(location != null && !location.isEmpty()){
	islocation = true;
}
else{
System.out.println("Invalid location");
}

//dob
if(dob != null && !dob.isEmpty()){
	isdob = true;
}
else{
System.out.println("please enter correct dob");
}



if(isfullName == true && isphoneNumber == true && isemailId == true && islocation == true && isdob == true) {
customerValid = true;
}
return customerValid;
}
}
