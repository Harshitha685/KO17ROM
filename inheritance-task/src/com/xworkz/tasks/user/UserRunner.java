package com.xworkz.tasks.user;

public class UserRunner {
    public static void main(String[] args) {
        User user = new User();
        user.userName();
        user.userAge();
        user.userEmail();
        user.userPhone();
        user.userLocation();

        System.out.println("--------------------------");

        User user2 = new Seller();
        user2.userName();
        user2.userAge();
        user2.userEmail();
        user2.userPhone();
        user2.userLocation();

        System.out.println("--------------------------");

        Seller seller = new Seller();
        seller.sellerBusinessName();
        seller.sellerProduct();
        seller.sellerRating();
        seller.sellerExperience();
        seller.sellerIncome();

        System.out.println("--------------------------");

        User user3 = new Seller();
        Seller seller2 = (Seller) user3;
        System.out.println(seller2);
    }
}
