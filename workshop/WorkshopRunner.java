package com.xworkz.objectmethodtask.workshop;

public class WorkshopRunner {
        public static void main(String[] args) {

            WorkshopDto workshop = new WorkshopDto();

            workshop.setWorkshopName("Java Programming Basics");
            workshop.setInstructorName("John Doe");
            workshop.setDurationInDays(5);
            workshop.setTopicCovered("Core Java, OOPs Concepts, Java Collections");
            workshop.setOnline(true);

            System.out.println(workshop);
        }
    }


