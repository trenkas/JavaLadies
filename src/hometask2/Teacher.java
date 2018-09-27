package hometask2;

import hometask2.Person;
import hometask2.Subject;

public class Teacher extends Person {

    public Teacher(int age, String name, Subject subject) {
        super(age, name);
        this.subject=subject;
    }

    @Override
    public String toString() {
        return "hometask2.Teacher " + name + " age of " + age +  " teaches the following list of subjects: " + subject ;
    }
}
