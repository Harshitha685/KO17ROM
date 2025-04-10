package com.xworkz.tasks.experience;

public class ExperienceRunner {
    public static void main(String[] args) {
        Experience experience = new Experience();
        experience.calculateTotalExperience();
        experience.isRelevant();

        JobExperience jobExperience = new JobExperience();
        jobExperience.calculateTotalExperience();
        jobExperience.isRelevant();
    }
}
