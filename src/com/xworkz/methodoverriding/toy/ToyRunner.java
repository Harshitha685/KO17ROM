package com.xworkz.methodoverriding.toy;

public class ToyRunner {
        public static void main(String[] args) {
            Toy toy = new Toy();
            toy.play();
            toy.display();
            toy.clean();
            toy.store();
            System.out.println();

            Toy st = new SoftToy();
            st.play();
            st.display();
            st.clean();
            st.store();
            System.out.println();

            SoftToy softToy = new SoftToy();
            softToy.play();
            softToy.display();
            softToy.clean();
            softToy.store();
        }
    }


