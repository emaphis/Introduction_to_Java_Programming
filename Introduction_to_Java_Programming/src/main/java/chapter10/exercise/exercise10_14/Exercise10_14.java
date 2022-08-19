/*
 * Exercise 10.14
 *  (The MyDate class) Design a class named MyDate. The class contains:
 *   ■ The data fields year, month, and day that represent a date. month is 0-based,
 *     i.e., 0 is for January.
 *   ■ A no-arg constructor that creates a MyDate object for the current date.
 *   ■ A constructor that constructs a MyDate object with a specified elapsed time
 *     since midnight, January 1, 1970, in milliseconds.
 *   ■ A constructor that constructs a MyDate object with the specified year, month,
 *     and day.
 *   ■ Three getter methods for the data fields year, month, and day, respectively.
 *   ■ A method named setDate(long elapsedTime) that sets a new date for
 *     the object using the elapsed time.
 *
 *     Draw the UML diagram for the class then implement the class. Write a test
 *     program that creates two MyDate objects (using new MyDate() and new
 *     MyDate(34355555133101L)) and displays their year, month, and day.
 *     (Hint: The first two constructors will extract the year, month, and day
 *     from the elapsed time. For example, if the elapsed time is 561555550000
 *     milliseconds, the year is 1987, the month is 9, and the day is 18. You may
 *     use the GregorianCalendar class discussed in Programming Exercise 9.5
 *     to simplify coding.)
 */
package chapter10.exercise.exercise10_14;

/**
 *
 * @author emaph
 */
public class Exercise10_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);
        MyDate date3 = new MyDate(561555550000L);
        displayDate(date1);
        displayDate(date2);
        displayDate(date3);
    }

    static void displayDate (MyDate date) {
        System.out.println("Date = " + date.getYear() + "/" + date.getMonth()
                + "/" + date.getDay());
    }
}

/*
Date = 2022/7/19
Date = 3058/8/7
Date = 1987/9/18
*/
