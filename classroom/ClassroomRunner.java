package com.xworkz.objectmethodtask.classroom;

public class ClassroomRunner {
        public static void main(String[] args) {

            ClassroomDto classroom = new ClassroomDto();

            classroom.setClassName("Java Full Stack Development");
            classroom.setStudentCount(25);
            classroom.setTeacherName("Mr. Smith");
            classroom.setSubject("Java Programming");
            classroom.setOnline(true);

            System.out.println(classroom);
        }
    }


