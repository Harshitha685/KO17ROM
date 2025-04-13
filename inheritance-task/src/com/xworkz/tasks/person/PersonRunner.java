package com.xworkz.tasks.person;

public class PersonRunner {
    public static void main(String[] args) {
        Person person = new Person();
        person.displayDetails();
        person.updateAddress();

        Teacher teacher = new Teacher();
        teacher.displayDetails();
        teacher.updateAddress();

        Person person1 = new Teacher();

        Teacher teacher1 = (Teacher) person1;
        System.out.println(teacher1);
    }
}
