package com.wjx.jdk8.lesson14;

public interface MyInterface1 {

    default void myMethod(){
        System.out.println("MyInterface1");
    }
}
