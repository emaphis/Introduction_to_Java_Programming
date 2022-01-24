/*
 * Listing 10.6
 * 10.5 Case Study: Designing the Course Class
 */
package chapter10.exercise.exercise10_09;

import chapter10.example.listing10_05.*;

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

    /** add student, expand if necessary */
    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    /** Return a copy of the Students array */
    public String[] getStudents() {
        String[] copy = new String[numberOfStudents];
        System.arraycopy(students, 0, copy, 0, numberOfStudents);
        return copy;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        int idx = findStudent(student);
        if (idx >= 0)
            System.arraycopy(students, idx + 1, students, idx, numberOfStudents - idx - 1);
        students[numberOfStudents] = null;
        numberOfStudents--;
    }

    private int findStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student))
                return i;
        }
        return -1;
    }

    void clear() {
        for (int q = 0; q < numberOfStudents; q++) {
            students[q] = null;
        }
        numberOfStudents = 0;
    }
}
