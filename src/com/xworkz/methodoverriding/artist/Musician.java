package com.xworkz.methodoverriding.artist;

public class Musician extends Artist {

    @Override
    public void artForm() {
        System.out.println("Specializes in the art of music.");
    }

    @Override
    public void perform() {
        System.out.println("Performs live or records songs.");
    }

    @Override
    public void tools() {
        System.out.println("Uses instruments like guitar, piano, or drums.");
    }

    public void genre() {
        System.out.println("Can perform classical, rock, pop, or jazz music.");
    }

    public void compose() {
        System.out.println("Composes original music pieces.");
    }

    public void collaborate() {
        System.out.println("Collaborates with other artists and bands.");
    }
}


