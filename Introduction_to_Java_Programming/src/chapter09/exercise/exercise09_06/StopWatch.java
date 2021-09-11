/*
 * Exercise 9.6
 * Stopwatch class.
 */
package chapter09.exercise.exercise09_06;

/**
 * Stopwatch
 * @author emaph
 */
public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    /** Resets the start time to the current time */
    public void start() {
        startTime = System.currentTimeMillis();
    }

    /** Set the endTime to the current time */
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    /** Returns the elapsed time in milliseconds */
    public long getElapsedTime() {
        return getEndTime() - getStartTime();
    }

    /** Return start time in milliseconds */
    public long getStartTime() {
        return startTime;
    }

    /** Return end time in milliseconds */
    public long getEndTime() {
        return endTime;
    }

}
