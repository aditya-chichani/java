package com.java.fundamentals.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsBasics {
    public static void main(String[] args) {
        // Storing a generics object in a raw reference is insignificant because a raw reference does zero type checking.
        {
            List l1 = new ArrayList<String>();
            l1.add("hi");
            l1.add(new GenericsBasics());
            l1.add(Integer.valueOf(1));
            Object o = l1.get(0);    //As l1 reference does not specify type parameter, raw Object is returned.
        }

        // The ideal way
        {
            List<String> l2 = new ArrayList<>();
            l2.add("hi");
            //l2.add(new Generics()) Compiler does type checking properly and gives error
            String s = l2.get(0);
        }

        // The old way a.k.a Raw Types and storing them in a Generic reference:
        { //Raw Type
            List t = new ArrayList();
            t.add("hi");
            t.add(Integer.valueOf(1));
            // Raw reference assigned to Generic reference
            List<String> l3 = t;  /* Only gives an unchecked assignment warning during compile time.*/
            String s3 = l3.get(0);
         /* We will get a runtime error when we try to execute the below line
         because List t contained an Integer object at index 1. Since t was a raw reference directly assigned to
         our generic reference, compiler couldn't enforce type checking which lead to a runtime error*/

            // String s4 = l3.get(1); Commented to avoid runtime error
        }

        {
            List<String> l4 = new ArrayList();
            /* This will also give an unchecked assignment warning as we have the object is a raw type. But since
             * we have just created an object and directly assigned it to a generic reference, we wont be able to add any
             * non String object via the reference and thus luckily maintain its integrity. However, this is still bad practice.  */
        }

        // Bottom Line : AVOID USING RAW TYPES IN GENERICS.

        {
            print(Integer.valueOf(1), "Hello");
            printIntegerAndDouble(Integer.valueOf(1), Double.valueOf(2));
            printElementsThatExtend_ClassA_And_InterfaceB_And_InterfaceC(new D[]{new D(), new D()});
        }

    }

    // Type Inference - Method parameters are type parameters
    public static <K, V> void print(K k, V v) {
        System.out.println(k);
        System.out.println(v);
    }

    //Bounded Parameter Types
    public static <K extends Integer, V extends Double> void printIntegerAndDouble(K k, V v) {
        System.out.println(k);
        System.out.println(v);
    }

    // Multiple Bounded Types, Only the FIRST Bounded type (Here: A) can be a class or an interface, the others (Here B, C), if any, will be interfaces only.
    public static <K extends A & B & C> void printElementsThatExtend_ClassA_And_InterfaceB_And_InterfaceC(K[] kArray) {
        for (K k : kArray)
            System.out.println(k);
    }

}
