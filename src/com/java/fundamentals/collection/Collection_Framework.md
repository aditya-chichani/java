# Collection Framework
1. **Collection** and **Map** are the top level interfaces in java.util package. 
2. **Collections** is a utility class in the same package which contains useful static methods that operate on concrete implementations of the Collection interface.
3. Class Stack continues to extend Vector class to ensure backwards compatibility, ideally it should have used Vector as an attribute for internal implementation (Composition instead of unnecessary Inheritance).
#### Ways to Iterate over a collection:
1. Collection interface implements Iterable interface which provides an iterator() method that returns a reference to the Iterator interface. Therefore, **all** subclasses of Collection provide an implementation of iterator() method.
2. Legacy collection classes (Vector (Synchronized form of ArrayList), HashTable (Synchronized form of HashMap))  also return an Enumeration object to achieve the same task.
3. The implementations of the **List** interface also implement the **ListIterator** interface which allows bi-directional traversal unlike Enumeration and Iterator interface.   
4. Iterator uses a cursor element and all its methods i.e., hasNext(), next() and remove() function w.r.t the cursor.<br> 
Eg: For a list containing elements {1,2,3} the initial cursor position would be |123 where | is the cursor.   
