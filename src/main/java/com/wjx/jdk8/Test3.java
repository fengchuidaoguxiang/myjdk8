package com.wjx.jdk8;

import com.google.common.collect.Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {
//        TheInterface il = () -> {};
//        System.out.println(il.getClass().getInterfaces()[0]);
//
//        TheInterface2 i2 = () -> {};
//        System.out.println(i2.getClass().getInterfaces()[0]);
//
//        new Thread(() -> System.out.println("hello world")).start();

        List<String> list = Arrays.asList("hello", "world", "hello world");
//        list.forEach( item -> System.out.println(item.toUpperCase()) );
        List<String> list2 = new ArrayList<>();

       //方式1
//        list.forEach(item -> list2.add(item.toUpperCase()));
//        list2.forEach(item -> System.out.println(item));

        //方式2
        list.stream().map(item -> item.toUpperCase()).forEach(item -> System.out.println(item));
        list.stream().map(String::toUpperCase).forEach(item -> System.out.println(item));


    }
}

@FunctionalInterface
interface TheInterface{

    void myMethod();
}


@FunctionalInterface
interface TheInterface2{

    void myMethod2();
}
