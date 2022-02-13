/*
 * Check Point 9.7
 * 9.7 Static Variables, Constants, and Methods
 */
package chapter09.check_point;

// 9.7.1 Suppose the class F is defined in (a). Let f be an instance of F. Which of the
//       statements in (b) are correct?

class F {
    int i;
    static String s;

    void imethod() {
    }

    static void smethod() {
    }
}

class TestF {
    public void testF() {
        F f = new F();
        System.out.println(f.i);  // ok
        System.out.println(f.s);  // ok
        f.imethod();  // ok
        f.smethod();  // ok
        // System.out.println(F.i); // i is not static
        System.out.println(F.s);  // ok
        //F.imethod();  // imethod is not static.
        F.smethod();  // ok
    }
}


// 9.7.2 Add the static keyword in the place of ? if appropriate.

class Test2 {
    int count;

    public static void main(String[] args) {  // need static.
        //...
    }

    public int getCount() {   // don't need static
        return count;
    }

    public static int factorial(int n) {  // need static
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;

        return result;
     }
}


// 9.7.3 Can you invoke an instance method or reference an instance variable from a static
//       method? Can you invoke a static method or reference a static variable from an instance
//       method? What is wrong in the following code?
// a. no
//    yes
//    method1 is not static
//    non static method cant be called from a static.

class C2 {
    Circle c = new Circle();

    public static void main(String[] args) {
        //method1();  // method1 is not static
    }

    public void method1() {
        method2();
    }

    public static void method2() {
        //System.out.println("What is radius " + c.getRadius());
    }
}

public class CheckPoint09_07 {
    public static void main(String[] args) {
        TestF f = new TestF();
        f.testF();

        System.out.println("factorial(6) is " + Test2.factorial(6));
    }
}
