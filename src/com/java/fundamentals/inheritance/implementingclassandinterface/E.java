package com.java.fundamentals.inheritance.implementingclassandinterface;

import com.java.fundamentals.inheritance.java8.interfaces.A;

public class E extends D implements F {
    public static void main(String[] args) {
        A e = new E();   // Class E extends class D which implements interface A.
        // Thus, E also indirectly implements A and therefore can be accessed via A's reference.
        e.fun();

        E ee = new E();
        ee.foo(); // Subclass can implement new interfaces which are not implemented by superclass.
        // Upon implementing new interface, subclass is getting additional functionality but
        //it still provides all the behaviour expected by a superclass object and is therefore in line with the LS principle.
    }

    @Override
    public void foo() {
        System.out.println("Foo");
    }
}
