/*
 * Check Point 9.5
 * Accessing Objects via Reference Variables
 */
package chapter09.check_point;

// 9.5.1 Is an array an object or a primitive-type value? Can an array contain elements of an
//       object type? Describe the default value for the elements of an array.
// a. Array is an object.
//    Yes, arrays can contain object types
//    The default values of the type the array stores.


// 9.5.2 Which operator is used to access a data field or invoke a method from an object?
// a.  '.'  the period

// 9.5.3 What is an anonymous object?
// a. an object that is unnamed, ie. no reference variable.


//  9.5.4 What is NullPointerException?
// a. An exception raised by the dereferencing a non assigend reference.

// 9.5.5 What is wrong with each of the following programs?

// (a).  x() is un-defined method.
class ShowErrors1 {
    public static void main(String[] args) {
        ShowErrors1 t = new ShowErrors1();
        //t.x();
    }
}

// (b). Circle class is undefined.
//      Circle 'c' is initialized late.
class ShowErrors2 {
    public void method1() {
        Circle c;
        c = new Circle();
        System.out.println("What is radius "
                + c.getRadius());
        //c = new Circle();
    }
}

class Circle {
    public int getRadius() { return 1; }
}


// 9.5.6 What is the output of the following code?
// a.  false
class A2 {
    boolean x;
    public static void main(String[] args) {
        A2 a = new A2();
        System.out.println(a.x);
    }
}


/**
 *
 * @author emapha
 */
public class CheckPoint09_05 {
    public static void main(String[] args) {

    }
}
