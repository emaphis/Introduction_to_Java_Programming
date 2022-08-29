/*
 * Listing 11.6
 * 11.8 Dynamic Binding
 */
package chapter11.example.listing11_06;

/**
 * Demonstrate Dynamic Binding
 * @author emaph
 */
public class DynamicBindingDemo {
    public static void main(String[] args) {
        m(new GraduateStudent());  // will use Student's implementation
        m(new Student());
        m(new Person());
        m(new Object());
    }

    private static void m(Object x) {
        System.out.println(x.toString());
    }
}

class GraduateStudent extends Student {
}

class Student extends Person {
    @Override
    public String toString() {
        return "Strudent";
    }
}

class Person extends Object {
    @Override
    public String toString() {
        return "Person";
    }
}

/*
Strudent
Strudent
Person
java.lang.Object@7a81197d
*/