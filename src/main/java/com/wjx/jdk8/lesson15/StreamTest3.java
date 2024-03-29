package com.wjx.jdk8.lesson15;

import java.util.Arrays;
import java.util.List;

public class StreamTest3 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println(list.stream().map(i -> 2 * i).reduce(0, Integer::sum));
    }
}
