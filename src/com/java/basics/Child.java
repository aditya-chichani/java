package com.java.basics;

public class Child extends Parent {

    @Override
    public String toString() {
        return super.toString(); // Accesses privateMember of Parent via the public toStringMethod
    }
}
