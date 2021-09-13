/*
 * Check Point 9.10
 * Passing Objects to Methods
 */
package chapter09.check_point;

import java.util.Date;

// 9.10.1 Describe the difference between passing a parameter of a primitive type and passing
//        a parameter of a reference type. Show the output of the following programs:
// a. Primitive parameters are passed by value, a copy is passed
//    Objects are passed by referene. The ojbect is shared.

// Show the output of the following programs:
// a.
// count is 101
// times is 0

class Test9_10_1 {
    public static void main(String[] args) {
        Count myCount = new Count();
        int times = 0;

        for (int i = 0; i < 100; i++)
            increment(myCount, times);

        System.out.println("count is " + myCount.count);
        System.out.println("times is " + times);
    }

    public static void increment(Count c, int times) {
        c.count++;
        times++;
    }
}

class Count {
    public int count;

    public Count (int c) {
        count = c;
    }

    public Count () {
        count = 1;
    }
}


// 9.10.2 Show the output of the following program:
// a.
// After swap1: circle1 = 1.0 circle2 = 2.0
// After swap2: circle1 = 2.0 circle2 = 1.0

class Test9_10_2 {
    public static void main(String[] args) {
        Circle2 circle1 = new Circle2(1);
        Circle2 circle2 = new Circle2(2);

        swap1(circle1, circle2);
        System.out.println("After swap1: circle1 = " +
            circle1.radius + " circle2 = " + circle2.radius);

        swap2(circle1, circle2);
        System.out.println("After swap2: circle1 = " +
            circle1.radius + " circle2 = " + circle2.radius);
    }

    public static void swap1(Circle2 x, Circle2 y) {
        Circle2 temp = x;
        x = y;
        y = temp;
    }

    public static void swap2(Circle2 x, Circle2 y) {
        double temp = x.radius;
        x.radius = y.radius;
        y.radius = temp;
    }
}

class Circle2 {
    double radius;

    Circle2(double newRadius) {
        radius = newRadius;
    }
}


// 9.10.3 Show the output of the following code:

// (a).
// a[0] = 1 a[1] = 2
class Test9_10_3_a {
    public static void main(String[] args) {
        int[] a = {1, 2};
        swap(a[0], a[1]);
        System.out.println("a[0] = " + a[0]
            + " a[1] = " + a[1]);
    }

    public static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }
}

// (b).
// a[0] = 2 a[1] = 1
class Test9_10_3_b {
    public static void main(String[] args) {
        int[] a = {1, 2};
        swap(a);
        System.out.println("a[0] = " + a[0]
            + " a[1] = " + a[1]);
    }

    public static void swap(int[] a) {
        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;
    }
}

// (c).
// 1 = 2 e2 = 1
class Test9_10_3_c {
    public static void main(String[] args) {
        T t = new T();
        swap(t);
        System.out.println("e1 = " + t.e1
            + " e2 = " + t.e2);
    }

    public static void swap(T t) {
        int temp = t.e1;
        t.e1 = t.e2;
        t.e2 = temp;
    }
}

class T {
    int e1 = 1;
    int e2 = 2;
}


// (d).
// 1's i = 2 and j = 1
// t2's i = 2 and j = 1
class Test9_10_3_d {
    public static void main(String[] args) {
        T2 t1 = new T2();
        T2 t2 = new T2();
        System.out.println("t1's i = " +
            t1.i + " and j = " + t1.j);
        System.out.println("t2's i = " +
            t2.i + " and j = " + t2.j);
    }
}

class T2 {
    static int i = 0;
    int j = 0;

    T2() {
        i++;
        j = 1;
    }
}


// 9.10.4 What is the output of the following programs?

// (a)
// null  ????
class Test9_10_4_a {
    public static void main(String[] args) {
        Date date = null;
        m1(date);
        System.out.println(date);
    }

    public static void m1(Date date) {
        date = new Date();
    }
}

// (b).
// 1234567
class Test9_10_4_b {
    public static void main(String[] args) {
        Date date = new Date(1234567);
        m1(date);
        System.out.println(date.getTime());
    }

    public static void m1(Date date) {
        date = new Date(7654321);
    }
}

// (c).
// 7654321
class Test9_10_4_c {
    public static void main(String[] args) {
        Date date = new Date(1234567);
        m1(date);
        System.out.println(date.getTime());
    }

    public static void m1(Date date) {
        date.setTime(7654321);
    }
}

// (d)
// 1234567
class Test9_10_4_d {
  public static void main(String[] args) {
    Date date = new Date(1234567);
    m1(date);
    System.out.println(date.getTime());
  }

  public static void m1(Date date) {
    date = null;
  }
}



public class CheckPoint09_10 {
    public static void main(String[] args) {
        System.out.println("in the main main");
    }
}
