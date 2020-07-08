package com.java.fundamentals.block.execution;

public class ExecutionOrderBlocksAndConstructor {
    static int i = 5;

    // Gets executed when ExecutionOrderBlocksAndConstructor class is loaded by JVM - Hence executed before ExecutionOrderBlocksAndConstructor.main() method.
    // Static blocks always gets executed first and only when the class is loaded
    static {
        System.out.println(i);
        System.out.println("Static block called");
        i = 10;
        System.out.println("------------------------");
    }

    int j = 100;

    {
        System.out.println(this.j);
        System.out.println("Initializer block called");
    }

    ExecutionOrderBlocksAndConstructor() {
        System.out.println("Constructor " + this.j);
        System.out.println("Constructor called");
    }

    ExecutionOrderBlocksAndConstructor(int i, int j) {
        ExecutionOrderBlocksAndConstructor.i = i;
        this.j = j;
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        //ExecutionOrderBlocksAndConstructor e1 = new ExecutionOrderBlocksAndConstructor();
        System.out.println("------------------------");
        ExecutionOrderBlocksAndConstructor e2 = new ExecutionOrderBlocksAndConstructor();
        System.out.println("------------------------");
        ExecutionOrderBlocksAndConstructor e3 = new ExecutionOrderBlocksAndConstructor(1000, 242423);
    }

    /*Execution order for a particular class:
     * 1) All static variables are loaded and initialized to their in line declared value if any
     * 2) All static blocks get executed (All static member i.e variables initialization/blocks execution happens only when class is loaded)
     * 3) Initializer block i.e non-static/ instance block will be executed each time a new instance of the class is created.
     * 4) Constructor will be called to actually create the object
     * */
}
