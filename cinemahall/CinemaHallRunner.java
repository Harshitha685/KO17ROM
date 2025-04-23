package com.xworkz.objectmethodtask.cinemahall;

public class CinemaHallRunner {
        public static void main(String[] args) {

            CinemaHallDto hall = new CinemaHallDto();

            hall.setHallName("Galaxy Cinema");
            hall.setLocation("Bangalore");
            hall.setSeatingCapacity(200);
            hall.set3DEnabled(true);
            hall.setAvailableMovies(new String[]{"Avengers", "Batman", "Spider-Man", "Frozen"});

            System.out.println(hall);
        }
    }


