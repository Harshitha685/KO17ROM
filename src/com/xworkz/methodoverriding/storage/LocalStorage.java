package com.xworkz.methodoverriding.storage;

public class LocalStorage extends Storage {

    @Override
    public void saveData() {
        System.out.println("Saving data to local disk.");
    }

    @Override
    public void readData() {
        System.out.println("Reading data from local disk.");
    }

    @Override
    public void deleteData() {
        System.out.println("Deleting data from local storage.");
    }

    @Override
    public void updateData() {
        System.out.println("Updating data in local files.");
    }
}


