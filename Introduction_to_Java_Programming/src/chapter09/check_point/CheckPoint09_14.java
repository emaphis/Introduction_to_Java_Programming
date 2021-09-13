/*
 * Check Point 9.14
 * The 'this' keyword
 */
package chapter09.check_point;


// 9.14.1 Describe the role of the this keyword.
// a. this is used as a reference to refer to the enclosing class.


// 9.14.2 What is wrong in the following code?
//  a. call to contructor (this) must be first statement in the contrutor.
//     prepend this to the p value to differentiate them from the p parameter..
class C1 {
    private int p;

    public C1() {
        this(0);  // fixed
        System.out.println("C's no-arg constructor invoked");
        //this(0);
    }

    public C1(int p) {
        //p = p;
        this.p = p;  // fixed.
    }

    public void setP(int p) {
        //p = p;
        this.p = p;  // fixed
    }
}


// 9.14.3 What is wrong in the following code?
// a. Test.id isn't a static variable.
class Test14 {
    private int id;

    public void m1() {
        this.id = 45;
    }

    public void m2() {
        //Test14.id = 45;
        this.id = 45;
    }
}


public class CheckPoint09_14 {

}
