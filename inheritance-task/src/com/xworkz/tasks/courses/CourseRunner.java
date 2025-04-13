package com.xworkz.tasks.courses;

public class CourseRunner {
    public static void main(String[] args) {
        Course course = new Course();
        course.displayCourseInfo();
        course.coursePrice();

        OnlineCourse onlineCourse = new OnlineCourse();
        onlineCourse.displayCourseInfo();
        onlineCourse.coursePrice();

        Course course1 = new OnlineCourse();
        OnlineCourse onlineCourse1 = (OnlineCourse) course1;
        System.out.println(onlineCourse1);
    }
}
