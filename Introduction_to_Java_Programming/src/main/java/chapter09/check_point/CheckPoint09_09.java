/*
 * Check Point 9.9
 * Data Field Encapsulation
 */
package chapter09.check_point;

// 9.9.1 What is an accessor method? What is a mutator method? What are the naming con-
//       ventions for accessor methods and mutator methods?
// a.  Method that acceses a class property
//     Mutator method sets a property of a class to
//     Accessor methods have name of the property prepended with 'get'
//     Mutator methods have


// 9.9.2 What are the benefits of data field encapsulation?
// a. Data cant be tampered with except through the defined interface
//    Data representation can be changes.


// 9.9.3 In the following code, radius is private in the Circle class, and myCircle is an object
//       of the Circle class. Does the highlighted code cause any problems? If so, explain why.
// a. No. Main is part of circle so it has access to  prive members

class Circle1 {
    private double radius = 1;

    /** Find the area of this circle */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        Circle1 myCircle = new Circle1();
        System.out.println("Radius is " + myCircle.radius);
    }
}

public class CheckPoint09_09 {
    public static void main(String[] args) {
        Circle1 myCircle = new Circle1();
        //System.out.println("Radius is " + myCircle.radius);  // error
    }
}
