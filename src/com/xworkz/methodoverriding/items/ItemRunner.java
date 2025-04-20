package com.xworkz.methodoverriding.items;

public class ItemRunner {
        public static void main(String[] args) {


            Item item = new Item();
            item.name();
            item.price();
            item.type();
            item.packaging();
            System.out.println();

            Item gift1 = new GiftItem();
            gift1.name();
            gift1.price();
            gift1.type();
            gift1.packaging();
            System.out.println();

            GiftItem gift2 = new GiftItem();
            gift2.name();
            gift2.price();
            gift2.type();
            gift2.packaging();
        }
    }


