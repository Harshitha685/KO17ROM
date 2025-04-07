package com.xworkz.constitutionapp.constitution;

public class Constitution {

        private String country;
        private int totalArticles;
        private int totalAmendments;
        private String adoptedDate;
        private String enforcedDate;
        private boolean isWritten;
        private String longestArticle;

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCountry() {
            return country;
        }

        public void setTotalArticles(int totalArticles) {
            this.totalArticles = totalArticles;
        }

        public int getTotalArticles() {
            return totalArticles;
        }

        public void setTotalAmendments(int totalAmendments) {
            this.totalAmendments = totalAmendments;
        }

        public int getTotalAmendments() {
            return totalAmendments;
        }

        public void setAdoptedDate(String adoptedDate) {
            this.adoptedDate = adoptedDate;
        }

        public String getAdoptedDate() {
            return adoptedDate;
        }

        public void setEnforcedDate(String enforcedDate) {
            this.enforcedDate = enforcedDate;
        }

        public String getEnforcedDate() {
            return enforcedDate;
        }

        public void setIsWritten(boolean isWritten) {
            this.isWritten = isWritten;
        }

        public boolean getIsWritten() {
            return isWritten;
        }

        public void setLongestArticle(String longestArticle) {
            this.longestArticle = longestArticle;
        }

        public String getLongestArticle() {
            return longestArticle;
        }
    }


