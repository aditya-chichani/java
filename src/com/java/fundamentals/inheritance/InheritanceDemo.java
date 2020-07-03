package com.java.fundamentals.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Parent parentReferenceContainingParentObject = new Parent(); // Can access parent data only
        Child childReferenceContainingChildObject = new Child();   // Has access to both parent and child data. For common methods, child methods will always be called
        Parent parentReferenceContainingChildObject = new Child();  // Parent reference and Child data. This is the used for overriding.
        //  Child childReferenceFailingToDirectlyStoreParentObject = new Parent();
        System.out.println(childReferenceContainingChildObject.publicMember);  // Directly accessing non private member field inherited from parent
        parentReferenceContainingChildObject.parentMethod1(); // Child method overrides parent method
        parentReferenceContainingChildObject.parentMethod2(); // Child directly inheriting parent method

        // System.out.println(parentReferenceContainingChildObject.getChildMember()); Compiler error shows that parent Reference cannot access child specific methods/members directly at least not without type casting!

        System.out.println(childReferenceContainingChildObject.getChildMember());

        // Below block shows that which static method is called depends solely on the Reference and not the Object to which the Reference points
        {
            parentReferenceContainingChildObject.staticParentMethod1();
            childReferenceContainingChildObject.staticParentMethod1();
            Parent.staticParentMethod1();
            Child.staticParentMethod1();
        }
    }
}
