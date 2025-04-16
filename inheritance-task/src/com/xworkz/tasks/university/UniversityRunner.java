package com.xworkz.tasks.university;

public class UniversityRunner {
    public static void main(String[] args) {
        University university = new University();
        university.universityName();
        university.universityLocation();
        university.universityCourses();
        university.universityRank();
        university.universityEstablishmentYear();

        System.out.println("--------------------------");

        University university2 = new Professor();
        university2.universityName();
        university2.universityLocation();
        university2.universityCourses();
        university2.universityRank();
        university2.universityEstablishmentYear();

        System.out.println("--------------------------");

        Professor professor = new Professor();
        professor.professorName();
        professor.professorSubject();
        professor.professorExperience();
        professor.professorQualification();
        professor.professorSalary();

        System.out.println("--------------------------");

        University university3 = new Professor();
        Professor professor2 = (Professor) university3;
        System.out.println(professor2);
    }
}
