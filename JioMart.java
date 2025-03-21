class JioMart{

public static String signUp(String mobileNumber , String firstName , String lastName , String gender , String emailId){

String rose = null;

boolean maa = userDetailsValidation( mobileNumber , firstName , lastName , gender , emailId);
if(maa == true){
System.out.println("userDetailsValidation success");
}
else{
System.out.println("userDetailsValidation unsuccess");
}
return rose;
}

public static boolean userDetailsValidation(String mobileNumber , String firstName , String lastName , String gender , String emailId)
{
boolean userValidation = false;
boolean ismobileNumber = false;
boolean isfirstName = false;
boolean islastName = false;
boolean isgender = false;
boolean isemailId = false;

//mobileNumber
if(mobileNumber != null && !mobileNumber.isEmpty() && mobileNumber.length() == 10){
	ismobileNumber = true;
}
else{
System.out.println("Invalid mobileNumber");
}

//firstName
if(firstName != null && !firstName.isEmpty() ){
	isfirstName = true;
}
else{
System.out.println("please provide valid firstName");
}

//lastName
if(lastName != null && !lastName.isEmpty() ){
	islastName = true;
}
else{
System.out.println("please provide valid lastName");
}

//gender
if(gender != null && !gender.isEmpty()){
	isgender = true;
}
else{
System.out.println("please provide proper gender");
}

//emailId
if(emailId != null && !emailId.isEmpty()){
	isemailId = true;
}
else{
System.out.println("please provide correct emailId");
}

if(ismobileNumber == true && isfirstName == true  && islastName == true && isgender == true && isemailId == true ){
userValidation = true;
}
return userValidation;

}
}