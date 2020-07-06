package com.java.fundamentals.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Parent parentReferenceContainingParentObject = new Parent(); // Can access parent data only
        Child childReferenceContainingChildObject = new Child();   // Has access to both parent and child data. For common methods, child methods will always be called
        Parent parentReferenceContainingChildObject = new Child();  // Parent reference and Child data. This is the used for overriding
        // and storing child object in a more generic Parent class is known as upcasting.

        //  Child childReferenceFailingToDirectlyStoreParentObject = new Parent();
        System.out.println(childReferenceContainingChildObject.publicMember);  // Directly accessing non private member field inherited from parent
        parentReferenceContainingChildObject.parentMethod1(); // Child method overrides parent method
        parentReferenceContainingChildObject.parentMethod2(); // Child directly inheriting parent method

    /* System.out.println(parentReferenceContainingChildObject.getChildMember());
    Compiler error shows that parent Reference cannot access child specific methods/members directly at least
    not without explicitly typecasting(downcasting)!*/

        System.out.println(childReferenceContainingChildObject.getChildMember());

        // Below block shows that which static method is called depends solely on the Reference and not the Object to which the Reference points
        {
            parentReferenceContainingChildObject.staticParentMethod1();
            childReferenceContainingChildObject.staticParentMethod1();
            Parent.staticParentMethod1();
            Child.staticParentMethod1();
        }
        // ONLY METHODS CAN BE OVERRIDDEN
        System.out.println(parentReferenceContainingChildObject.toBeOverridenValue); // Prints parent's value: 1000 although the field is NON STATIC. This is because fields are NOT Overridden.
        // The Child class either simply INHERITS the field or HIDES the field (By defining a field member of the same name in its class)
        System.out.println(parentReferenceContainingChildObject.getToBeOverridenValue());  // Prints child's value: 10
        if (parentReferenceContainingChildObject instanceof Child)
            System.out.println("True");
        System.out.println(parentReferenceContainingChildObject.getClass()); // Returns class of the object not the reference.
    }
}
