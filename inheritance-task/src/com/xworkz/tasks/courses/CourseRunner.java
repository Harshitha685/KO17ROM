package com.xworkz.tasks.courses;

public class CourseRunner {
    public static void main(String[] args) {
        Course course = new Course();
        course.displayCourseInfo();
        course.coursePrice();

        OnlineCourse onlineCourse = new OnlineCourse();
        onlineCourse.displayCourseInfo();
        onlineCourse.coursePrice();
    }
}
