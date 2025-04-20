package com.xworkz.methodoverriding.toy;

public class SoftToy extends Toy {

    @Override
    public void play() {
        System.out.println("Hugging and playing with the soft toy.");
    }

    @Override
    public void display() {
        System.out.println("Keeping the soft toy on the shelf.");
    }

    @Override
    public void clean() {
        System.out.println("Washing the soft toy gently.");
    }

    @Override
    public void store() {
        System.out.println("Placing the soft toy in the toy box.");
    }
}


