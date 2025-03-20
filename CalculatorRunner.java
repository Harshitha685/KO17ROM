class CalculatorRunner{

public static void main(String oper[]){
	
System.out.println("Main started:");

int sum = Calculator.add(900, 1415);
System.out.println("The Addition of two numbers is:" +sum);

int difference = Calculator.sub(200,87);
System.out.println("The Subtraction of two numbers is:" +difference);

int multiplication = Calculator.multiplication(5,9);
System.out.println("The multiplication of two numbers is:" +multiplication);

int division = Calculator.division(45,5);
System.out.println("The division of two numbers is:" +division);

int modulus = Calculator.modulus(5,9);
System.out.println("The modulus of two numbers is:" +modulus);

System.out.println("Main ended:");


}
}