package com.arasu.movieapp;

import com.arasu.movieapp.actor.Actor;
import com.arasu.movieapp.movie.Movie;

    public class MovieRunner {
        public static void main(String[] args) {
            System.out.println("Main started");

            // Create actors
            Actor a1 = new Actor();
            a1.name = "Yash";
            a1.age = 37;
            a1.role = "Rocky";

            Actor a2 = new Actor();
            a2.name = "Srinidhi";
            a2.age = 30;
            a2.role = "Reena";

            Actor cast[] = {a1, a2};

            // Create movie
            Movie movie = new Movie();
            movie.title = "KGF";
            movie.language = "Kannada";
            movie.duration = 2.5;
            movie.actors = cast;

            // Display movie info
            movie.displayMovieInfo();

            System.out.println("Main ended");
        }
    }


