package com.xworkz.objectmethodtask.exhibition;

public class ExhibitionRunner {

        public static void main(String[] args) {

            ExhibitionDto exhibition = new ExhibitionDto();

            exhibition.setExhibitionName("Art & Culture Expo");
            exhibition.setLocation("Paris, France");
            exhibition.setDate("2023-11-20");
            exhibition.setTheme("Modern Art and Sculpture");
            exhibition.setFreeEntry(false);

            System.out.println(exhibition);
        }
    }


