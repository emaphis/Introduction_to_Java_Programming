/*
 * Check Point 12.3
 * 12.3 Exception Types
 */
package chapter12.check_point;


public class CheckPoint12_03 {
    // 12.3.1 Describe the Java Throwable class, its subclasses, and the types of exceptions.
    // a- Throwable is the base class of all exceptions.
    //    Error is the base class of JVM system errors
    //    Exceptions is the base class caused by the program or external causs.
    //    Runtime is the base class of exceptions that mean programming erros.

    // 12.3.2 What RuntimeException will the following programs throw, if any?
    // a- ArithmeticException: / by zero
    // b- ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    // c- StringIndexOutOfBoundsException: String index out of range: 3
    // d- ClassCastException: class Object cannot be cast to class String
    // e- NullPointerException: Cannot invoke "Object.toString()" because "o" is null
    // f- no exception.

    static void test02a() {
        System.out.println(1 / 0);
    }

    static void test02b() {
        int[] list = new int[5];
        System.out.println(list[5]);
    }

    static void test02c() {
        String s = "abc";
        System.out.println(s.charAt(3));
    }

    static void test02d() {
        Object o = new Object();
        String d = (String)o;
    }

    static void test02e() {
        Object o = null;
        System.out.println(o.toString());
    }

    static void test02f() {
        System.out.println(1.0 / 0);
    }


    public static void main(String[] args) {
        test02f();
    }
}
