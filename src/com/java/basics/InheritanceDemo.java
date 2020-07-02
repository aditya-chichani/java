package com.java.basics;

public class InheritanceDemo {
    public static void main(String[] args) {
        Parent parentReferenceContainingParentObject = new Parent();
        Child childReferenceContainingChildObject = new Child();
        Parent parentReferenceContainingChildObject = new Child();
        //  Child childReferenceFailingToDirectlyStoreParentObject = new Parent();
        System.out.println(childReferenceContainingChildObject.publicMember);  // Directly accessing non private member field inherited from parent

    }
}
