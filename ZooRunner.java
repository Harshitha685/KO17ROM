class ZooRunner{

public static void main(String zoo[]){

Zoo ref1 = new Zoo();

ref1.name = "Mysore Zoo";
ref1.location = "Mysore,Karnataka";
ref1.establishedYear = 1892;
ref1.animals = 1450;
ref1.species = 168;

System.out.println("name : " +ref1.name);
System.out.println("location : " +ref1.location);
System.out.println("establishedYear : " +ref1.establishedYear);
System.out.println("animals : " +ref1.animals);
System.out.println("species : " +ref1.species);
System.out.println("\n");

Zoo ref2 = new Zoo();

ref2.name = "Bannerghatta Biological Park";
ref2.location = "Bengaluru,Karnataka";
ref2.establishedYear = 1970;
ref2.animals = 2388 ;
ref2.species = 137;

System.out.println("name : " +ref2.name);
System.out.println("location : " +ref2.location);
System.out.println("establishedYear : " +ref2.establishedYear);
System.out.println("animals : " +ref2.animals);
System.out.println("species : " +ref2.species);
System.out.println("\n");

}
}