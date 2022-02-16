/*
 * Check Point 10.5
 * 10.5 Case Study: Designing the Course Class
 */

package chapter10.check_point;

import chapter10.example.listing10_05.Course;


// 10.5.1 Replace the statement in line 17 in Listing 10.5, TestCourse.java, so the loop
//        displays each student name followed by a comma except the last student name.

public class CheckPoint10_05 {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        System.out.println("Number of students in course1: "
                + course1.getNumberOfStudents());

        // check point 10.5
        String[] students = course1.getStudensts();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + (i < course1.getNumberOfStudents() - 1 ? ", " : " "));
        System.out.println();
    }
}

/*
Number of students in course1: 3
Peter Jones, Kim Smith, Anne Kennedy
*/
