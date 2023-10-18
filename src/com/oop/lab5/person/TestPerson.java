package com.oop.lab5.person;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("john doe", "12th abc st.");
        System.out.println(person1);

        Student student1 = new Student("Long", "Hanoi", "CIS", 4, 1500);
        System.out.println(student1);

        Staff staff1 = new Staff("jane doe", "HN", "HUS", 2000);
        System.out.println(staff1);

        // test setters and getters
        student1.setAddress("HCM");
        student1.setFee(1000);
        System.out.println(student1);

        staff1.setAddress("Hanoi");
        staff1.setSchool("VNU");
        staff1.setPay(3500);
        System.out.println(staff1);
    }
}
