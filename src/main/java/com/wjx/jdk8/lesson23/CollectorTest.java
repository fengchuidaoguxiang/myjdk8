package com.wjx.jdk8.lesson23;

import com.wjx.jdk8.lesson13.Student;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorTest {

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 80);
        Student student2 = new Student("lisi", 90);
        Student student3 = new Student("wangwu", 100);
        Student student4 = new Student("zhaoliu", 90);
        Student student5 = new Student("zhaoliu", 90);

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5);

        List<Student> students1 = students.stream().collect(Collectors.toList());
        students1.forEach(System.out::println);
        System.out.println("-------------------------------");

        System.out.println("count:" + students.stream().collect(Collectors.counting()));
        System.out.println("count:" + students.stream().count());
        System.out.println("----------------------");

        students.stream().collect(Collectors.minBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);
        students.stream().collect(Collectors.maxBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);
        System.out.println(students.stream().collect(Collectors.averagingInt(Student::getScore)));
        System.out.println(students.stream().collect(Collectors.summingInt(Student::getScore)));
        IntSummaryStatistics intSummaryStatistics = students.stream().collect(Collectors.summarizingInt(Student::getScore));
        System.out.println(intSummaryStatistics);
        System.out.println("--------------------------------");
        System.out.println(students.stream().map(Student::getName).collect(Collectors.joining()));
        System.out.println(students.stream().map(Student::getName).collect(Collectors.joining(", ")));
        System.out.println(students.stream().map(Student::getName).collect(Collectors.joining(", ","<begin> ", " <end>")));
        System.out.println("--------------------------------");
        Map<Integer, Map<String, List<Student>>> map = students.stream().collect(Collectors.groupingBy(Student::getScore, Collectors.groupingBy(Student::getName)));
        System.out.println(map);
        System.out.println("--------------------------------");
        Map<Boolean, List<Student>> map2 = students.stream().collect(Collectors.partitioningBy(student -> student.getScore() > 80));
        System.out.println(map2);
        System.out.println("----------------------------------");
        Map<Boolean, Map<Boolean, List<Student>>> map3 = students.stream().collect(Collectors.partitioningBy(student -> student.getScore() > 80, Collectors.partitioningBy(student -> student.getScore() > 90)));
        System.out.println(map3);
        System.out.println("-----------------------------------");
        Map<Boolean, Long> map4= students.stream().collect(Collectors.partitioningBy(student -> student.getScore() > 80, Collectors.counting()));
        System.out.println(map4);
        System.out.println("-----------------------------------");
//     students.stream().collect(Collectors.groupingBy(Student::getName, Collectors.minBy(Comparator.comparingInt(Student::getScore))));
        Map<String, Student> map5 = students.stream()
                .collect(Collectors.groupingBy(Student::getName, Collectors.collectingAndThen(Collectors.minBy(Comparator.comparingInt(Student::getScore)),
                        Optional::get)));
        System.out.println(map5);


    }
}
