package com.xworkz.objectmethodtask.classroom;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClassroomDto {

    private String className;
    private int studentCount;
    private String teacherName;
    private String subject;
    private boolean isOnline;

    @Override
    public String toString() {
        return "ClassroomDto = (" +
                "className = " + this.className + "," +
                "\nstudentCount = " + this.studentCount + "," +
                "\nteacherName = " + this.teacherName + "," +
                "\nsubject = " + this.subject + "," +
                "\nisOnline = " + this.isOnline + ")";
    }
}


