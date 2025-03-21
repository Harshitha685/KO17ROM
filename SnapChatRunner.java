class SnapChatRunner{

public static void main(String snap[]){

String message = SnapChat.logIn("tomm_867","tom05i78");
System.out.println(message);

String ref = SnapChat.logIn(5097575890L,"tom05i78");
System.out.println(ref);
}
}