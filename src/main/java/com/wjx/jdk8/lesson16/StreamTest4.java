package com.wjx.jdk8.lesson16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest4 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "helloworld");

//        String[] stringArray = stream.toArray( length -> new String[length] );
//        String[] stringArray = stream.toArray(String[]::new);
//
//        Arrays.asList(stringArray).forEach(System.out::println);

//        List<String> list = stream.collect(Collectors.toList());
//        List<String> list = stream.collect(()->new ArrayList(), (theList, item) -> theList.add(item), (theList1, theList2) -> theList1.addAll(theList2));
        List<String> list = stream.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        list.forEach(System.out::println);
    }
}
