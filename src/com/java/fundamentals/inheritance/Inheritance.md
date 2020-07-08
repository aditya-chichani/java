## Inheritance
#### Usage of final keyword in inheritance:
1. If a primitive field is made final, its value cannot be changed.
2. If an object reference is made final, the address to which it points cannot be changed i.e., It cannot be made to store another object.
3. If a method in a class is made final, its subclasses cannot override the method.
4. Constructors are anyway not inherited by the subclasses, hence as there is no need for final keyword - we cannot make constructors final.
5. If a class is made final, it cannot have a subclass. Its methods are **implicitly** declared as final.  

#### Abstract class vs Interface
##### Similarities:
There are only two similarities between an abstract class and an interface:
1. Neither can be instantiated.
2. Both can have methods without a body.
##### Differences:
1. An abstract class is much closer to a normal class than it is to an interface. 
The only mandatory difference between a normal class and an abstract class is that an object of the abstract class cannot be created.
2. Abstract class can continue to have non-parameterized/parameterized constructors, non-final non-static variables,non-public final methods etc which it deems can be reused among its concrete classes, and hence, can have a **state**.
3. An interface, on the other hand, acts as a non-instantiable stateless (ideally containing only method names and literals i.e public static final variables)  contract which is then accepted by its concrete implementations.
4. A class with an abstract method must be declared as abstract. However, a class with no abstract methods can still be declared as abstract if we don't want its object to created.
5. Java 8 onwards, an interface can have default methods (method with body) and static methods. To solve the diamond inheritance problem, a class implementing two interfaces containing same default method must override the default method.
#### Things to ponder upon:
1. [Why should this() or super() be the first statement in the constructor?](https://stackoverflow.com/questions/1168345/why-do-this-and-super-have-to-be-the-first-statement-in-a-constructor)

#### Notes:
1. The reason why subclasses cannot have more restrictive access specifiers for overridden methods than their parent classes is
to uphold the [Liskov Substitution Principle](https://en.wikipedia.org/wiki/Liskov_substitution_principle). 
<br>Analogy: A square is simply a special form (subclass) of a rectangle. Therefore, A square must provide access to all the methods that are accessible via a rectangle object.
2. If instanceof keyword returns true for a particular comparison, the object (It considers the actual object and not the reference being used to store the object) is definitely either of that class or any of its ancestors (Parent, Object class etc. ) 
3. If the child class is serializable while the super class is not,then the actual values of only the child class specific members will be stored. The members inherited from parent will simply be instantiated to default values by calling the non parameterized constructor of parent class during de-serialization.
4. Whenever equals() method is overridden, it is **strongly** advised to override hashcode() and compareTo() method as well.
##### Explanation:
All classes inherit Object class's equals() and hashcode() method. The default implementation of equals() method returns true only if the references of the two objects are same which is analogous
to using '==' operator to comparing 2 string references instead of using String equals() method.
Hence, for all practical purposes, equals() method has to be overridden in class if it needs be compared in some fashion.
Java provides a contract that if equals() returns true for two particular objects then their hashcodes **must** be equal
too. This contract is used by classes like HashSet, HashMap etc during insertion.
Similarly, classes like TreeMap which require sorting use compareTo() method of Comparable interface 
which provides the natural ordering for a given class. compareTo() returns a positive value if **this** > **o**, negative if **this** < **o** and zero if **this** and **o** are considered **equal**.
For more details refer [this](https://prismoskills.appspot.com/lessons/Java/Chapter_03_-_Hashcode_Equals_and_CompareTo.jsp#:~:text=Summary%3A%20All%203%20methods%20%2D%20compareTo,override%2Fchange%20other%20methods%20too.&text=TreeSet%2FTreeMap%20is%20very%20much,the%20internal%20implementation%20is%20concerned.)

     
   
