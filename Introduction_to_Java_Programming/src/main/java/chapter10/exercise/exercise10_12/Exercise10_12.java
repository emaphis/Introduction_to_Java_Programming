/*
 * Exercise 10.12
 *  (Geometry: the Triangle2D class) Define the Triangle2D class that contains:
 *
 *  ■ Three points named p1, p2, and p3 of the type MyPoint with getter and
 *    setter methods. MyPoint is defined in Programming Exercise 10.4.
 *  ■ A no-arg constructor that creates a default triangle with the points (0, 0),
 *    (1, 1), and (2, 5).
 *  ■ A constructor that creates a triangle with the specified points.
 *  ■ A method getArea() that returns the area of the triangle.
 *  ■ A method getPerimeter() that returns the perimeter of the triangle.
 *  ■ A method contains(MyPoint p) that returns true if the specified point
 *    p is inside this triangle (see Figure 10.22a).
 *  ■ A method contains(Triangle2D t) that returns true if the specified
 *    triangle is inside this triangle (see Figure 10.22b).
 *  ■ A method overlaps(Triangle2D t) that returns true if the specified
 *    triangle overlaps with this triangle (see Figure 10.22c).
 *
 *  Draw the UML diagram for the class and then implement the class. Write a
 *  test program that creates a Triangle2D object t1 using the constructor
 *  new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3),
 *  new MyPoint(5, 3.5)), displays its area and perimeter, and displays the
 *  result of t1.contains(3, 3), r1.contains(new Triangle2D(new
 *  MyPoint(2.9, 2), new MyPoint(4, 1), MyPoint(1, 3.4))), and t1
.*  overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint
 *  (4, –3), MyPoint(2, 6.5))).
 *
 *  (Hint: For the formula to compute the area of a triangle, see Programming
 *  Exercise 2.19. To detect whether a point is inside a triangle, draw three
 *  dashed lines, as shown in Figure 10.23. Let Δ denote the area of a triangle.
 *  If ΔABp + ΔACp + ΔBCp == ΔABC, the point p is inside the triangle, as
 *  shown in Figure 10.23a. Otherwise, point p is not inside the triangle, as
 *  shown in Figure 10.23b.)
 */
// TODO: This is a complecated one.
package chapter10.exercise.exercise10_12;

import chapter10.exercise.exercise10_04.MyPoint;

/**
 *
 * @author emaph
 */
public class Exercise10_12 {
    static void test0() {
        Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
        System.out.println("t1 area = " + t1.getArea());
        System.out.println("t1 perimeter = " + t1.getPerimeter());
        System.out.println("t1 contains (3,3) = " + t1.contains(new MyPoint(3, 3)));
        System.out.println("t1 contans = " +
            t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1.0), new MyPoint(1, 3.4))));
        System.out.println("t1 intersects = " +
            t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2, 6.5))));
    }

    // Examples I used for testing....
    static void test1() {
        Triangle2D t1 = new Triangle2D(new MyPoint(1.5, -3.4), new MyPoint(4.6, 5), new MyPoint(9.5, -3.4));
        System.out.println("area should be 33.6 : " + t1.getArea());
        Triangle2D t2 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(5, -1.0), new MyPoint(4.0, 2.0));
        System.out.println("area should be 2.25: " + t2.getArea());
    }

    static void test2() {
        Triangle2D t1 = new Triangle2D(new MyPoint(0, 0), new MyPoint(0, 100), new MyPoint(200, 0));
        MyPoint p1 = new MyPoint(100.5, 25.5);
        System.out.println("t1 should contain p1: " + t1.contains(p1));
        MyPoint p2 = new MyPoint(100.5, 50.5);
        System.out.println("t1 should not contain p2: " + t1.contains(p2));

    }

    static void test3() {
        Triangle2D r1 = new Triangle2D(2, 2, 5.5, 4.9, 9.0, 10.3);
        System.out.println("Area is " + r1.getArea());
        System.out.println("Perimeter is " + r1.getPerimeter());
        System.out.println(r1.contains(new MyPoint(3, 3)));
        System.out.println(r1.contains(new Triangle2D(4, 5, 10.5, 3.2, -0.5, -10.5)));
        System.out.println(r1.overlaps(new Triangle2D(3, 5, 2.3, 6.7, 5.5, 8.8)));
    }

    public static void main(String[] args) {
        test0();
        //test1();
        //test2();
        //test3();
    }
}
