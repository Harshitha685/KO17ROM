package com.xworkz.methodoverriding.schedule;

public class ScheduleRunner {

        public static void main(String[] args) {
            Schedule generalSchedule = new Schedule();
            generalSchedule.createSchedule();
            generalSchedule.addTask();
            generalSchedule.viewSchedule();
            generalSchedule.removeTask();
            System.out.println();

            Schedule week = new WeeklySchedule();
            week.createSchedule();
            week.addTask();
            week.viewSchedule();
            week.removeTask();
            System.out.println();

            WeeklySchedule weekly = new WeeklySchedule();
            weekly.createSchedule();
            weekly.addTask();
            weekly.viewSchedule();
            weekly.removeTask();
            weekly.markCompleted();
        }
    }


