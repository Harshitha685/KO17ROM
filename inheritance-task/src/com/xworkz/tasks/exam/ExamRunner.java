package com.xworkz.tasks.exam;

public class ExamRunner {
    public static void main(String[] args) {
        Exam exam = new Exam();
        exam.examStartDate();
        exam.examEndDate();

        MidTerm midTerm = new MidTerm();
        midTerm.examStartDate();
        midTerm.examEndDate();

        Exam exam1 = new MidTerm();

        MidTerm midTerm1 = (MidTerm) exam1;
        System.out.println(midTerm1);
    }
}
