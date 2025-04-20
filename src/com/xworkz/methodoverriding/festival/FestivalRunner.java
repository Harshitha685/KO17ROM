package com.xworkz.methodoverriding.festival;

public class FestivalRunner {
        public static void main(String[] args) {


            Festival f = new Festival();
            f.name();
            f.season();
            f.tradition();
            f.celebration();
            System.out.println();

            Festival d1 = new DiwaliFestival();
            d1.name();
            d1.season();
            d1.tradition();
            d1.celebration();
            System.out.println();

            DiwaliFestival d2 = new DiwaliFestival();
            d2.name();
            d2.season();
            d2.tradition();
            d2.celebration();
        }
    }


