class Amazon{

public static String signIn(String emailId, String phoneNumber, String fullName, String password, String confirmPassword)
{
String var = null;

boolean variable = userProfileValidate(emailId , phoneNumber ,fullName , password ,confirmPassword);
if(variable == true){
System.out.println("signIn successful");
}
else{
System.out.println("signIn unsuccessful");
}
return var;

}



public static boolean userProfileValidate(String emailId, String phoneNumber, String fullName, String password, String confirmPassword)
{
boolean userValid = false;
boolean isemailIdValid = false;
boolean isphoneNumber = false;
boolean isfullName = false;
boolean ispassWord = false;
boolean isconfirmPassword = false;

//emailId
if(emailId != null && !emailId.isEmpty()){
isemailIdValid = true;
}
else{
System.out.println("EmailId is invalid");
}

//phoneNumber
if(phoneNumber != null && !phoneNumber.isEmpty() && phoneNumber.length() > 0 && phoneNumber.length() == 10){
isphoneNumber = true;
}
else{
System.out.println("Please give the right number");
}

//fullName
if(fullName != null && !fullName.isEmpty() && fullName.length() >= 3){
isfullName = true;
}
else{
System.out.println("fullName is invalid");
}

//password
if(password != null && !password.isEmpty() && password.length() >= 8 ){
	ispassWord = true;
}
else{
System.out.println("Password is incorrect... please enter correct password");
}

//confirmPassword
if(confirmPassword != null && !confirmPassword.isEmpty() && confirmPassword.length() == password.length()){
isconfirmPassword = true;
System.out.println("password is matching");
}
else{
System.out.println("Password is not matching.. please enter correct password");
}

if(isemailIdValid == true && isphoneNumber == true && isfullName == true && ispassWord == true && isconfirmPassword == true){
	userValid = true;
}
return userValid;
}
}