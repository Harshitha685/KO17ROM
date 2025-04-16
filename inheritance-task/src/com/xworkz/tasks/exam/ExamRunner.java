package com.xworkz.tasks.exam;

public class ExamRunner {
    public static void main(String[] args) {
        Exam exam = new Exam();
        exam.examStartDate();
        exam.examEndDate();
        exam.prepareExam();
        exam.registerStudents();
        exam.conductExam();

        Exam exam2 = new MidTerm();
        exam2.examStartDate();
        exam2.examEndDate();
        exam2.prepareExam();
        exam2.registerStudents();
        exam2.conductExam();

        MidTerm midTerm = new MidTerm();
        midTerm.gradeExam();
        midTerm.announceResults();
        midTerm.giveFeedback();
        midTerm.examMonth();
        midTerm.materials();

        Exam exam1 = new MidTerm();

        MidTerm midTerm1 = (MidTerm) exam1;
        System.out.println(midTerm1);
    }
}
