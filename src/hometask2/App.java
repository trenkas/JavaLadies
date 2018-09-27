package hometask2;

import hometask2.Student;
import hometask2.Subject;
import hometask2.Teacher;

public class App {
    public static void main(String[] args){
        Student student1 = new Student(20, "Tanya","10-B");

        student1.addSubject(Subject.HISTORY);
        student1.addSubject(Subject.seeSubject("chemistry"));
        System.out.println(student1);
        student1.showSubject();


        Teacher teacher1 = new Teacher(35, "Galyna", Subject.ALGEBRA);
        System.out.println(teacher1);









    }
}
