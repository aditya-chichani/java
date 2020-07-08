package com.java.fundamentals.inheritance.abstractclass;

public abstract class Shape {
    private int numSides;

    Shape() {

    }

    Shape(int numberOfSides) {
        numSides = numberOfSides;
    }

    public void fun() {
        System.out.println("I am an abstract class with no abstract method");
        this.notFun();
    }

    private void notFun() {
        System.out.println("I am a private");
    }

    abstract void getShape();

//    private abstract void impossible();

}
