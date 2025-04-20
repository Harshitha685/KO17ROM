package com.xworkz.methodoverriding.database;

public class DatabaseRunner {
        public static void main(String[] args) {
            Database db = new Database();
            db.connect();
            db.executeQuery();
            db.backupData();
            db.disconnect();
            System.out.println();

            Database database = new MySQLDatabase();
            database.connect();
            database.executeQuery();
            database.backupData();
            database.disconnect();
            System.out.println();

            MySQLDatabase mysql = new MySQLDatabase();
            mysql.connect();
            mysql.executeQuery();
            mysql.backupData();
            mysql.disconnect();
        }
    }


