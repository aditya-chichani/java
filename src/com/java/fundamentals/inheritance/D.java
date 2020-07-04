package com.java.fundamentals.inheritance;

public class D implements A {
    @Override
    public void fun() {
        System.out.println("fun");
    }

    @Override
    public void defaultMethod() {
        System.out.println("defaultMethod1");
    }

    @Override
    public void defaultMethod2() {
        System.out.println("defaultMethod2");
    }
}
