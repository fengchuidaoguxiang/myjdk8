package com.wjx.jdk8.lesson17;

import java.util.UUID;
import java.util.stream.Stream;

public class StreamTest6 {

    public static void main(String[] args) {
//        Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
        Stream<String> stream = Stream.empty();
//        System.out.println(stream.findFirst().get());
        stream.findFirst().ifPresent(System.out::println);

        System.out.println("-----------------------");
        Stream.iterate(1, item -> item + 2).limit(6).forEach(System.out::println);
    }
}
