class SnapDeal{

public static String registration(String emailId , String mobileNumber , String name ,String dob, String passWord){

String arg = null;

boolean ref = userRegistrationValidation(emailId , mobileNumber , name ,dob, passWord);
if( ref == true){
System.out.println("user registration success");
}
else{
System.out.println("user registration unsuccess");
}

return arg;
}


public static boolean userRegistrationValidation(String emailId , String mobileNumber , String name ,String dob, String passWord)
{
boolean validUser = false;
boolean isemailId = false;
boolean ismobileNumber = false;
boolean isname = false;
boolean isdob = false;
boolean ispassWord = false;

//emailId
if(emailId != null && !emailId.isEmpty()){
	isemailId = true;
}
else{
System.out.println("Invalid emailId");
}

//mobileNumber
if(mobileNumber != null && !mobileNumber.isEmpty() && mobileNumber.length() == 10){
	ismobileNumber = true;
}
else{
System.out.println("mobileNumber is incorrect");
}

//name
if(name != null && !name.isEmpty() && name.length() > 3){
	isname = true;
}
else{
System.out.println("Name is not correct");
}

//dob
if(dob != null && !dob.isEmpty()){
	isdob = true;
}
else{
System.out.println("Incorect dob");
}

//passWord
if(passWord != null && !passWord.isEmpty() && passWord.length() >8){
	ispassWord = true;
}
else{
System.out.println("Incorrect passWord");
}

if(isemailId == true && ismobileNumber == true && isname == true && isdob == true && ispassWord == true){
	validUser = true;
}
return validUser;
}
}