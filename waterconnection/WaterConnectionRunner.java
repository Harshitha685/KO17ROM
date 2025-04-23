package com.xworkz.objectmethodtask.waterconnection;

public class WaterConnectionRunner {
        public static void main(String[] args) {

            WaterConnectionDto connection = new WaterConnectionDto();

            connection.setCustomerName("Chandana");
            connection.setConnectionNumber("WC12345");
            connection.setArea("Bangalore");
            connection.setMonthlyUsage(1500.5);
            connection.setPaymentMade(true);

            System.out.println(connection);
        }
    }


