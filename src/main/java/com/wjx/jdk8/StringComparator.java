package com.wjx.jdk8;

import com.sun.org.apache.bcel.internal.generic.RET;

import java.util.*;

public class StringComparator {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("zhangsan", "lisi", "wangmazi", "zhaoliu");
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });
//        System.out.println(names);

        // expression (表达式): 例如，o2.compareTo(o1)
        // statement (语句): 例如，{return o2.compareTo(o1);}
        Collections.sort(names,(o1, o2) -> o2.compareTo(o1));

//        Collections.sort(names, Comparator.reverseOrder());

        System.out.println(names);
    }
}
