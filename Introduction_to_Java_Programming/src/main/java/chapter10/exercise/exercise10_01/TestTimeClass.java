/*
 * Exercise 10.1
 *  (The Time class) Design a class named Time. The class contains:
 *  ■ The data fields hour, minute, and second that represent a time.
 *  ■ A no-arg constructor that creates a Time object for the current time. (The
 *    values of the data fields will represent the current time.)
 *  ■ A constructor that constructs a Time object with a specified elapsed time
 *    since midnight, January 1, 1970, in milliseconds. (The values of the data
 *    fields will represent this time.)
 *  ■ A constructor that constructs a Time object with the specified hour, minute,
 *    and second.
 *  ■ Three getter methods for the data fields hour, minute, and second,
 *    respectively.
 *  ■ A method named setTime(long elapseTime) that sets a new time for the
 *    object using the elapsed time. For example, if the elapsed time is 555550000
 *    milliseconds, the hour is 10, the minute is 19, and the second is 10.
 *
 *  Draw the UML diagram for the class then implement the class. Write a
 *  test program that creates three Time objects (using new Time(), new
 *  Time(555550000), and new Time(5, 23, 55)) and displays their hour,
 *  minute, and second in the format hour:minute:second.
 *
 *  (Hint: The first two constructors will extract the hour, minute, and second
 *  from the elapsed time. For the no-arg constructor, the current time can be
 *  obtained using System.currentTimeMillis(), as shown in Listing 2.7,
 *  Show CurrentTime.java. Assume the time is in GMT.)
 */
package chapter10.exercise.exercise10_01;

/**
 * Exercise the Time class
 * @author emaph
 */
public class TestTimeClass {
    public static void main(String[] args) {
        Time time0 = new Time();
        Time time1 = new Time(555550000);  // eleapsed time
        Time time2 = new Time(5, 23, 55);

        displayTime(time0);
        displayTime(time1);
        displayTime(time2);
    }

    public static void displayTime(Time time) {
        System.out.println(time.getHour() + ":" + time.getMinute() + ":"
                + time.getSecond() + " GMT");
    }
}

/*
16:56:15 GMT
10:19:10 GMT
5:23:55 GMT
*/
