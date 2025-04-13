package com.xworkz.tasks.university;

public class UniversityRunner {
    public static void main(String[] args) {
        University university = new University();
        university.admitStudent();
        university.conductExams();

        Professor professor = new Professor();
        professor.admitStudent();
        professor.conductExams();

        University university1 = new Professor();

        Professor professor1 = (Professor) university1;
        System.out.println(professor1);
    }
}
