/*
 * Exercise 11.5
 *  (The Course class) Rewrite the Course class in Listing 10.6. Use an ArrayList
 *  to replace an array to store students. Draw the new UML diagram for the class.
 *  You should not change the original contract of the Course class (i.e., the defi￾nition of the constructors and methods should not be changed, but the private
 *  members may be changed.)
 */
package chapter11.exercise.exercise11_05;

/**
 * Exercise Course class
 * @author emaph
 */
public class Exercise11_05 {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Brian Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: "
                + course1.getNumberOfStudents());


        for (String student : course1.getStudensts()) {
            System.out.print(student + " ");
        }
        System.out.println();

        System.out.println("Number of students in course2: "
            + course2.getNumberOfStudents());
    }
}

/*
Number of students in course1: 3
Peter Jones Brian Smith Anne Kennedy
Number of students in course2: 2
*/
