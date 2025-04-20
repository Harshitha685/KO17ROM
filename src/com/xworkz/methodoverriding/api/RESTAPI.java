package com.xworkz.methodoverriding.api;

public class RESTAPI extends API {

    @Override
    public void connect() {
        System.out.println("Establishing HTTP connection to RESTful service...");
    }

    @Override
    public void fetchData() {
        System.out.println("Performing GET request to fetch data.");
    }

    @Override
    public void sendData() {
        System.out.println("Performing POST request to send data.");
    }

    @Override
    public void disconnect() {
        System.out.println("Closing the HTTP connection.");
    }
}


