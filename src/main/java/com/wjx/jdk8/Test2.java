package com.wjx.jdk8;

import java.util.zip.DeflaterOutputStream;

public class Test2 {

    public void myTest( MyInterface2 myInterface2 ){
        System.out.println(1);
        myInterface2.test();
        System.out.println(2);
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.myTest(()->{
            System.out.println("mytest2");
        });

        System.out.println("--------------------------");

        MyInterface2 myInterface2 = ()->{
            System.out.println("hello");
        };

        System.out.println(myInterface2.getClass());
        System.out.println(myInterface2.getClass().getSuperclass());
        System.out.println(myInterface2.getClass().getInterfaces()[0]);
    }
}

@FunctionalInterface
interface MyInterface2{
    void test();

    String toString();
}
