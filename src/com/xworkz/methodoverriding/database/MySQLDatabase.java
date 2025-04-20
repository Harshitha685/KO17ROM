package com.xworkz.methodoverriding.database;

public class MySQLDatabase extends Database {

    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database.");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from MySQL database.");
    }

    @Override
    public void executeQuery() {
        System.out.println("Executing SQL query on MySQL.");
    }

    @Override
    public void backupData() {
        System.out.println("Backing up MySQL data.");
    }
}


