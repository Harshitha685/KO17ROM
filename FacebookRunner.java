class FaceBookRunner{

public static void main(String face[]){

String message = FaceBook.registerUser("ramm456@gmail.com","rammui5678");
System.out.println(message);

String ref = FaceBook.registerUser(5618725790L,"rammui5678");
System.out.println(ref);
}
}