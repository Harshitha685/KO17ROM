package com.xworkz.tasks.market;

public class MarketRunner {
    public static void main(String[] args) {

        Market market = new Market();
        market.marketName();
        market.openTime();
        market.closeTime();
        market.numberOfShops();
        market.availableItems();

        System.out.println();


        Market market2 = new SuperMarket();
        market2.marketName();
        market2.openTime();
        market2.closeTime();
        market2.numberOfShops();
        market2.availableItems();

        System.out.println();


        SuperMarket superMarket = new SuperMarket();
        superMarket.billingSystem();
        superMarket.loyaltyPoints();
        superMarket.onlineOrder();
        superMarket.parkingFacility();
        superMarket.numberOfFloors();




        Market market3 = new SuperMarket();
        SuperMarket superMarket1 = (SuperMarket) market3;
        System.out.println(superMarket1);
    }
}
