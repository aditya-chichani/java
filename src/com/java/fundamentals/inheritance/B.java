package com.java.fundamentals.inheritance;

public interface B {
    void fun();

    default void defaultMethod() { // Default method of interface can contain a body
        System.out.println("Inteface B default method");
    }
}
