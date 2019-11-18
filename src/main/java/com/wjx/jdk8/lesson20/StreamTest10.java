package com.wjx.jdk8.lesson20;

import sun.security.util.Length;

import java.util.Arrays;
import java.util.List;

public class StreamTest10 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello2", "world1", "hello world");
//        list.stream().map(item -> item.length()).filter(length -> length == 5).findFirst().ifPresent(System.out::println);
        //短路运算
        list.stream().mapToInt(item -> {
           int length = item.length();
            System.out.println(item);
            return length;
        }).filter(length -> length == 5).findFirst().ifPresent(System.out::println);
    }
}
