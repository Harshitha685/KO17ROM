package com.xworkz.tasks.person;

public class PersonRunner {
    public static void main(String[] args) {
        Person person = new Person();
        person.name();
        person.age();
        person.gender();
        person.address();
        person.occupation();

        System.out.println("--------------------------");

        Person person2 = new Teacher();
        person2.name();
        person2.age();
        person2.gender();
        person2.address();
        person2.occupation();

        System.out.println("--------------------------");

        Teacher teacher = new Teacher();
        teacher.subject();
        teacher.experience();
        teacher.schoolName();
        teacher.isHeadOfDepartment();
        teacher.degree();

        System.out.println("--------------------------");

        Person person3 = new Teacher();
        Teacher teacher2 = (Teacher) person3;
        System.out.println(teacher2);
    }
}
