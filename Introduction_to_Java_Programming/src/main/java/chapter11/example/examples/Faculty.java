/*
 * 11.3.2 Constructor Chaining
 */
package chapter11.example.examples;


public class Faculty extends Employee {
    public static void main(String[] args) {
        new Faculty();
    }

    public Faculty() {
        System.out.println("(4) Performs Faculty's tasks");
    }

}

class Employee extends Person {
    public Employee() {
        this("(2) Invokes Employee's overloaded constucotr");
        System.out.println("(3) Performs Employee's tasks");
    }

    public Employee(String s) {
        System.out.println(s);
    }
}

class Person {
    public Person() {
        System.out.println("(1) Performs Person's tasks");
    }
}

/*
(1) Performs Person's tasks
(2) Invokes Employee's overloaded constucotr
(3) Performs Employee's tasks
(4) Performs Faculty's tasks
*/
