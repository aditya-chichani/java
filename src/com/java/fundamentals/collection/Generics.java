package com.java.fundamentals.collection;

public class Generics {
    public static void main(String[] args) {
        String s1 = "X";
        String s2 = "Y";
        int a = 1;
        int b = 2;
        double c = 3;
        double d = 4;
        fun(s1, s2);
        fun(a, b);
        fun(c, d);
    }

    public static <CustomDataType> void fun(CustomDataType s, CustomDataType y) {
        System.out.println(s + " " + y);
    }
}
