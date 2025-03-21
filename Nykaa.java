class Nykaa{

public static String logIn(String emailId, String name, String mobileNumber, String passWord){

String val = null;

boolean vay = validateLogIn(emailId, name, mobileNumber, passWord);
if(vay == true){
System.out.println("logIn successful");
}
else{
System.out.println("logIn unsuccessful");
}
return val;

}


public static boolean validateLogIn(String emailId, String name, String mobileNumber, String passWord)
{
boolean validLogIn = false;
boolean isemailId = false;
boolean isname = false;
boolean ismobileNumber = false;
boolean ispassWord = false;

//emailId
if(emailId != null && !emailId.isEmpty())
{
	isemailId = true;
}
else{
System.out.println("EmailId is invalid...please provide correct emailId");
}

//name
if(name != null && !name.isEmpty() && name.length() >=4){
	isname = true;
}
else{
System.out.println("Invalid name...please enter the correct name");
}

//mobileNumber
if(mobileNumber != null && !mobileNumber.isEmpty() &&  mobileNumber.length() == 10){
	ismobileNumber = true;
}
else{
System.out.println("mobileNumber is not valid");
}

//passWord
if(passWord !=null && !passWord.isEmpty() && passWord.length() > 8 ){
	ismobileNumber = true;
}
else{
System.out.println("Incorrect passWord");
}

if(isemailId == true && isname == true && ismobileNumber == true && ispassWord == true){
validLogIn = true;
}
return validLogIn;
}
}