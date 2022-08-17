/*
 * Exercise 10.9
 * Updating the Course Class
 * Note: using System.ArrayCopy from Section 7.5
 */
package chapter10.exercise.exercise10_09;

/**
 * Course class
 * @author emaph
 */
public class Course {

    private final String courseName;
    private int numberOfStudents;
    private String[] students = new String[100];

    /** Creates a course with the specified name. */
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

    /** Returns the number of students */
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    /** Returns name of course */
    public String getCourseName() {
        return courseName;
    }

    /** Drops a student from the course */
    public void dropStudent(String student) {
        int idx = findStudent(student);
        if (idx >= 0)
            System.arraycopy(students, idx + 1, students, idx, numberOfStudents - idx - 1);
        students[numberOfStudents] = null;
        numberOfStudents--;
    }

    /** Return index of found student or -1 */
    private int findStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student))
                return i;
        }
        return -1;
    }

    /** remove all students from the class */
    void clear() {
        for (int q = 0; q < numberOfStudents; q++) {
            students[q] = null;
        }
        numberOfStudents = 0;
    }
}
