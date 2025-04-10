package com.xworkz.tasks.university;

public class UniversityRunner {
    public static void main(String[] args) {
        University university = new University();
        university.admitStudent();
        university.conductExams();

        Professor professor = new Professor();
        professor.admitStudent();
        professor.conductExams();
    }
}
