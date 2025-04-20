package com.xworkz.methodoverriding.api;

public class APIRunner {
        public static void main(String[] args) {
            API api = new API();
            api.connect();
            api.fetchData();
            api.sendData();
            api.disconnect();
            System.out.println();

            API ap = new RESTAPI();
            ap.connect();
            ap.fetchData();
            ap.sendData();
            ap.disconnect();
            System.out.println();

            RESTAPI rest = new RESTAPI();
            rest.connect();
            rest.fetchData();
            rest.sendData();
            rest.disconnect();
        }
    }


