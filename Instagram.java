class Instagram{

public static String userLogIn(String userName , String email ,String password){

String register = null;

if(userName.length() > 4 && email != null && password.length() >= 3)
	register = " Registration Successful";
	return register;
}

public static String userLogIn(long phoneNumber , String password){

String value = null;

if(phoneNumber != 0.0 && password.length() >= 3)
	value = "LogIn Success";
	return value;
}
}
