package com.xworkz.tasks.courses;

public class CourseRunner {
    public static void main(String[] args) {
        Course course = new Course();
        course.displayCourseInfo();
        course.coursePrice();
        course.startCourse();
        course.endCourse();
        course.displayCourseInfo();

        Course course2 = new OnlineCourse();
        course2.displayCourseInfo();
        course2.coursePrice();
        course2.startCourse();
        course2.endCourse();
        course2.displayCourseInfo();

        OnlineCourse onlineCourse = new OnlineCourse();
        onlineCourse. attendLiveSession();
        onlineCourse.downloadMaterials();
        onlineCourse.changeLanguage();
        onlineCourse.contactSupport();
        onlineCourse.showPlatform();


        Course course1 = new OnlineCourse();
        OnlineCourse onlineCourse1 = (OnlineCourse) course1;
        System.out.println(onlineCourse1);
    }
}
