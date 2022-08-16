/*
 * Exercise 10.4
 *  (The MyPoint class) Design a class named MyPoint to represent a point with
 *  x- and y-coordinates. The class contains:
 *
 *  ■ The data fields x and y that represent the coordinates with getter methods.
 *  ■ A no-arg constructor that creates a point (0, 0).
 *  ■ A constructor that constructs a point with specified coordinates.
 *  ■ A method named distance that returns the distance from this point to a
 *    specified point of the MyPoint type
 *  ■ A method named distance that returns the distance from this point to
 *    another point with specified x- and y-coordinates.
 *  ■ A static method named distance that returns the distance from two MyPoint
 *    objects.
 *
 *  Draw the UML diagram for the class then implement the class. Write a test
 *  program that creates the two points (0, 0) and (10, 30.5) and displays the dis-
 *  tance between them
 */
package chapter10.exercise.exercise10_04;

/**
 * Exercise MyPointClass
 * @author emaph
 */
public class Exercise10_04 {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);

        System.out.println("Distance= " + point1.distance(point2));
        System.out.println("Distance= " + point1.distance(10, 30.5));
        System.out.println("Distance= " + MyPoint.distance(point1, point2));
    }
}

/*
Distance= 32.09750769140807
Distance= 32.09750769140807
Distance= 32.09750769140807
*/
