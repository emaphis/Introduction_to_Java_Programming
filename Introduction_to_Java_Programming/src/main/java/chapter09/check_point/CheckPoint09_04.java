/*
 * Check Point 9.4
 *  9.4 Constructing Objects Using Constructors
 */
package chapter09.check_point;

// 9.4.1 What are the differences between constructors and methods?
// a. Special kind of method, but:
//     Same name of as the class
//     Have no return type.
//     Are invocked with a new keyword


// 9.4.2 When will a class have a default constructor?
// a. When is has no manually defined consturctors.

// 9.4.3 What is wrong with each of the following programs?

// a. No contructor defined that takes an int prameter
class ShowErrors_a {
    public static void main(String[] args) {
        //ShowErrors t = new ShowErrors(5);
        ShowErrors_a t = new ShowErrors_a();
    }
}

// b.  No constructor for C taking parameters
class ShowErrors_b {
    public static void main(String[] args) {
        //C c = new C(5.0);
        C c = new C();
        System.out.println(c.value);
    }
}

class C {
    int value = 2;
}


// 9.4.4 What is wrong in the following code?
// a. No default constructor.
class Test {
    public static void main(String[] args) {
        //A a = new A();
        A a = new A("string");
        a.print();
    }
 }

class A {
    String s;

    A(String newS) {
        s = newS;
    }

    public void print() {
        System.out.print(s);
    }
}


public class CheckPoint09_04 {
    public static void main(String[] args) {
        Test.main(args);
        System.out.println();
    }

}
