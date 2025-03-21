class ClothesRunner{

public static void main(String clo[]){

Clothes type1 = new Clothes();

type1.name = "Levi's 501";
type1.material = "Denim (Cotton)";
type1.durabilityRating = 7;
type1.comfortLevel = 4;
type1.stretchable = false;

System.out.println("name : " +type1.name);
System.out.println("material : " +type1.material);
System.out.println("durabilityRating : " +type1.durabilityRating);
System.out.println("comfortLevel : " +type1.comfortLevel);
System.out.println("stretchable : " +type1.stretchable);
System.out.println("\n");

Clothes type2 = new Clothes();

type2.name = "Nike Dri-FIT";
type2.material = "Polyester";
type2.durabilityRating = 8;
type2.comfortLevel = 7;
type2.stretchable = true;

System.out.println("name : " +type2.name);
System.out.println("material : " +type2.material);
System.out.println("durabilityRating : " +type2.durabilityRating);
System.out.println("comfortLevel : " +type2.comfortLevel);
System.out.println("stretchable : " +type2.stretchable);

}

}