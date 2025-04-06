package com.xworkz.boatapp;

import com.xworkz.boatapp.boat.Boat;

public class BoatRunner {
    public static void main(String[] args) {
        System.out.println("Main Started:");

        Boat ref = new Boat();
        //initialization(no external referencing)
        ref.setBoatId(1);
        ref.setBoatName("Baba's boat");
        ref.setBoatOwner("Baba");
        ref.setBoatType("Motor boat");

        //external referencing
        int boatId   = ref.getBoatId();
        String boatName = ref.getBoatName();
        String boatOwner= ref.getBoatOwner();
        String boatType = ref.getBoatType();

        System.out.println("The boat is " +boatId);
        System.out.println("The boat name is:" +boatName);
        System.out.println("The boat owner name is:" +boatOwner);
        System.out.println("The boat type is:" +boatType);

        System.out.println("Main ended");

    }
}
