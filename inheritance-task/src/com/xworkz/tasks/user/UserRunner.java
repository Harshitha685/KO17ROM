package com.xworkz.tasks.user;

public class UserRunner {
    public static void main(String[] args) {
        User user = new User();
        user.getUserName();
        user.setUserName();

        Seller seller = new Seller();
        seller.setUserName();
        seller.getUserName();
    }
}
