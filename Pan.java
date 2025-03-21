class Pan{

static String brand =	"Amazon Brand - Solimo";
static String material = "Aluminum,Glass";
static String specialFeature = "Induction Stovetop Compati, Includes Lid";
public static void main(String ae[]){

System.out.println("The brand of the Pan is:" +brand);
System.out.println("The material that was used in Pan is:" +material);
System.out.println("The specialFeature of the Pan  is:" +specialFeature);

brand =	"Vinod-Zest";
material = "Glass";
specialFeature = "Induction Stovetop Compati";

updateSpecialFeature();

System.out.println("The brand of the Pan is:" +brand);
System.out.println("The material that was used in Pan is:" +material);
System.out.println("The specialFeature of the Pan  is:" +specialFeature);


}

public static void updateSpecialFeature(){
specialFeature = "Induction Stovetop Compati";
}
}