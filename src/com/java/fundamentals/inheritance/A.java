package com.java.fundamentals.inheritance;

public interface A {
    void fun();

    default void defaultMethod() { // Default method of interface can contain a body - Introduced in Java 8
        System.out.println("Interface A default method");
    }

    default void defaultMethod2() {
        System.out.println("Interface A default method2");
    }
}
