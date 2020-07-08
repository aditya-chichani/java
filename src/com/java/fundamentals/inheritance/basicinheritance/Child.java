package com.java.fundamentals.inheritance.basicinheritance;

public class Child extends Parent {
    private int childMember;
    int toBeOverridenValue = 10;

    public static void staticParentMethod1() {
        System.out.println("Child hiding parent's staticParentMethod1");
    }

    @Override
    public void parentMethod1() {
        System.out.println("Child overriding parent's parentMethod1");
    }

    @Override
    public String toString() {
        return super.toString(); // Accesses privateMember of Parent via the public toStringMethod
    }

    @Override
    public void protectedMethod() {
        super.protectedMethod();
    }

    public int getChildMember() {
        return childMember;
    }

    public void setChildMember(int childMember) {
        this.childMember = childMember;
    }

    @Override
    public int getToBeOverridenValue() {
        return toBeOverridenValue;
    }

    @Override
    public void setToBeOverridenValue(int toBeOverridenValue) {
        this.toBeOverridenValue = toBeOverridenValue;
    }

}
