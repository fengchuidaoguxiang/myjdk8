package com.wjx.jdk8.lesson12;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
//        Optional<String> optional = Optional.empty();
//        Optional<String> optional = Optional.of("hello");
        Optional<String> optional = Optional.ofNullable("Hello");

//        if(optional.isPresent()){
//            System.out.println(optional.get());
//        }
        //推荐的Optional使用方式
        optional.ifPresent(item -> System.out.println(item));
        System.out.println("----------------------------");
        System.out.println(optional.orElse("world"));
        System.out.println("----------------------------");
        System.out.println(optional.orElseGet(() -> "nihao"));

    }
}
