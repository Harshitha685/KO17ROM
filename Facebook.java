class Facebook{
public static String register(String firstName){
String message = null;
if (firstName != null){
message = "User registration successful";
}else{
message = "User register unsuccessful";
}

return message;
}
}