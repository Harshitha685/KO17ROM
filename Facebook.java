class FaceBook{

public static String registerUser(String email, String password){

String logIn = null;

if(email != null && password.length() >= 5)
	logIn = "LogIn Successful";
	return logIn;
}

public static String registerUser(long phoneNumber , String password){

String logInUser = null;

if( phoneNumber != 0.0 && password.length() >= 5)
	logInUser = "LogIn Successful";
	return logInUser;
}
}