package com.wjx.jdk8.lesson10;

import com.sun.media.sound.SoftTuning;
import com.wjx.jdk8.lesson9.PredicateTest;

import java.awt.event.ItemEvent;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        PredicateTest2 predicateTest2 = new PredicateTest2();
        predicateTest2.conditionFilter(list,item -> item % 2 == 0);
        System.out.println("------------------------");
        predicateTest2.conditionFilter(list, item -> item % 2 != 0);
        System.out.println("-------------------------");
        predicateTest2.conditionFilter(list, item -> item > 5);
        System.out.println("-------------------------");
        predicateTest2.conditionFilter(list, item -> item < 3);
        System.out.println("-------------------------");
        predicateTest2.conditionFilter(list,item -> true );
        System.out.println("-------------------------");
        predicateTest2.conditionFilter2(list,item -> item >5, item -> item % 2 == 0);
        System.out.println("-------------------------");
        System.out.println(predicateTest2.isEqual("test").test("test"));
        System.out.println("-------------------------");
        System.out.println(predicateTest2.isEqual2(new Date()).test(new Date()));
    }

    public void conditionFilter(List<Integer> list, Predicate<Integer> predicate ){
        for(Integer integer : list){
            if(predicate.test(integer)){
                System.out.println(integer);
            }
        }
    }

    public void conditionFilter2(List<Integer> list, Predicate<Integer> predicate, Predicate<Integer> predicate2){
        list.forEach(item -> {
            if(predicate.and(predicate2).negate().test(item)){
                System.out.println(item);
            }
        });
    }

    public Predicate<String> isEqual( Object object ){
        return Predicate.isEqual(object);
    }

    public Predicate<Date> isEqual2( Object object ){
        return Predicate.isEqual(object);
    }
}
