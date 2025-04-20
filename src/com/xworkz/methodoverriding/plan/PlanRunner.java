package com.xworkz.methodoverriding.plan;

public class PlanRunner {

        public static void main(String[] args) {
            Plan generalPlan = new Plan();
            generalPlan.createPlan();
            generalPlan.viewPlan();
            generalPlan.updatePlan();
            generalPlan.cancelPlan();
            System.out.println();

            Plan hp = new HolidayPlan();
            hp.createPlan();
            hp.viewPlan();
            hp.updatePlan();
            hp.cancelPlan();
            System.out.println();

            HolidayPlan holiday = new HolidayPlan();
            holiday.createPlan();
            holiday.viewPlan();
            holiday.updatePlan();
            holiday.cancelPlan();
            holiday.bookHotels();
        }
    }


