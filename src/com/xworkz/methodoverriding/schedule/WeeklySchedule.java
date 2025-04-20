package com.xworkz.methodoverriding.schedule;


    public class WeeklySchedule extends Schedule {

        @Override
        public void createSchedule() {
            System.out.println("Creating a schedule for the week.");
        }

        @Override
        public void addTask() {
            System.out.println("Adding task to this week's schedule: ");
        }

        @Override
        public void viewSchedule() {
            System.out.println("Viewing this week's schedule.");
        }

        @Override
        public void removeTask() {
            System.out.println("WeeklySchedule: Removing task from this week's schedule: " );
        }

        public void markCompleted() {
            System.out.println(" Marking task as completed: " );
        }
    }


