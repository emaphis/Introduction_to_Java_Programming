/*
 * Exercise 10.14
 * The MyDate class  - Use Exercise 9.5 as an exaple
 */
package chapter10.exercise.exercise10_14;

import java.util.GregorianCalendar;

/**
 * The MyDateClass.
 * @author emaph
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    /** A no-arg constructor that creates a MyDate object for the current date */
    public MyDate() {
        long elapsedTime = System.currentTimeMillis();
        this.setDate(elapsedTime);
    }

    /* Constructs a MyDate object with a specified elapsed time since
     * midnight, January 1, 1970, in milliseconds. */
    public MyDate(long elapsedTime) {
        this.setDate(elapsedTime);
    }

    /**  Constructs a MyDate object with the specified year, month, and day. */
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /** get year */
    public int getYear() {
        return year;
    }

    /** Get month */
    public int getMonth() {
        return month;
    }

    /** Get day */
    public int getDay() {
        return day;
    }

    /** Sets a new date for he object using the elapsed time */
    public void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);

        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH);
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
