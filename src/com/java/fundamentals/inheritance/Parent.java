package com.java.fundamentals.inheritance;

public class Parent {
    static int staticMember = 1;
    public int publicMember = 2;
    private int privateMember = 3;
    private int privateMemberWithGettersAndSetters = 4;

    Parent() {
        System.out.println("Non parameterized parent constructor called");
    }/*Gets called automatically when object of Child class is created.
     However, although the parent constructor is also called, only one Object i.e.,
     the Child object is created.
     */

    public Parent(int privateMember, int privateMemberWithGettersAndSetters, int publicMember) {
        System.out.println("Parameterized parent constructor called");
        this.privateMember = privateMember;
        this.privateMemberWithGettersAndSetters = privateMemberWithGettersAndSetters;
        this.publicMember = publicMember;
    } // Child class,if required,can explicitly call such parameterized constructors using super(....);

    public static int getStaticMember() {
        return staticMember;
    }

    public static void setStaticMember(int staticMember) {
        Parent.staticMember = staticMember;
    }

    public static void staticParentMethod1() {
        System.out.println("Static parent method1 called");
    }

    public static void staticParentMethod2() {
        System.out.println("Static parent method2 called");
    }

    public int getPrivateMemberWithGettersAndSetters() {
        return privateMemberWithGettersAndSetters;
    }

    public void setPrivateMemberWithGettersAndSetters(int privateMemberWithGettersAndSetters) {
        this.privateMemberWithGettersAndSetters = privateMemberWithGettersAndSetters;
    }

    public int getPublicMember() {
        return publicMember;
    }

    public void setPublicMember(int publicMember) {
        this.publicMember = publicMember;
    }

    public void parentMethod1() {
        System.out.println("Non static parent method1 called");
    }

    public void parentMethod2() {
        System.out.println("Non static parent method2 called");
    }

    private void privateMethod() {
        System.out.println("Parent's privateMethod called");
    }

    protected void protectedMethod() {
        System.out.println("Parent's protected method");
    }

    @Override
    public String toString() {
        return "Parent{" +
                "privateMember=" + privateMember +
                ", privateMemberWithGettersAndSetters=" + privateMemberWithGettersAndSetters +
                ", publicMember=" + publicMember +
                '}';
    }
}
