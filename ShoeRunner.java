class ShoeRunner{

public static void main(String shoe[]){

Shoe copy = new Shoe();
copy.name = "Nike Air Max";
copy.type = "Running Shoe";
copy.releaseYear = 1987;
copy.cushioningLayers = 3;
copy.tractionRating = 9;

System.out.println("name : " +copy.name);
System.out.println("type : " +copy.type);
System.out.println("releaseYear : " +copy.releaseYear);
System.out.println("cushioningLayers : " +copy.cushioningLayers);
System.out.println("tractionRating : " +copy.tractionRating);

}
}