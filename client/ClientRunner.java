package com.xworkz.objectmethodtask.client;

public class ClientRunner {

        public static void main(String[] args) {

            ClientDto client = new ClientDto();

            client.setClientName("Harshitha");
            client.setClientID("CL12345");
            client.setContactNumber("9876543210");
            client.setEmail("harshitha@example.com");
            client.setAddress("Bangalore, India");

            System.out.println(client);
        }
    }


