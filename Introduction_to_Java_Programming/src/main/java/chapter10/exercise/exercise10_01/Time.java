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

    /** A default constructor that constructs a time object (Now) */
    public Time() {
        long time = System.currentTimeMillis();
        this.setTime(time);
    }


    /**
     * A constructor that constructs a Time object with a specified elapsed time
     * since midnight, January 1, 1970, in milliseconds. (The values of the data
     * fields will represent this time.)
     */
    public Time(long elapseTime) {
        setTime(elapseTime);
    }

    /** Construct time from given hour, minute and second */
    public Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /** Return hour */
    long getHour() {
        return hour;
    }

    /** Return minute */
    public long getMinute() {
        return minute;
    }

    /** Return second */
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
