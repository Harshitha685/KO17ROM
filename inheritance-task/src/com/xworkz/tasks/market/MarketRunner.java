package com.xworkz.tasks.market;

public class MarketRunner {
    public static void main(String[] args) {
        Market market = new Market();
        market.marketName();
        market.location();

        SuperMarket superMarket = new SuperMarket();
        superMarket.marketName();
        superMarket.location();
    }
}
