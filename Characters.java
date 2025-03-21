class Characters{
static char chars[] = {'A','b','!','@','+','/','*','$','p','&'};

public static void main(String kjh[]){
	
System.out.println("Main started:");
System.out.println("Total no of characters are: " + chars.length);
characters();

//System.out.println(chars[0]+" "+chars[1]+" "+chars[2]+" "+chars[3]+" "+chars[4]+" "+chars[5]+" "+chars[6]+" "+chars[7]+" "+chars[8]+" "+chars[9]);
System.out.println("Main ended:");

}
public static void characters(){
	
System.out.println("start of characters:");
for(char character: chars){
	System.out.println(character);
	
System.out.println("end of characters:");
}

char ref1 = chars[2];
System.out.println(ref1);
	


	
} 
}

