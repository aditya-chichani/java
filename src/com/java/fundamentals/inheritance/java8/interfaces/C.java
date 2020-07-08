package com.java.fundamentals.inheritance.java8.interfaces;

public class C implements A, B {

    @Override
    public void fun() { // Although A and B have same method fun, there is no error as they don't have a body.

    }

    @Override
    public void defaultMethod() {  //Has to be overridden compulsorily to solve the Diamond Problem.

    }

    // defaultMethod2() of A need not be implemented compulsorily

}
