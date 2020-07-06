package com.java.fundamentals.block;

public class B extends ExecutionOrderBlocksAndConstructor {
    static {
        System.out.println("B static block called");
    }

    public static void main(String[] args) {
        System.out.println("B main called");
    }
}

/*Execution order
 * E static block called
 * B static block called - To completely load class B, its parent class has to be loaded first and hence parent's static block gets executed first
 * B main called - B static blocks will be executed before B.main as expected
 * * */

/* Execution order for parent and child when a child object is created
"Parent static block"
"Child static block"
"Parent initialisation block"
"Parent Constructor"
"Child initialisation block"
"Child Constructor"
 */


