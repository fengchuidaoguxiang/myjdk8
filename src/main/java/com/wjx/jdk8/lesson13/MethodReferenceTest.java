package com.wjx.jdk8.lesson13;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceTest {

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 10);
        Student student2 = new Student("lisi", 90);
        Student student3 = new Student("wangmazi", 50);
        Student student4 = new Student("zhaoliu", 40);

        List<Student> students = Arrays.asList(student1,student2,student3,student4);

//        students.sort((studentParam1, studentParam2) -> Student.compareStudentByScore(studentParam1,studentParam2));
//        students.forEach(student -> System.out.println(student.getScore()));
//        System.out.println("----------------------------");
//        students.sort(Student::compareStudentByScore);
//        students.forEach(student -> System.out.println(student.getScore()));

//        System.out.println("-------------------------------");
//        students.sort((studentParam1,studentParam2) -> Student.compareStudentByName(studentParam1,studentParam2));
//        students.forEach(student -> System.out.println(student.getName()));

//        System.out.println("---------------------------------");
//        students.sort(Student::compareStudentByName);
//        students.forEach(student -> System.out.println(student.getName()));

//        System.out.println("-------------------------------------");
//        StudentComparator studentComparator = new StudentComparator();
//        students.sort((studentParam1,studentParam2) -> studentComparator.compareStudentByScore(studentParam1,studentParam2));
//        students.forEach(student -> System.out.println(student.getScore()));

        System.out.println("-------------------------------------");
        StudentComparator studentComparator = new StudentComparator();
        students.sort(studentComparator::compareStudentByScore);
        students.forEach(student -> System.out.println(student.getScore()));


    }
}
