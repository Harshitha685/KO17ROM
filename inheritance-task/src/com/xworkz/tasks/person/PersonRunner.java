package com.xworkz.tasks.person;

public class PersonRunner {
    public static void main(String[] args) {
        Person person = new Person();
        person.displayDetails();
        person.updateAddress();

        Teacher teacher = new Teacher();
        teacher.displayDetails();
        teacher.updateAddress();
    }
}
