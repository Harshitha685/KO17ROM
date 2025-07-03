package com.xworkz.constitutionapp;

import com.xworkz.constitutionapp.constitution.Constitution;

public class ConstitutionRunner {

        public static void main(String[] args) {

            Constitution ref1 = new Constitution();
            ref1.setCountry("India");
            ref1.setTotalArticles(395);
            ref1.setTotalAmendments(105);
            ref1.setAdoptedDate("26 November 1949");
            ref1.setEnforcedDate("26 January 1950");
            ref1.setIsWritten(true);
            ref1.setLongestArticle("Article 368");

            String country1 = ref1.getCountry();
            int articles1 = ref1.getTotalArticles();
            int amendments1 = ref1.getTotalAmendments();
            String adopted1 = ref1.getAdoptedDate();
            String enforced1 = ref1.getEnforcedDate();
            boolean written1 = ref1.getIsWritten();
            String article1 = ref1.getLongestArticle();

            System.out.println("Country Name          : " + country1);
            System.out.println("Total Articles        : " + articles1);
            System.out.println("Total Amendments      : " + amendments1);
            System.out.println("Adopted Date          : " + adopted1);
            System.out.println("Enforced Date         : " + enforced1);
            System.out.println("Is Written Constitution: " + written1);
            System.out.println("Longest Article       : " + article1);
            System.out.println();

            Constitution ref2 = new Constitution();
            ref2.setCountry("USA");
            ref2.setTotalArticles(7);
            ref2.setTotalAmendments(27);
            ref2.setAdoptedDate("17 September 1787");
            ref2.setEnforcedDate("4 March 1789");
            ref2.setIsWritten(true);
            ref2.setLongestArticle("Article I");

            String country2 = ref2.getCountry();
            int articles2 = ref2.getTotalArticles();
            int amendments2 = ref2.getTotalAmendments();
            String adopted2 = ref2.getAdoptedDate();
            String enforced2 = ref2.getEnforcedDate();
            boolean written2 = ref2.getIsWritten();
            String article2 = ref2.getLongestArticle();

            System.out.println("Country Name          : " + country2);
            System.out.println("Total Articles        : " + articles2);
            System.out.println("Total Amendments      : " + amendments2);
            System.out.println("Adopted Date          : " + adopted2);
            System.out.println("Enforced Date         : " + enforced2);
            System.out.println("Is Written Constitution: " + written2);
            System.out.println("Longest Article       : " + article2);
            System.out.println();

            Constitution ref3 = new Constitution();
            ref3.setCountry("France");
            ref3.setTotalArticles(92);
            ref3.setTotalAmendments(24);
            ref3.setAdoptedDate("4 October 1958");
            ref3.setEnforcedDate("5 October 1958");
            ref3.setIsWritten(true);
            ref3.setLongestArticle("Article 34");

            String country3 = ref3.getCountry();
            int articles3 = ref3.getTotalArticles();
            int amendments3 = ref3.getTotalAmendments();
            String adopted3 = ref3.getAdoptedDate();
            String enforced3 = ref3.getEnforcedDate();
            boolean written3 = ref3.getIsWritten();
            String article3 = ref3.getLongestArticle();

            System.out.println("Country Name          : " + country3);
            System.out.println("Total Articles        : " + articles3);
            System.out.println("Total Amendments      : " + amendments3);
            System.out.println("Adopted Date          : " + adopted3);
            System.out.println("Enforced Date         : " + enforced3);
            System.out.println("Is Written Constitution: " + written3);
            System.out.println("Longest Article       : " + article3);
            System.out.println();

            Constitution ref4 = new Constitution();
            ref4.setCountry("Japan");
            ref4.setTotalArticles(103);
            ref4.setTotalAmendments(0);
            ref4.setAdoptedDate("3 November 1946");
            ref4.setEnforcedDate("3 May 1947");
            ref4.setIsWritten(true);
            ref4.setLongestArticle("Article 9");

            String country4 = ref4.getCountry();
            int articles4 = ref4.getTotalArticles();
            int amendments4 = ref4.getTotalAmendments();
            String adopted4 = ref4.getAdoptedDate();
            String enforced4 = ref4.getEnforcedDate();
            boolean written4 = ref4.getIsWritten();
            String article4 = ref4.getLongestArticle();

            System.out.println("Country Name          : " + country4);
            System.out.println("Total Articles        : " + articles4);
            System.out.println("Total Amendments      : " + amendments4);
            System.out.println("Adopted Date          : " + adopted4);
            System.out.println("Enforced Date         : " + enforced4);
            System.out.println("Is Written Constitution: " + written4);
            System.out.println("Longest Article       : " + article4);
            System.out.println();

            Constitution ref5 = new Constitution();
            ref5.setCountry("Germany");
            ref5.setTotalArticles(146);
            ref5.setTotalAmendments(60);
            ref5.setAdoptedDate("23 May 1949");
            ref5.setEnforcedDate("24 May 1949");
            ref5.setIsWritten(true);
            ref5.setLongestArticle("Article 20");

            String country5 = ref5.getCountry();
            int articles5 = ref5.getTotalArticles();
            int amendments5 = ref5.getTotalAmendments();
            String adopted5 = ref5.getAdoptedDate();
            String enforced5 = ref5.getEnforcedDate();
            boolean written5 = ref5.getIsWritten();
            String article5 = ref5.getLongestArticle();

            System.out.println("Country Name          : " + country5);
            System.out.println("Total Articles        : " + articles5);
            System.out.println("Total Amendments      : " + amendments5);
            System.out.println("Adopted Date          : " + adopted5);
            System.out.println("Enforced Date         : " + enforced5);
            System.out.println("Is Written Constitution: " + written5);
            System.out.println("Longest Article       : " + article5);
            System.out.println();
        }
    }


