package com.wjx.jdk8.lesson1to7;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

//        for (int i = 0; i <list.size() ; i++) {
//            System.out.println(i);
//        }
//        System.out.println("--------------------");
//        for(Integer i : list){
//            System.out.println(i);
//        }
//        System.out.println("--------------------");

        //新遍历方式 1 (lamada表达式)
        list.forEach((Integer i) -> System.out.println(i * 2));

        System.out.println("------------------");

        //新遍历方式 2 （方法引用）
        list.forEach(System.out::println);


    }
}
