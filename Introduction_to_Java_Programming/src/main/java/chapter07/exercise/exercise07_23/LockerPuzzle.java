/*
 * Exercise 7.23
 *  (Game: locker puzzle) A school has 100 lockers and 100 students. All lockers are
 * CLOSED on the first day of school. As the students enter, the first student, denoted
 * as S1, opens every locker. Then the second student, S2, begins with the second
 * locker, denoted as L2, and closes every other locker. Student S3 begins with the
 * third locker and changes every third locker (closes it if it was open and opens it if
 * it was CLOSED). Student S4 begins with locker L4 and changes every fourth locker.
 * Student S5 starts with L5 and changes every fifth locker, and so on, until student
 * S100 changes L100.
 *
 *  After all the students have passed through the building and changed the lockers,
 *  which lockers are open? Write a program to find your answer and display all open
 *  locker numbers separated by exactly one space.
 *
 *  (Hint: Use an array of 100 Boolean elements, each of which indicates whether a
 *  locker is open (true) or CLOSED (false). Initially, all lockers are CLOSED.)
 */
package chapter07.exercise.exercise07_23;

/**
 *
 * @author emaph
 */
public class LockerPuzzle {
    static final boolean OPENED = true;
    static final boolean CLOSED = false;
    static final int SIZE = 100;
    static boolean[] lockers = new boolean[SIZE];

    public static void main(String[] args) {
        // Initially, all lockers are CLOSED.
        for (int lockerNo = 0; lockerNo < lockers.length; lockerNo++) {
            close(lockerNo);
        }


        // Note: lockerNo are addressed as (studentNo - 1)
        for (int studentNO = 1; studentNO <= SIZE; studentNO++) {
            for (int lockerNo = 0; lockerNo < SIZE; lockerNo += studentNO) {
                play(lockerNo);
            }
        }

        System.out.println("Opened lockers: ");
        printLockers(lockers);
    }



    static private void open(int lockerNo) {
        lockers[lockerNo] = OPENED;
    }

    static private void close(int lockerNo) {
        lockers[lockerNo] = CLOSED;
    }


    static private void play(int lockerNo) {
        if (lockers[lockerNo] == CLOSED) {
            open(lockerNo);
        } else {  // opened
            close(lockerNo);
        }
    }

    static private void printLockers(boolean[] lockers) {
        for (int lockerNo = 0; lockerNo < lockers.length; lockerNo++) {
            if (lockers[lockerNo])
               System.out.printf("%-3d", lockerNo);
        }
        System.out.println();
    }
}

//    1 4 9 16 25 36 49 64 81 100
