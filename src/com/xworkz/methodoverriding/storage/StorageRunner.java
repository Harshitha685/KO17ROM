package com.xworkz.methodoverriding.storage;

public class StorageRunner {
        public static void main(String[] args) {
            Storage s = new Storage();
            s.saveData();
            s.readData();
            s.deleteData();
            s.updateData();
            System.out.println();

            Storage l = new LocalStorage();
            l.saveData();
            l.readData();
            l.deleteData();
            l.updateData();

            LocalStorage local = new LocalStorage();
            local.saveData();
            local.readData();
            local.deleteData();
            local.updateData();
        }
    }


