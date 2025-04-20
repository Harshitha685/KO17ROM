package com.xworkz.methodoverriding.subscription;

public class SubscriptionRunner {

        public static void main(String[] args) {
            Subscription sub = new Subscription();
            sub.startSubscription();
            sub.cancelSubscription();
            sub.renewSubscription();
            sub.viewDetails();
            System.out.println();

            Subscription ns = new NetflixSubscription();
            ns.startSubscription();
            ns.cancelSubscription();
            ns.renewSubscription();
            ns.viewDetails();
            System.out.println();

            NetflixSubscription netflix = new NetflixSubscription();
            netflix.startSubscription();
            netflix.cancelSubscription();
            netflix.renewSubscription();
            netflix.viewDetails();
            netflix.streamContent();
        }
    }


