class AmazonRunner{

public static void main(String ama[]){

Amazon  ref = new Amazon();

ref.id = 1;
ref.name = "harshitha";
ref.phoneNumber = 4678908028L;
ref.password = "har@123";
	
	System.out.println("The account id is:  " +ref.id);
	System.out.println("The name is: " +ref.name);
	System.out.println("The phoneNumber of the user: " +ref.phoneNumber);
	System.out.println("The password of the user: " +ref.password);
	System.out.println("\n");
	
	
	
      Amazon anotherRef = new Amazon();
	  
	  anotherRef.id = 2;
	  anotherRef.name = "pavithra";
	  anotherRef.phoneNumber = 6787571898L;
	  anotherRef.password = "pav@567";
	  
		System.out.println("The id is : " +anotherRef.id);
		System.out.println("The name is : " +anotherRef.name);
		System.out.println("The phoneNumber is : " +anotherRef.phoneNumber);
		System.out.println("The password is : " +anotherRef.password);



}
}