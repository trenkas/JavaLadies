package hometask2;

import hometask2.Person;

public class Student extends Person {

    private String grade;


    public Student(int age, String name, String grade) {
        super(age, name);
        this.grade=grade;

    }

    @Override
    public String toString() {
        return "Student " + name + " age of " + age + " studies in grade " + grade ;
    }
}
