class ChainRunner {

public static void main(String[] args) {

    // 1
    Chain chain1 = new Chain();
    chain1.chainType = "Necklace";
    chain1.material = "Gold";
    chain1.lengthInInches = 18.5;
    chain1.isGoldPlated = true;
    System.out.println("Chain Type : " + chain1.chainType);
    System.out.println("Material : " + chain1.material);
    System.out.println("Length (inches) : " + chain1.lengthInInches);
    System.out.println("Gold Plated : " + chain1.isGoldPlated);
    System.out.println();

    chain1 = new Chain("Necklace", "Gold", 18.5, true);
    System.out.println("Chain Type : " + chain1.chainType);
    System.out.println("Material : " + chain1.material);
    System.out.println("Length (inches) : " + chain1.lengthInInches);
    System.out.println("Gold Plated : " + chain1.isGoldPlated);
    System.out.println();

    // 2
    Chain chain2 = new Chain();
    chain2.chainType = "Bracelet";
    chain2.material = "Silver";
    chain2.lengthInInches = 8.0;
    chain2.isGoldPlated = false;
    System.out.println("Chain Type : " + chain2.chainType);
    System.out.println("Material : " + chain2.material);
    System.out.println("Length (inches) : " + chain2.lengthInInches);
    System.out.println("Gold Plated : " + chain2.isGoldPlated);
    System.out.println();

    chain2 = new Chain("Bracelet", "Silver", 8.0, false);
    System.out.println("Chain Type : " + chain2.chainType);
    System.out.println("Material : " + chain2.material);
    System.out.println("Length (inches) : " + chain2.lengthInInches);
    System.out.println("Gold Plated : " + chain2.isGoldPlated);
    System.out.println();

    // 3
    Chain chain3 = new Chain();
    chain3.chainType = "Pendant";
    chain3.material = "Platinum";
    chain3.lengthInInches = 20.0;
    chain3.isGoldPlated = false;
    System.out.println("Chain Type : " + chain3.chainType);
    System.out.println("Material : " + chain3.material);
    System.out.println("Length (inches) : " + chain3.lengthInInches);
    System.out.println("Gold Plated : " + chain3.isGoldPlated);
    System.out.println();

    chain3 = new Chain("Pendant", "Platinum", 20.0, false);
    System.out.println("Chain Type : " + chain3.chainType);
    System.out.println("Material : " + chain3.material);
    System.out.println("Length (inches) : " + chain3.lengthInInches);
    System.out.println("Gold Plated : " + chain3.isGoldPlated);
    System.out.println();

    // 4
    Chain chain4 = new Chain();
    chain4.chainType = "Anklet";
    chain4.material = "Steel";
    chain4.lengthInInches = 10.0;
    chain4.isGoldPlated = false;
    System.out.println("Chain Type : " + chain4.chainType);
    System.out.println("Material : " + chain4.material);
    System.out.println("Length (inches) : " + chain4.lengthInInches);
    System.out.println("Gold Plated : " + chain4.isGoldPlated);
    System.out.println();

    chain4 = new Chain("Anklet", "Steel", 10.0, false);
    System.out.println("Chain Type : " + chain4.chainType);
    System.out.println("Material : " + chain4.material);
    System.out.println("Length (inches) : " + chain4.lengthInInches);
    System.out.println("Gold Plated : " + chain4.isGoldPlated);
    System.out.println();

	// 5
    Chain chain5 = new Chain();
    chain5.chainType = "Choker";
    chain5.material = "Copper";
    chain5.lengthInInches = 16.5;
    chain5.isGoldPlated = false;
    System.out.println("Chain Type : " + chain5.chainType);
    System.out.println("Material : " + chain5.material);
    System.out.println("Length (inches) : " + chain5.lengthInInches);
    System.out.println("Gold Plated : " + chain5.isGoldPlated);
    System.out.println();

    chain5 = new Chain("Choker", "Copper", 16.5, false);
    System.out.println("Chain Type : " + chain5.chainType);
    System.out.println("Material : " + chain5.material);
    System.out.println("Length (inches) : " + chain5.lengthInInches);
    System.out.println("Gold Plated : " + chain5.isGoldPlated);
    System.out.println();

    // 6
    Chain chain6 = new Chain();
    chain6.chainType = "Necklace";
    chain6.material = "Titanium";
    chain6.lengthInInches = 21.0;
    chain6.isGoldPlated = false;
    System.out.println("Chain Type : " + chain6.chainType);
    System.out.println("Material : " + chain6.material);
    System.out.println("Length (inches) : " + chain6.lengthInInches);
    System.out.println("Gold Plated : " + chain6.isGoldPlated);
    System.out.println();

    chain6 = new Chain("Necklace", "Titanium", 21.0, false);
    System.out.println("Chain Type : " + chain6.chainType);
    System.out.println("Material : " + chain6.material);
    System.out.println("Length (inches) : " + chain6.lengthInInches);
    System.out.println("Gold Plated : " + chain6.isGoldPlated);
    System.out.println();

    // 7
    Chain chain7 = new Chain();
    chain7.chainType = "Bracelet";
    chain7.material = "Brass";
    chain7.lengthInInches = 7.0;
    chain7.isGoldPlated = true;
    System.out.println("Chain Type : " + chain7.chainType);
    System.out.println("Material : " + chain7.material);
    System.out.println("Length (inches) : " + chain7.lengthInInches);
    System.out.println("Gold Plated : " + chain7.isGoldPlated);
    System.out.println();

    chain7 = new Chain("Bracelet", "Brass", 7.0, true);
    System.out.println("Chain Type : " + chain7.chainType);
    System.out.println("Material : " + chain7.material);
    System.out.println("Length (inches) : " + chain7.lengthInInches);
    System.out.println("Gold Plated : " + chain7.isGoldPlated);
    System.out.println();
    }
}
