/*
 * Check Point.
 */
package chapter02.check_point;

/**
 *
 * @author emaph
 */
public class CheckPoint02_13 {

    // 2.13.1 How do you obtain the current second, minute, and hour?
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();

        // Compute the current second
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;

        // Compute the current minute
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        // Compute the current hour
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        System.out.println(currentHour + ":" + currentMinute + ":" + currentSecond);
    }

}
