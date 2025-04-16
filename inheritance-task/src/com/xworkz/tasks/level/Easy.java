package com.xworkz.tasks.level;

public class Easy extends Level{
    public void changeTopic() {
        System.out.println("Topic changed to: ");
    }
    public void markPassed() {
        System.out.println("You passed this level!");
    }


    public void updateHint() {
        System.out.println("Hint updated: " );
    }

    public void addQuestions() {
        System.out.println("Total Questions: ");
    }
    public void increaseDuration() {
        System.out.println("New duration: ");
    }
}


