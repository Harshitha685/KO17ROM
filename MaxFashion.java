class MaxFashion{
//purpose/functionality

public static String signUp(String firstName, String lastName ,String phoneNumber , String emailId, String dOB, String gender)
{
String ref = null;


//validating
boolean reference  = validateUserProfile(firstName,lastName ,phoneNumber , emailId, dOB,gender);

if(reference == true){
System.out.println("User signUp successfull");
}
else{
System.out.println("User signUp unsuccessful");
}
return ref;
}

//public static void signIn(){
//}


public static boolean validateUserProfile(String firstName, String lastName ,String phoneNumber , String emailId, String dOB, String gender)
{
boolean userValid = false;
boolean isfirstNameValid = false;
boolean islastNameValid = false;
boolean isphoneNumberValid = false;
boolean isemailIdValid = false;
boolean isdOBValid = false;
boolean isgenderValid = false;

//firstName
if(firstName != null && firstName.length() >= 3){
	isfirstNameValid = true;
}
else{
System.out.println("firstName is invalid...Please provide proper firstName");
}

//lastName
if(lastName != null && lastName.length() >= 1){
	islastNameValid = true; 
}
else{
System.out.println("lastName is invalid...Please provide proper lastName");
}

//phoneNumber
if(phoneNumber != null &&  phoneNumber.length() > 0 && phoneNumber.length() == 10){
	isphoneNumberValid = true;
}
else{
System.out.println("Please provide proper phoneNumber");
}

//emailId
if(emailId != null){
	isemailIdValid = true;
}
else{
System.out.println("EmailId is invalid");
}

//dOB
if(dOB != null){
	isdOBValid = true;
}
else{
System.out.println("Please provide correct dOB");
}

//gender
if(gender != null){
	isgenderValid = true;
}
else{
System.out.println("please provide the right gender");
}

if(isfirstNameValid == true && islastNameValid == true && isphoneNumberValid == true && isemailIdValid == true && isdOBValid == true && isgenderValid == true){
	userValid = true;
}
 return userValid;
}
}