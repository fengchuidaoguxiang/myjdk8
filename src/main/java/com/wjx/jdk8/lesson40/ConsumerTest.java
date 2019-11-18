package com.wjx.jdk8.lesson40;

import java.sql.SQLOutput;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ConsumerTest {

    public void test(Consumer<Integer> consumer){
        consumer.accept(100);
    }

    public static void main(String[] args) {
        ConsumerTest consumerTest = new ConsumerTest();
        Consumer<Integer> consumer = i -> System.out.println(i);
        IntConsumer intConsumer = i -> System.out.println(i);

        System.out.println(consumer instanceof Consumer);
        System.out.println(intConsumer instanceof IntConsumer);

        consumerTest.test(consumer); //面向对象方式
//        consumerTest.test((Consumer<Integer>) intConsumer);
        consumerTest.test(consumer::accept); //函数式方式
        consumerTest.test(intConsumer::accept); //函数式方式
    }
}
