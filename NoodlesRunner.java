class NoodlesRunner {

public static void main(String nood[]) {

    // 1
    Noodles noodles1 = new Noodles();
    noodles1.brand = "Maggi";
    noodles1.flavor = "Masala";
    noodles1.cookingTimeInMinutes = 2;
    noodles1.isSpicy = false;
    System.out.println("Brand  : " + noodles1.brand);
    System.out.println("Flavor  : " + noodles1.flavor);
    System.out.println("Cooking Time  : " + noodles1.cookingTimeInMinutes + " minutes");
    System.out.println("Spicy : " + noodles1.isSpicy);
    System.out.println();
	
    noodles1 = new Noodles(noodles1.brand, noodles1.flavor, noodles1.cookingTimeInMinutes, noodles1.isSpicy);
	System.out.println("Brand  : " + noodles1.brand);
    System.out.println("Flavor  : " + noodles1.flavor);
    System.out.println("Cooking Time  : " + noodles1.cookingTimeInMinutes + " minutes");
    System.out.println("Spicy : " + noodles1.isSpicy);
    System.out.println();

    // 2
    Noodles noodles2 = new Noodles();
    noodles2.brand = "Yippee";
    noodles2.flavor = "Magic Masala";
    noodles2.cookingTimeInMinutes = 3;
    noodles2.isSpicy = true;
    System.out.println("Brand: " + noodles2.brand);
    System.out.println("Flavor: " + noodles2.flavor);
    System.out.println("Cooking Time  : " + noodles2.cookingTimeInMinutes + " minutes");
    System.out.println("Spicy  : " + noodles2.isSpicy);
    System.out.println();
	
    noodles2 = new Noodles(noodles2.brand, noodles2.flavor, noodles2.cookingTimeInMinutes, noodles2.isSpicy);
	System.out.println("Brand: " + noodles2.brand);
    System.out.println("Flavor: " + noodles2.flavor);
    System.out.println("Cooking Time  : " + noodles2.cookingTimeInMinutes + " minutes");
    System.out.println("Spicy  : " + noodles2.isSpicy);
    System.out.println();

    // 3
    Noodles noodles3 = new Noodles();
    noodles3.brand = "Top Ramen";
    noodles3.flavor = "Chicken";
    noodles3.cookingTimeInMinutes = 4;
    noodles3.isSpicy = true;
    System.out.println("Brand  : " + noodles3.brand);
    System.out.println("Flavor : " + noodles3.flavor);
    System.out.println("Cooking Time  : " + noodles3.cookingTimeInMinutes + " minutes");
    System.out.println("Spicy : " + noodles3.isSpicy);
    System.out.println();
	
    noodles3 = new Noodles(noodles3.brand, noodles3.flavor, noodles3.cookingTimeInMinutes, noodles3.isSpicy);
	System.out.println("Brand  : " + noodles3.brand);
    System.out.println("Flavor : " + noodles3.flavor);
    System.out.println("Cooking Time  : " + noodles3.cookingTimeInMinutes + " minutes");
    System.out.println("Spicy : " + noodles3.isSpicy);
    System.out.println();

    // 4
    Noodles noodles4 = new Noodles();
    noodles4.brand = "Knorr";
    noodles4.flavor = "Sweet Corn";
    noodles4.cookingTimeInMinutes = 3;
    noodles4.isSpicy = false;
    System.out.println("Brand  : " + noodles4.brand);
    System.out.println("Flavor  : " + noodles4.flavor);
    System.out.println("Cooking Time  : " + noodles4.cookingTimeInMinutes + " minutes");
    System.out.println("Spicy : " + noodles4.isSpicy);
    System.out.println();
	
    noodles4 = new Noodles(noodles4.brand, noodles4.flavor, noodles4.cookingTimeInMinutes, noodles4.isSpicy);
	System.out.println("Brand  : " + noodles4.brand);
    System.out.println("Flavor  : " + noodles4.flavor);
    System.out.println("Cooking Time  : " + noodles4.cookingTimeInMinutes + " minutes");
    System.out.println("Spicy : " + noodles4.isSpicy);
    System.out.println();

    // 5
    Noodles noodles5 = new Noodles();
    noodles5.brand = "Chings";
    noodles5.flavor = "Schezwan";
    noodles5.cookingTimeInMinutes = 5;
    noodles5.isSpicy = true;
    System.out.println("Brand : " + noodles5.brand);
    System.out.println("Flavor  : " + noodles5.flavor);
    System.out.println("Cooking Time  : " + noodles5.cookingTimeInMinutes + " minutes");
    System.out.println("Spicy : " + noodles5.isSpicy);
    System.out.println();
	
    noodles5 = new Noodles(noodles5.brand, noodles5.flavor, noodles5.cookingTimeInMinutes, noodles5.isSpicy); System.out.println("Brand : " + noodles5.brand);
    System.out.println("Flavor  : " + noodles5.flavor);
    System.out.println("Cooking Time  : " + noodles5.cookingTimeInMinutes + " minutes");
    System.out.println("Spicy : " + noodles5.isSpicy);
    System.out.println();

    // 6
    Noodles noodles6 = new Noodles();
    noodles6.brand = "Wai Wai";
    noodles6.flavor = "Tom Yum";
    noodles6.cookingTimeInMinutes = 2;
    noodles6.isSpicy = true;
    System.out.println("Brand  : " + noodles6.brand);
    System.out.println("Flavor : " + noodles6.flavor);
    System.out.println("Cooking Time  : " + noodles6.cookingTimeInMinutes + " minutes");
    System.out.println("Spicy  : " + noodles6.isSpicy);
    System.out.println();
	
    noodles6 = new Noodles(noodles6.brand, noodles6.flavor, noodles6.cookingTimeInMinutes, noodles6.isSpicy);
	System.out.println("Brand  : " + noodles6.brand);
    System.out.println("Flavor : " + noodles6.flavor);
    System.out.println("Cooking Time  : " + noodles6.cookingTimeInMinutes + " minutes");
    System.out.println("Spicy  : " + noodles6.isSpicy);
    System.out.println();

    // 7
    Noodles noodles7 = new Noodles();
    noodles7.brand = "Sunfeast";
    noodles7.flavor = "Veggie Delight";
    noodles7.cookingTimeInMinutes = 3;
    noodles7.isSpicy = false;
    System.out.println("Brand : " + noodles7.brand);
    System.out.println("Flavor : " + noodles7.flavor);
    System.out.println("Cooking Time  : " + noodles7.cookingTimeInMinutes + " minutes");
    System.out.println("Spicy : " + noodles7.isSpicy);
    System.out.println();
	
    noodles7 = new Noodles(noodles7.brand, noodles7.flavor, noodles7.cookingTimeInMinutes, noodles7.isSpicy);
	System.out.println("Brand : " + noodles7.brand);
    System.out.println("Flavor : " + noodles7.flavor);
    System.out.println("Cooking Time  : " + noodles7.cookingTimeInMinutes + " minutes");
    System.out.println("Spicy : " + noodles7.isSpicy);
    System.out.println();
    }
}
