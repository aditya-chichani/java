## Inheritance
#### Usage of final keyword in inheritance:
1. If a primitive field is made final, its value cannot be changed.
2. If an object reference is made final, the address to which it points cannot be changed i.e., It cannot be made to store another object.
3. If a method in a class is made final, its subclasses cannot override the method.
4. Constructors are anyway not inherited by the subclasses, hence as there is no need for final keyword - we cannot make constructors final.
5. If a class is made final, it cannot have a subclass. Its methods are **implicitly** declared as final.  

#### Things to ponder upon:
1. [Why should this() or super() be the first statement in the constructor?](https://stackoverflow.com/questions/1168345/why-do-this-and-super-have-to-be-the-first-statement-in-a-constructor)

#### Notes:
1. The reason why subclasses cannot have more restrictive access specifiers for overridden methods than their parent classes is
to uphold the [Liskov Substitution Principle](https://en.wikipedia.org/wiki/Liskov_substitution_principle). 
<br>Analogy: A square is simply a special form (subclass) of a rectangle. Therefore, A square must provide access to all the methods that are accessible via a rectangle object.
2. If instanceof keyword returns true for a particular comparison, the object (It considers the actual object and not the reference being used to store the object) is definitely either of that class or any of its ancestors (Parent, Object class etc. ) 
