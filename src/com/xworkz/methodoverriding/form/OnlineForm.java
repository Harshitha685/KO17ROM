package com.xworkz.methodoverriding.form;

public class OnlineForm extends Form {

    @Override
    public void open() {
        System.out.println("Opening the online form in browser.");
    }

    @Override
    public void fillDetails() {
        System.out.println("Filling in details using the keyboard.");
    }

    @Override
    public void submit() {
        System.out.println("Submitting the form online.");
    }

    @Override
    public void close() {
        System.out.println("Closing the browser tab.");
    }

    public void autoSave() {
        System.out.println("Auto-saving progress every minute.");
    }
}


