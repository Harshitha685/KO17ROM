package com.xworkz.methodoverriding.offer;

public class OfferRunner {

        public static void main(String[] args) {
            Offer offer = new Offer();
            offer.createOffer();
            offer.applyOffer();
            offer.viewOfferDetails();
            offer.expireOffer();
            System.out.println();

            Offer lo = new LimitedTimeOffer();
            lo.createOffer();
            lo.applyOffer();
            lo.viewOfferDetails();
            lo.expireOffer();
            System.out.println();

            LimitedTimeOffer lto = new LimitedTimeOffer();
            lto.createOffer();
            lto.applyOffer();
            lto.viewOfferDetails();
            lto.expireOffer();
            lto.countdownTimer();
        }
    }


