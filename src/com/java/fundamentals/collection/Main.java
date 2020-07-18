package com.java.fundamentals.collection;

import java.util.LinkedList;
import java.util.List;

public class Main {
    int a;

    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();
        list1.add("Geeks");
        list1.add("for");
        list1.add("Geeks");
        list1.add("GFG");
        list1.add("GeeksforGeeks");

        List<String> list2 = new LinkedList<>();
        list2.add("Geeks");
        list2.add("for");

        list1.removeAll(list2);

        for (String temp : list1)
            System.out.printf(temp + " ");

        System.out.println();
    }

    static void fun() {
        System.out.println(new Main().a);
    }
}
