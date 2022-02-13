/*
 * Example from 9.5.2 Reference Data Fields and the null Value
 */
package chapter09.example.examples;

/**
 *
 * @author emaph
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("name? " + student.name);
        System.out.println("age? " + student.age);
        System.out.println("isScienceMajor? " + student.isScienceMajor);
        System.out.println("gender? " + student.gender);
    }
}
