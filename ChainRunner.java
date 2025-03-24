class ChainRunner {

public static void main(String chain[]) {

    // 1
    Chain chain1 = new Chain();
    chain1.chainId = 1;
    chain1.material = "Gold";
    chain1.lengthInInches = 18.5;
    chain1.isGoldPlated = true;
    System.out.println("Chain ID : " + chain1.chainId);
    System.out.println("Material : " + chain1.material);
    System.out.println("Length (inches) : " + chain1.lengthInInches);
    System.out.println("Gold Plated : " + chain1.isGoldPlated);
    System.out.println();
	
	
    chain1 = new Chain(chain1.chainId, chain1.material, chain1.lengthInInches, chain1.isGoldPlated);
    System.out.println("Chain ID : " + chain1.chainId);
    System.out.println("Material  : " + chain1.material);
    System.out.println("Length (inches) : " + chain1.lengthInInches);
    System.out.println("Gold Plated : " + chain1.isGoldPlated);
    System.out.println();

    // 2
    Chain chain2 = new Chain();
    chain2.chainId = 2;
    chain2.material = "Silver";
    chain2.lengthInInches = 20.0;
    chain2.isGoldPlated = false;
    System.out.println("Chain ID : " + chain2.chainId);
    System.out.println("Material : " + chain2.material);
    System.out.println("Length (inches) : " + chain2.lengthInInches);
    System.out.println("Gold Plated : " + chain2.isGoldPlated);
    System.out.println();
    chain2 = new Chain(chain2.chainId, chain2.material, chain2.lengthInInches, chain2.isGoldPlated);
    System.out.println("Chain ID : " + chain2.chainId);
    System.out.println("Material : " + chain2.material);
    System.out.println("Length (inches) : " + chain2.lengthInInches);
    System.out.println("Gold Plated : " + chain2.isGoldPlated);
    System.out.println();

    // 3
    Chain chain3 = new Chain();
    chain3.chainId = 3;
    chain3.material = "Platinum";
    chain3.lengthInInches = 22.0;
    chain3.isGoldPlated = false;
    System.out.println("Chain ID : " + chain3.chainId);
    System.out.println("Material : " + chain3.material);
    System.out.println("Length (inches) : " + chain3.lengthInInches);
    System.out.println("Gold Plated : " + chain3.isGoldPlated);
    System.out.println();
    chain3 = new Chain(chain3.chainId, chain3.material, chain3.lengthInInches, chain3.isGoldPlated);
    System.out.println("Chain ID : " + chain3.chainId);
    System.out.println("Material : " + chain3.material);
    System.out.println("Length (inches) : " + chain3.lengthInInches);
    System.out.println("Gold Plated : " + chain3.isGoldPlated);
    System.out.println();

    // 4
    Chain chain4 = new Chain();
    chain4.chainId = 4;
    chain4.material = "Steel";
    chain4.lengthInInches = 19.0;
    chain4.isGoldPlated = false;
    System.out.println("Chain ID : " + chain4.chainId);
    System.out.println("Material : " + chain4.material);
    System.out.println("Length (inches) : " + chain4.lengthInInches);
    System.out.println("Gold Plated : " + chain4.isGoldPlated);
    System.out.println();
    chain4 = new Chain(chain4.chainId, chain4.material, chain4.lengthInInches, chain4.isGoldPlated);
    System.out.println("Chain ID : " + chain4.chainId);
    System.out.println("Material : " + chain4.material);
    System.out.println("Length (inches) : " + chain4.lengthInInches);
    System.out.println("Gold Plated : " + chain4.isGoldPlated);
    System.out.println();

    // 5
    Chain chain5 = new Chain();
    chain5.chainId = 5;
    chain5.material = "Copper";
    chain5.lengthInInches = 16.5;
    chain5.isGoldPlated = false;
    System.out.println("Chain ID : " + chain5.chainId);
    System.out.println("Material : " + chain5.material);
    System.out.println("Length (inches) : " + chain5.lengthInInches);
    System.out.println("Gold Plated : " + chain5.isGoldPlated);
    System.out.println();
    chain5 = new Chain(chain5.chainId, chain5.material, chain5.lengthInInches, chain5.isGoldPlated);
    System.out.println("Chain ID  : " + chain5.chainId);
    System.out.println("Material : " + chain5.material);
    System.out.println("Length (inches) : " + chain5.lengthInInches);
    System.out.println("Gold Plated : " + chain5.isGoldPlated);
    System.out.println();

    // 6
    Chain chain6 = new Chain();
    chain6.chainId = 6;
    chain6.material = "Titanium";
    chain6.lengthInInches = 21.0;
    chain6.isGoldPlated = false;
    System.out.println("Chain ID  : " + chain6.chainId);
    System.out.println("Material : " + chain6.material);
    System.out.println("Length (inches) : " + chain6.lengthInInches);
    System.out.println("Gold Plated : " + chain6.isGoldPlated);
    System.out.println();
    chain6 = new Chain(chain6.chainId, chain6.material, chain6.lengthInInches, chain6.isGoldPlated);
    System.out.println("Chain ID : " + chain6.chainId);
    System.out.println("Material : " + chain6.material);
    System.out.println("Length (inches) : " + chain6.lengthInInches);
    System.out.println("Gold Plated : " + chain6.isGoldPlated);
    System.out.println();

    // 7
    Chain chain7 = new Chain();
    chain7.chainId = 7;
    chain7.material = "Brass";
    chain7.lengthInInches = 17.0;
    chain7.isGoldPlated = true;
    System.out.println("Chain ID : " + chain7.chainId);
    System.out.println("Material : " + chain7.material);
    System.out.println("Length (inches) : " + chain7.lengthInInches);
    System.out.println("Gold Plated : " + chain7.isGoldPlated);
    System.out.println();
    chain7 = new Chain(chain7.chainId, chain7.material, chain7.lengthInInches, chain7.isGoldPlated);
    System.out.println("Chain ID : " + chain7.chainId);
    System.out.println("Material : " + chain7.material);
    System.out.println("Length (inches) : " + chain7.lengthInInches);
    System.out.println("Gold Plated : " + chain7.isGoldPlated);
    System.out.println();
    }
}
