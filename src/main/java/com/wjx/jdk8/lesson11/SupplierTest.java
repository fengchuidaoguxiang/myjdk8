package com.wjx.jdk8.lesson11;

import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "hello World";
        System.out.println(supplier.get());
    }
}
