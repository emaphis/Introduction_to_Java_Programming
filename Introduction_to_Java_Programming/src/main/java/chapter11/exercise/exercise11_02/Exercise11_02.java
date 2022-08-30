/*
 * Exercise 11.2
 *  (The Person, Student, Employee, Faculty, and Staff classes) Design a class
 *  named Person and its two subclasses named Student and Employee. Make
 *  Faculty and Staff subclasses of Employee. A person has a name, address,
 *  phone number, and e-mail address. A student has a class status (freshman, soph￾omore, junior, or senior). Define the status as a constant. An employee has an
 *  office, salary, and date hired. Use the MyDate class defined in Programming
 *  Exercise 10.14 to create an object for date hired. A faculty member has office
 *  hours and a rank. A staff member has a title. Override the toString method in
 *  each class to display the class name and the person’s name.
 *
 *  Draw the UML diagram for the classes and implement them. Write a test program
 *  that creates a Person, Student, Employee, Faculty, and Staff, and invokes
 *  their toString() methods.
 */
package chapter11.exercise.exercise11_02;

import chapter10.exercise.exercise10_14.MyDate;

/**
 *
 * @author emaph
 */
public class Exercise11_02 {
    public static void main(String[] args) {
        Person peter = new Person("Peter", "100 West Blvd.", "1-444-555-1234", "peter@gamil.com");
        System.out.println(peter);

        Student susan = new Student("Susan", "123 Webb St.", "1-444-555-9876", "susan@gmail.com",
                                    Student.SOPHOMORE);
        System.out.println(susan);

        Employee eva = new Employee("Eva", "2876 Southington Rd", "1-444-555-8934", "eva@gmail.com",
                "3b-200", 180000, new MyDate(2016, 8, 23));
        System.out.println(eva);

        Faculty frank = new Faculty("Frank", "23 West Ln", "1-444-555-6734", "frank@mail.com", "3F-330", 150000, new MyDate(2011, 1, 15), "All day Monday", "Senior Lecturer");
        System.out.println(frank);

        Staff shane = new Staff("Shane", "234 Lester Dr", "1-555-2345", "shane@email.com", "2E-101", 120000, new MyDate(2008, 10, 12), "Chief Janitor");
        System.out.println(shane);
    }
}

/*
Person: Peter
Student: Susan
Employee: Eva
Faculty: Frank
Staff: Shane
*/