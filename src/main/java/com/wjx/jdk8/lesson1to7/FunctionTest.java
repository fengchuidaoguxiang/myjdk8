package com.wjx.jdk8.lesson1to7;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        FunctionTest test = new FunctionTest();

        System.out.println(test.compute(1,value ->{return 2 * value;}));
        System.out.println(test.compute(2, value -> 5 + value));
        System.out.println(test.compute(3, value ->value * value));
        System.out.println(test.convert(5,value -> String.valueOf(value + " hello world")));

        Function<Integer, Integer> function = value -> value * 2;
        System.out.println(function);
        System.out.println(test.compute(3, function));
    }

    public int compute(int a, Function<Integer, Integer> function){
        int result = function.apply(a);

        return result;
    }

    public String convert(int a , Function<Integer,String> function){
        return function.apply(a);
    }
}
