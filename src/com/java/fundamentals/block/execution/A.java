package com.java.fundamentals.block.execution;

public class A {
    public static void main(String[] args) {
        System.out.println("Class A");
        ExecutionOrderBlocksAndConstructor e = new ExecutionOrderBlocksAndConstructor();
    }
}

/*Execution Order
 * Here we are calling A.main(). JVM will first execute initialization of static members of A class.
 * Since there are none,
 *
 *
 *
 * */
