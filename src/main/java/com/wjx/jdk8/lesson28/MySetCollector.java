package com.wjx.jdk8.lesson28;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class  MySetCollector<T> implements Collector<T, Set<T>, Set<T>> {


    @Override
    public Supplier<Set<T>> supplier() {

        System.out.println("supplier invoked!");

        return TreeSet::new;
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("accumulator invoked!");
        return Set<T>::add;
//        return (set, item) -> set.add(item);
    }

    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner invoked!");
        return (set1, set2) -> {
            set1.addAll(set2);
            return set1;
        };
    }

    @Override
    public Function<Set<T>, Set<T>> finisher() {
        System.out.println("finisher invoked!");
//        return t -> t;
//        return Function.identity();
        throw  new UnsupportedOperationException();
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoked!");
//        return Collections.unmodifiableSet(EnumSet.of(Characteristics.IDENTITY_FINISH, Characteristics.UNORDERED));
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED));
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "welcome","hello");
        Set<String> set = list.stream().collect(new MySetCollector<>());
        System.out.println(set);

    }
}
