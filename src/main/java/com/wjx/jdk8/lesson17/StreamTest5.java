package com.wjx.jdk8.lesson17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest5 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "helloworld", "test");
        List <String> result = list.stream().map( String::toUpperCase ).collect(Collectors.toList());
        result.forEach(System.out::println);
        System.out.println("---------------------------------");

        List<Integer> list2 = Arrays.asList(1,2,3,4,5);
        List<Integer> result2 = list2.stream().map(temp -> temp * temp).collect(Collectors.toList());
        result2.forEach(System.out::println);
        System.out.println("-----------------------------------");

        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1), Arrays.asList(2,3), Arrays.asList(4,5,6));
        stream.flatMap( theList -> theList.stream()).map(item -> item * item).forEach(System.out::println);
    }
}
