class FlipKart{

public static String signUp(String phoneNumber , String gender , String emailId , String name , String password , String location){

String con = null;

boolean ref = userValidate(phoneNumber , gender , emailId , name , password , location );
if(ref == true){
System.out.println("user registration successful");
}
else{
System.out.println("user registration unsuccessful");
}

return con;

}


public static boolean userValidate(String phoneNumber , String gender , String emailId , String name , String password , String location )
{
boolean validUser = false;
boolean isphoneNumber = false;
boolean isgender = false;
boolean isemailId = false;
boolean isname = false;
boolean ispassword = false;
boolean islocation = false;

//phoneNumber
if("phoneNumber" != null && !"phoneNumber".isEmpty() && phoneNumber.length() == 10){
	isphoneNumber = true;
}
else{
System.out.println("Invalid phoneNumber");
}


//gender
if("gender" != null && !"gender".isEmpty() ){
	isgender = true;
}
else{
System.out.println("please enter correct gender");
}

//emailId
if(emailId != null && !emailId.isEmpty() ){
	isemailId = true;
}
else{
System.out.println("please enter correct emailId");
}

//name
if(name != null && !name.isEmpty() && name.length() > 3){
	isname = true;
}
else{
System.out.println("Invalid name");
}


//password
if(password != null && !password.isEmpty() && password.length() > 8  ){
	ispassword = true;
}
else{
System.out.println("please enter correct password");
}

//location
if(location != null && !location.isEmpty() ){
	isemailId = true;
}
else{
System.out.println("please enter proper location");
}

if(isphoneNumber == true && isgender == true && isemailId == true && isname == true && ispassword == true && islocation == true) {
validUser = true;
}
return validUser;
}
}
