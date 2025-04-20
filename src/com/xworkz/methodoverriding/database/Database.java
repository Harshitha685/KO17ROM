package com.xworkz.methodoverriding.database;

public class Database {
        public void connect() {
            System.out.println("Connecting to a generic database.");
        }

        public void disconnect() {
            System.out.println("Disconnecting from the database.");
        }

        public void executeQuery() {
            System.out.println("Executing a query.");
        }

        public void backupData() {
            System.out.println("Performing data backup.");
        }
    }


