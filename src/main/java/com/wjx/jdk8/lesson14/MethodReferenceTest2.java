package com.wjx.jdk8.lesson14;


import com.wjx.jdk8.lesson13.MethodReferenceTest;
import com.wjx.jdk8.lesson13.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest2 {

    public String getString(Supplier<String> supplier){
        return supplier.get() + "test";
    }

    public String getString2(String str, Function<String, String> function){
        return function.apply(str);
    }

    public static void main(String[] args) {
        Student2 student1 = new Student2("zhangsan", 10);
        Student2 student2 = new Student2("lisi", 90);
        Student2 student3 = new Student2("wangmazi", 50);
        Student2 student4 = new Student2("zhaoliu", 40);

        List<Student2> students2 = Arrays.asList(student1,student2,student3,student4);
//        students2.sort(Student2::compareByScore);
//        students2.forEach(student -> System.out.println(student.getScore()));

//        students2.sort(Student2::compareByName);
//        students2.forEach(student -> System.out.println(student.getName()));

//        List<String> cities = Arrays.asList("qingdao","chongqing","tianjin","beijing");
////        Collections.sort(cities,(city1,city2) -> city1.compareToIgnoreCase(city2));
////        cities.forEach(System.out::println);
//        Collections.sort(cities,String::compareToIgnoreCase);
//        cities.forEach(System.out::println);

        MethodReferenceTest2 methodReferenceTest2 = new MethodReferenceTest2();
        System.out.println(methodReferenceTest2.getString(String::new));

        System.out.println(methodReferenceTest2.getString2("hello",String::new));


    }
}
