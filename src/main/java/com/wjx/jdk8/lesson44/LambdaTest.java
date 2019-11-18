package com.wjx.jdk8.lesson44;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaTest {

    Runnable r1 = () -> System.out.println(this);

    Runnable r2 = new Runnable() {
        @Override
        public void run() {
            System.out.println(this);
        }
    };

    public static void main(String[] args) {
        LambdaTest lambdaTest = new LambdaTest();

        Thread t1 = new Thread(lambdaTest.r1);
        t1.start();

        System.out.println("------------------");
        Thread t2 = new Thread(lambdaTest.r2);
        t2.start();

        System.out.println("--------------------");
        List<String> list = Arrays.asList("hello", "world", "welcome");
        Stream<String> stream = list.stream();
        System.out.println("1111");
        Stream<String> stream2 = stream.map(item -> item + "_abc");
        System.out.println("2222");
        stream2.forEach(System.out::println);

        System.out.println("---------------------");
        list.stream().forEach(System.out::println);
        System.out.println("-----------------");
        list.forEach(System.out::println);
    }
}
