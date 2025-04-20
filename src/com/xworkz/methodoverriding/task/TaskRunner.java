package com.xworkz.methodoverriding.task;

public class TaskRunner {

        public static void main(String[] args) {
            Task task = new Task();
            task.start();
            task.perform();
            task.pause();
            task.complete();
            System.out.println();

            Task ct = new CleaningTask();
            ct.start();
            ct.perform();
            ct.pause();
            ct.complete();
            System.out.println();

            CleaningTask cleaning = new CleaningTask();
            cleaning.start();
            cleaning.perform();
            cleaning.pause();
            cleaning.complete();
            cleaning.checkSupplies();  // Specific to CleaningTask
        }
    }


