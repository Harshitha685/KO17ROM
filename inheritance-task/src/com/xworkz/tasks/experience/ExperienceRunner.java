package com.xworkz.tasks.experience;

public class ExperienceRunner {
    public static void main(String[] args) {
        Experience experience = new Experience();
        experience.calculateTotalExperience();
        experience.isRelevant();

        JobExperience jobExperience = new JobExperience();
        jobExperience.calculateTotalExperience();
        jobExperience.isRelevant();

        Experience experience1 = new JobExperience();

        JobExperience jobExperience1 = (JobExperience) experience1;
        System.out.println(jobExperience1);
    }
}
