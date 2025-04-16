package com.xworkz.tasks.experience;

public class ExperienceRunner {
    public static void main(String[] args) {
        Experience experience = new Experience();
        experience.calculateTotalExperience();
        experience.isRelevant();
        experience.listExperiences();
        experience.addExperience();
        experience.removeExperience();

        Experience experience2 = new JobExperience();
        experience2.calculateTotalExperience();
        experience2.isRelevant();
        experience2.listExperiences();
        experience2.addExperience();
        experience2.removeExperience();

        JobExperience jobExperience = new JobExperience();
        jobExperience.addSkills();
        jobExperience.promoteEmployee();
        jobExperience.transferEmployee();
        jobExperience.getJobDuration();
        jobExperience.checkJobStatus();

        Experience experience1 = new JobExperience();

        JobExperience jobExperience1 = (JobExperience) experience1;
        System.out.println(jobExperience1);
    }
}
