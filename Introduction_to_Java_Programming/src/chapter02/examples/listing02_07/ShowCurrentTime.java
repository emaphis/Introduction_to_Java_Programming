/*
 * .2.13 Case Study: Displaying the Current TimeM
 *  ShowCurrentTime.java
 */
package chapter02.examples.listing02_07;

/**
 *
 * @author emaph
 */
public class ShowCurrentTime {

    public static void main(String[] args) {
        // Obtain the total millisoconds since midnight, Jan 1 1960
        long totalMilliseconds = System.currentTimeMillis();

        // Objtain the total seconds since midnight  Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

        // Display results
        System.out.println("Current time is " + currentHour + ":"
                + currentMinute + ":" + currentSecond + " GMT");
    }
}
