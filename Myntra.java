class Myntra{

public static String logIn(String phoneNumber , String fullName , String emailId , String gender , String dob ,String location)
{
String ref = null;
boolean row = validUserProfile(phoneNumber , fullName , emailId , gender , dob ,location);
if(row  == true){
System.out.println("logIn success");
}
else{
System.out.println("logIn unsuccess");
}
return ref;
}

public static boolean validUserProfile(String phoneNumber , String fullName , String emailId , String gender , String dob ,String location)
{
boolean validUser = false;
boolean isphoneNumber = false;
boolean isfullName = false;
boolean isemailId = false;
boolean isgender = false;
boolean isdob = false;
boolean islocation = false;


//phoneNumber
if(phoneNumber != null && !phoneNumber.isEmpty() && phoneNumber.length() == 10){
	isphoneNumber = true;
}
else{
System.out.println("Invalid phoneNumber");
}

//fullName
if(fullName != null && !fullName.isEmpty() && fullName.length() > 3 ){
	isfullName = true;
}
else{
System.out.println("please provide valid fullName");
}

//emailId
if(emailId != null && !emailId.isEmpty() ){
	isemailId = true;
}
else{
System.out.println("please provide valid emailId");
}

//gender
if(gender != null && !gender.isEmpty() ){
	isgender = true;
}
else{
System.out.println("please provide proper gender");
}

//dob
if(dob != null && !dob.isEmpty() ){
	isdob = true;
}
else{
System.out.println("please enter correct dob");
}

//location
if(location != null && !location.isEmpty() ){
	islocation = true;
}
else{
System.out.println("Invalid location");
}

if(isphoneNumber == true && isfullName == true  && isemailId == true && isgender == true && isdob == true && islocation == true){
validUser = true;
}
return validUser;
}
}