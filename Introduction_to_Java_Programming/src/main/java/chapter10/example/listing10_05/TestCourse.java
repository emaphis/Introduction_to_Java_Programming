/*
 * Listing 10.5
 * 10.5 Case Study: Designing the Course Class
 */
package chapter10.example.listing10_05;

/**
 * Exercise Course class
 * @author emaph
 */
public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: "
                + course1.getNumberOfStudents());

        String[] students = course1.getStudensts();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + " ");
        System.out.println();

        System.out.println("Numner of students in cours2: "
            + course2.getNumberOfStudents());
    }
}

/*
Number of students in course1: 3
Peter Jones Kim Smith Anne Kennedy
Numner of students in cours2: 2
*/
