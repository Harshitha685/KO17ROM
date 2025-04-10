package com.xworkz.tasks.exam;

public class ExamRunner {
    public static void main(String[] args) {
        Exam exam = new Exam();
        exam.examStartDate();
        exam.examEndDate();

        MidTerm midTerm = new MidTerm();
        midTerm.examStartDate();
        midTerm.examEndDate();
    }
}
