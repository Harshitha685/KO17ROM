package com.xworkz.tasks.user;

public class UserRunner {
    public static void main(String[] args) {
        User user = new User();
        user.getUserName();
        user.setUserName();

        Seller seller = new Seller();
        seller.setUserName();
        seller.getUserName();

        User user1 = new Seller();

        Seller seller1 = (Seller) user1;
        System.out.println(seller1);
    }
}
