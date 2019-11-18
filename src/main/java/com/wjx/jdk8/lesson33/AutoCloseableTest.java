package com.wjx.jdk8.lesson33;

public class AutoCloseableTest implements AutoCloseable{

    public void doSomething(){
        System.out.println("doSomething invoked!");
    }

    @Override
    public void close() throws Exception {
        System.out.println("close invoked!");
    }

    public static void main(String[] args) {
        try(AutoCloseableTest autoCloseableTest = new AutoCloseableTest()){
            autoCloseableTest.doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
