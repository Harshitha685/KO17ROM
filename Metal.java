class Metal {

    // Instance variables
    int metalId;
    String metalName;
    String use;
    boolean isMalleable;
    boolean isCorrosive;
    String conductivityType;
    String metalColor;
    char lustrousCharacter;
    double marketPrice;

    // 1. No-args constructor
    Metal() {
        this(1);  
        System.out.println(" no-arg constructor is executed");
    }

    // 2. 
    Metal(int metalId) {
        this("Silver", "Ornamental");  
		System.out.println("Constructor with int type")
        this.metalId = metalId;
    }

    // 3. Constructor with metalName and use
    Metal(String metalName, String use) {
        this(false, "Medium");  
		System.out.println("Constructor with string,string type")
        this.metalName = metalName;
        this.use = use;
    }

    // 4. Constructor with isMalleable and conductivityType
    Metal(boolean isMalleable, String conductivityType) {
        this("White", false);  
		System.out.println("Constructor with boolean,String type")
        this.isMalleable = isMalleable;
        this.conductivityType = conductivityType;
    }

    // 5. Constructor with metalColor and isCorrosive
    Metal(String metalColor, boolean isCorrosive) {
        this('N');  
		System.out.println("Constructor with String,boolean type")
        this.metalColor = metalColor;
        this.isCorrosive = isCorrosive;
    }

    // 6. 
    Metal(char lustrousCharacter) {
        this(10000.00);  
		System.out.println("Constructor with char type")
        this.lustrousCharacter = lustrousCharacter;
    }

    // 7. 
    Metal(double marketPrice) {
        this.marketPrice = marketPrice;
		System.out.println("Constructor with double type")
    }

    // 
    public void displayInfo() {
        System.out.println("\n--- Metal Details ---");
        System.out.println("Metal ID       : " + metalId);
        System.out.println("Metal Name     : " + metalName);
        System.out.println("Use            : " + use);
        System.out.println("Is Malleable   : " + isMalleable);
        System.out.println("Is Corrosive   : " + isCorrosive);
        System.out.println("Conductivity   : " + conductivityType);
        System.out.println("Metal Color    : " + metalColor);
        System.out.println("Is Lustrous?   : " + lustrousCharacter);
        System.out.println("Market Price   : ₹" + marketPrice);
    }

}