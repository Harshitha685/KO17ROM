class Passport{
public static String register(String cpvLocation , String dcdrLocation , String givenName , 
String surName , String dob , String email ,String loginId , String pwd , String confirmPwd , 
String hintQues, String hintAns , String captcha){

String gold = null;
boolean mag = validateUserProfile(cpvLocation , dcdrLocation , givenName , surName ,dob , email ,loginId , pwd , 
confirmPwd ,  hintQues,  hintAns ,  captcha);

if(mag == true){
System.out.println("Validation success");
}
else{
System.out.println("Validation unsuccess");
}

return gold;
}

public static boolean validateUserProfile(String cpvLocation , String dcdrLocation , String givenName , 
String surName , String dob , String email ,String loginId , String pwd , String confirmPwd , 
String hintQues, String hintAns , String captcha)
{
boolean validUser = false;
boolean iscpvLocation = false;
boolean isdcdrLocation = false;
boolean isgivenName = false;
boolean issurName = false;
boolean isdob = false;
boolean isemail = false;
boolean isloginId = false;
boolean ispwd = false;
boolean isconfirmPwd = false;
boolean ishintQues = false;
boolean ishintAns = false;
boolean iscaptcha = false;

//cpvLocation
if(cpvLocation !=null  && !cpvLocation.isEmpty() && cpvLocation.length() <= 2 ){
	iscpvLocation = true;
}
else{
System.out.println("Invalid cpvLocation");
}

//dcdrLocation
if(dcdrLocation != null  &&  !dcdrLocation.isEmpty() && dcdrLocation.length() > 4){
	isdcdrLocation = true;
}
else{
System.out.println("please provide valid dcdrLocation");
}

//givenName
if(givenName != null && !givenName.isEmpty() ){
	isgivenName = true;
}
else{
System.out.println("please provide valid givenName");
}

//surName
if(surName != null && !surName.isEmpty()){
	issurName = true;
}
else{
System.out.println("please provide proper surName");
}

//dob
if(dob != null && !dob.isEmpty()){
	isdob = true;
}
else{
System.out.println("Invalid dob");
}

//email
if(email != null && !email.isEmpty()){
	isemail = true;
}
else{
System.out.println("please provide correct emailId");
}

//loginId
if(loginId != null && !loginId.isEmpty() && loginId.length() == email.length()){
	isloginId = true;
}
else{
System.out.println("Invalid loginId");
}

//pwd
if(pwd != null && !pwd.isEmpty() && pwd.length() >= 8){
	ispwd = true;
}
else{
System.out.println("please provide valid pwd");
}

//confirmPwd
if(confirmPwd != null  && !confirmPwd.isEmpty() && confirmPwd.length() == pwd.length() ){
	isconfirmPwd = true;
}
else{
System.out.println("please provide valid password");
}

//hintQues
if(hintQues != null && !hintQues.isEmpty()){
	ishintQues = true;
}
else{
System.out.println("please provide proper hintQues");
}

//hintAns
if(hintAns != null && !hintAns.isEmpty()){
	ishintAns = true;
}
else{
System.out.println("please provide correct hintAns");
}

//captcha
if(captcha != null && !captcha.isEmpty() && captcha.length() >=5){
	iscaptcha = true;
}
else{
System.out.println("Invalid captcha");
}
if(iscpvLocation == true && isdcdrLocation == true && isgivenName == true  && issurName == true && isdob == true && 
isemail == true && isloginId == true && ispwd == true && isconfirmPwd == true && 
ishintQues == true && ishintAns == true && iscaptcha == true ){
validUser = true;
}
return validUser;

}
}