package com.wjx.jdk8.lesson40;

import java.util.Arrays;
import java.util.List;

public class MyTest {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        integers.stream().map(i -> i * 2).filter( i -> i > 4).forEach(System.out::println);
    }
}
