package hometask2;

import java.util.Arrays;
import java.util.List;

public class Person {
    protected int age;
    protected String name;
    protected Subject subject;

    List<Subject> list = Arrays.asList(Subject.values());

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void addSubject(Subject subject) {
        Subject.seeSubject(subject.name());

    }

    public void showSubject() {
        Subject[] values = Subject.values();
        System.out.printf("Student " + name + " studies the following list of subjects: ");
        for (Subject value : values) {
            System.out.printf(value.name() +" , ");

        }
        System.out.println("\n");
    }
}
