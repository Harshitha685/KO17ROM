package com.arasu.movieapp.movie;

import com.arasu.movieapp.actor.Actor;

public class Movie {
        public String title;
        public String language;
        public double duration;
        public Actor actors[];

        public void displayMovieInfo() {
            System.out.println("Movie Title: " + title);
            System.out.println("Language: " + language);
            System.out.println("Duration: " + duration + " hrs");
            System.out.println("-- Actors --");
            for (Actor actor : actors) {
                actor.displayActorInfo();
            }
        }
    }


