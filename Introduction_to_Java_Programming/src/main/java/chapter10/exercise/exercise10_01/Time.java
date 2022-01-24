/*
 * Exercise 10.1
 * Time class.
 */
package chapter10.exercise.exercise10_01;

/**
 * Time class
 * @author emaph
 */
public final class Time {

    private long hour;
    private long minute;
    private long second;

    public Time() {
        long time = System.currentTimeMillis();
        this.setTime(time);
    }


    public Time(long elapseTime) {
        setTime(elapseTime);
    }

    /** Construct time from given hour, minute and second */
    public Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    // see Exercise 3.30 and Listing 2.7
    public void setTime(long elapseTime) {
        long totalSeconds = elapseTime / 1000;
        this.second = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        this.minute = totalMinutes % 60;
        long totalHours = (totalMinutes / 60);
        this.hour = totalHours % 24;
    }
}
