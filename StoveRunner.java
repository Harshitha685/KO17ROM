class StoveRunner {

public static void main(String stove[]) {

    // 1st Stove
    Stove stove1 = new Stove();
    stove1.stoveId = 1;
    stove1.brand = "Prestige";
    stove1.numberOfBurners = 3;
    stove1.isGasStove = true;
    System.out.println("Stove ID  : " + stove1.stoveId);
    System.out.println("Brand  : " + stove1.brand);
    System.out.println("Number of Burners: " + stove1.numberOfBurners);
    System.out.println("Gas Stove  : " + stove1.isGasStove);
    System.out.println();

    stove1 = new Stove(1, "Prestige", 3, true);
    System.out.println("Stove ID : " + stove1.stoveId);
    System.out.println("Brand : " + stove1.brand);
    System.out.println("Number of Burners: " + stove1.numberOfBurners);
    System.out.println("Gas Stove : " + stove1.isGasStove);
    System.out.println();

    // 2nd Stove
    Stove stove2 = new Stove();
    stove2.stoveId = 2;
    stove2.brand = "Butterfly";
    stove2.numberOfBurners = 2;
    stove2.isGasStove = true;
    System.out.println("Stove ID : " + stove2.stoveId);
    System.out.println("Brand : " + stove2.brand);
    System.out.println("Number of Burners: " + stove2.numberOfBurners);
    System.out.println("Gas Stove : " + stove2.isGasStove);
    System.out.println();

    stove2 = new Stove(2, "Butterfly", 2, true);
    System.out.println("Stove ID : " + stove2.stoveId);
    System.out.println("Brand : " + stove2.brand);
    System.out.println("Number of Burners: " + stove2.numberOfBurners);
    System.out.println("Gas Stove : " + stove2.isGasStove);
    System.out.println();

    // 3rd Stove
    Stove stove3 = new Stove();
    stove3.stoveId = 3;
    stove3.brand = "Sunflame";
    stove3.numberOfBurners = 4;
    stove3.isGasStove = true;
    System.out.println("Stove ID   : " + stove3.stoveId);
    System.out.println("Brand  : " + stove3.brand);
    System.out.println("Number of Burners: " + stove3.numberOfBurners);
    System.out.println("Gas Stove : " + stove3.isGasStove);
    System.out.println();

    stove3 = new Stove(3, "Sunflame", 4, true);
    System.out.println("Stove ID: " + stove3.stoveId);
    System.out.println("Brand : " + stove3.brand);
    System.out.println("Number of Burners: " + stove3.numberOfBurners);
    System.out.println("Gas Stove : " + stove3.isGasStove);
    System.out.println();

    // 4th Stove
    Stove stove4 = new Stove();
    stove4.stoveId = 4;
    stove4.brand = "Pigeon";
    stove4.numberOfBurners = 2;
    stove4.isGasStove = true;
    System.out.println("Stove ID : " + stove4.stoveId);
    System.out.println("Brand : " + stove4.brand);
    System.out.println("Number of Burners: " + stove4.numberOfBurners);
    System.out.println("Gas Stove : " + stove4.isGasStove);
    System.out.println();

    stove4 = new Stove(4, "Pigeon", 2, true);
    System.out.println("Stove ID : " + stove4.stoveId);
    System.out.println("Brand : " + stove4.brand);
    System.out.println("Number of Burners: " + stove4.numberOfBurners);
    System.out.println("Gas Stove : " + stove4.isGasStove);
    System.out.println();

    // 5th Stove
    Stove stove5 = new Stove();
    stove5.stoveId = 5;
    stove5.brand = "Bosch";
    stove5.numberOfBurners = 4;
    stove5.isGasStove = false;
    System.out.println("Stove ID : " + stove5.stoveId);
    System.out.println("Brand  : " + stove5.brand);
    System.out.println("Number of Burners: " + stove5.numberOfBurners);
    System.out.println("Gas Stove : " + stove5.isGasStove);
    System.out.println();

    stove5 = new Stove(5, "Bosch", 4, false);
    System.out.println("Stove ID : " + stove5.stoveId);
    System.out.println("Brand  : " + stove5.brand);
    System.out.println("Number of Burners: " + stove5.numberOfBurners);
    System.out.println("Gas Stove  : " + stove5.isGasStove);
    System.out.println();

    // 6th Stove
    Stove stove6 = new Stove();
    stove6.stoveId = 6;
    stove6.brand = "Whirlpool";
    stove6.numberOfBurners = 3;
    stove6.isGasStove = false;
    System.out.println("Stove ID  : " + stove6.stoveId);
    System.out.println("Brand : " + stove6.brand);
    System.out.println("Number of Burners: " + stove6.numberOfBurners);
    System.out.println("Gas Stove : " + stove6.isGasStove);
    System.out.println();

    stove6 = new Stove(6, "Whirlpool", 3, false);
    System.out.println("Stove ID  : " + stove6.stoveId);
    System.out.println("Brand : " + stove6.brand);
    System.out.println("Number of Burners: " + stove6.numberOfBurners);
    System.out.println("Gas Stove : " + stove6.isGasStove);
    System.out.println();

    // 7th Stove
    Stove stove7 = new Stove();
    stove7.stoveId = 7;
    stove7.brand = "LG";
    stove7.numberOfBurners = 5;
    stove7.isGasStove = true;
    System.out.println("Stove ID : " + stove7.stoveId);
    System.out.println("Brand   : " + stove7.brand);
    System.out.println("Number of Burners: " + stove7.numberOfBurners);
    System.out.println("Gas Stove : " + stove7.isGasStove);
    System.out.println();

    stove7 = new Stove(7, "LG", 5, true);
    System.out.println("Stove ID : " + stove7.stoveId);
    System.out.println("Brand  : " + stove7.brand);
    System.out.println("Number of Burners: " + stove7.numberOfBurners);
    System.out.println("Gas Stove : " + stove7.isGasStove);
    System.out.println();
    }
}
