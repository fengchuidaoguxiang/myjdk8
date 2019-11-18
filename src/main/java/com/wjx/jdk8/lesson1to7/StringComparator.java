package com.wjx.jdk8.lesson1to7;

import com.sun.org.apache.bcel.internal.generic.RET;

import java.util.*;

public class StringComparator {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("zhangsan","lisi","wangmazi","zhaoliu");

//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });
//        System.out.println(names);

        //TODO:表达式(expression) ,例如：o2.compareTo(o1)
        //TODO:语句(statement),例如：{ return o2.compareTo(o1); }

        Collections.sort(names,( o1, o2) -> o2.compareTo(o1));

//        Collections.sort(names,Comparator.reverseOrder());

//        names.sort(Comparator.reverseOrder());
        System.out.println(names);
    }
}
