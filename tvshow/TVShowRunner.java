package com.xworkz.objectmethodtask.tvshow;

public class TVShowRunner {
        public static void main(String[] args) {

            TVShowDto tvShow = new TVShowDto();

            tvShow.setShowName("Stranger Things");
            tvShow.setGenre("Science Fiction, Horror");
            tvShow.setSeasonsCount(4);
            tvShow.setPremiereDate("2016-07-15");
            tvShow.setOngoing(true);

            System.out.println(tvShow);
        }
    }


