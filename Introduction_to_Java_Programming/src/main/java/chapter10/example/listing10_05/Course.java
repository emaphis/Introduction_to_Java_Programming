/*
 * Listing 10.6
 * 10.5 Case Study: Designing the Course Class
 */
package chapter10.example.listing10_05;

/**
 * Course class
 * @author emaph
 */
public class Course {

    private final String courseName;
    private int numberOfStudents;
    private String[] students = new String[100];

    public Course(String courseName) {
        this.courseName = courseName;
        this.numberOfStudents = 0;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudensts() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        // left as an exercise
    }
}
