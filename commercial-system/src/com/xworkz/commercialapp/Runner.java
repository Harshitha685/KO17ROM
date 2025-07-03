package com.xworkz.commercialapp;

import com.xworkz.commercialapp.commercial.*;

public class Runner {
    public static void main(String[] args) {

        CommercialSpace space = new Xworkz();
        CommercialSpace space1 = new SareeCollections();
        CommercialSpace space2 = new TitanShowroom();
        CommercialSpace space3 = new SuperMarket();
        CommercialSpace space4 = new MedicalShop();
        CommercialSpace space5 = new JewelleryShop();
        CommercialSpace space6 = new Hotel();
        CommercialSpace space7 = new GiftShop();
        CommercialSpace space8 = new ChatsCenter();
        CommercialSpace space9 = new Boutique();


        space.doBusiness();
        space1.doBusiness();
        space2.doBusiness();
        space3.doBusiness();
        space4.doBusiness();
        space5.doBusiness();
        space6.doBusiness();
        space7.doBusiness();
        space8.doBusiness();
        space9.doBusiness();


    }
}
