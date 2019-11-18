package com.wjx.jdk8.lesson42;

import java.util.Arrays;
import java.util.List;

public class StreamTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","hello world","welcome", "person", "student");
//        System.out.println(list.getClass());
        list.stream().map(item -> item).forEach(System.out::println);
//        list.parallelStream().forEach(System.out::println);
    }
}
