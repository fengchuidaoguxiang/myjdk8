package com.wjx.jdk8.lesson14;

public interface MyInterface2 {

    default void myMethod(){
        System.out.println("MyInterface2");
    }
}
