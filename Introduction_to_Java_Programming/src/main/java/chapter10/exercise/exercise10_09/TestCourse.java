/*
 * Exercise 10.9
 *  (The Course class) Revise the Course class as follows:
 *
 *  ■ Revise the getStudents() method to return an array whose length is the
 *    same as the number of students in the course. (Hint: create a new array and
 *    copy students to it.)
 *  ■ The array size is fixed in Listing 10.6. Revise the addStudent method to automat-
 *    ically increase the array size if there is no room to add more students. This is done
 *    by creating a new larger array and copying the contents of the current array to it.
 *  ■ Implement the dropStudent method.
 *  ■ Add a new method named clear() that removes all students from the course.
 *
 *  Test your program using https://liveexample.pearsoncmg.com/test/Exercise10_09.txt
 */
package chapter10.exercise.exercise10_09;

/**
 *
 * @author emaph
 */
public class TestCourse {

    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Brian Smith");
        course1.addStudent("Anne Kennedy");
        course1.addStudent("Susan Kennedy");
        course1.addStudent("John Kennedy");
        course1.addStudent("Kim Johnson");
        course1.addStudent("S1");
        course1.addStudent("S2");
        course1.addStudent("S3");
        course1.addStudent("S4");
        course1.addStudent("S5");
        course1.addStudent("S6");
        course1.addStudent("S7");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: "
                + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + ", ");
        }

        System.out.println();
        System.out.print("Number of students in course2: "
                + course2.getNumberOfStudents());

        course1.dropStudent("S1");
        System.out.println("\nNumber of students in course1: "
                + course1.getNumberOfStudents());
        students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students[i] + (i < course1.getNumberOfStudents() - 1 ? ", " : " "));
        }

        course1.clear();
        System.out.println("\nNumber of students in course1: "
                + course1.getNumberOfStudents());
    }
}
