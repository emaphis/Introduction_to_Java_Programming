/*
 * Exercise 11.5
 * Updated course class using ArrayList.
 */
package chapter11.exercise.exercise11_05;

import java.util.ArrayList;

/**
 * Course class
 * @author emaph
 */
public class Course {

    private final String courseName;
    private ArrayList<String> students;

    /** Create a course */
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    /** Add a Student to the course */
    public void addStudent(String student) {
        students.add(student);
    }

    /** return students array */
    // Note: The original contract is kept the same.
    public String[] getStudensts() {
        String[] array = new String[students.size()];
        return students.toArray(array);
    }

    /** Return number of students */
    public int getNumberOfStudents() {
        return students.size();
    }

    /** Return course name */
    public String getCourseName() {
        return courseName;
    }

    /** Remove passed student */
    public void dropStudent(String student) {
        students.remove(student);
    }
}
