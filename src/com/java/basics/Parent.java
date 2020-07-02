package com.java.basics;

public class Parent {
    static int staticMember;
    public int publicMember;
    private int privateMember;
    private int privateMemberWithGettersAndSetters;

    Parent() {
        System.out.println("Non parameterized parent constructor called");
    }

    public Parent(int privateMember, int privateMemberWithGettersAndSetters, int publicMember) {
        System.out.println("Parameterized parent constructor called");
        this.privateMember = privateMember;
        this.privateMemberWithGettersAndSetters = privateMemberWithGettersAndSetters;
        this.publicMember = publicMember;
    }

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

    @Override
    public String toString() {
        return "Parent{" +
                "privateMember=" + privateMember +
                ", privateMemberWithGettersAndSetters=" + privateMemberWithGettersAndSetters +
                ", publicMember=" + publicMember +
                '}';
    }
}
