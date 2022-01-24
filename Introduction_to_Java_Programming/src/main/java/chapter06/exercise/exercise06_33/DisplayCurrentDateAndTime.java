/*
 * Exercise 6.33
 *  (Current date and time) Invoking System.currentTimeMillis() returns the
 *  elapsed time in milliseconds since midnight of January 1, 1970. Write a program
 *  that displays the date and time.
 *
 *      Current date and time is May 16, 2012 10:34:23
 */
package chapter06.exercise.exercise06_33;


/**
 * Display current date and time
 * @author emaph
 */
public class DisplayCurrentDateAndTime {
    public static void main(String[] args) {
        // Ignore timezones
        System.out.println("Current date and time is " + getDate() + " " + getTime());
    }

    public static String getTime() {
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

        // Compute the current hour  - Convert to EST
        long currentHour = (totalHours % 24) - 4;

        return  String.format("%02d:%02d:%02d", currentHour, currentMinute, currentSecond);
    }

    public static String getDate() {
        long totalMilliseconds = System.currentTimeMillis();
        long totalDays = totalMilliseconds / (1000 * 60 * 60 * 24);

        // start from January 1, 1970 when currentTimeMillis starts at 0.
        int year = 1970;
        int month = 1;
        int day = 1;
        int startDayNo = 4;  // Thursday.
        int monthDays = getNumberOfDaysInMonth(year, month);

        // loop thru all of the days to find current day
        for (long i = 0; i < totalDays; i++) {

            // increment day
            startDayNo = (startDayNo + 1) % 7;
            day++;

            // increment month
            if (day > monthDays) {
                month++;
                day = 1;
            }

            // increment year
            if (month > 12) {
                year++;
                month = 1;
            }

            monthDays = getNumberOfDaysInMonth(year, month);
        }


        return getMonthName(month) + " " +  day + ", " + year;
    }



    //
    // See Listing 6.12 for these functions
    //

    /** Get the number of days in a month */
    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
            month == 8 || month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if (month == 2)
            return isLeapYear(year)? 29: 28;

        return 0;  // if month is incorrect
    }

    /** Return true if year is a leap year */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    /**
     * Convert from month number to month name *
     * from Listing 6.12
     */
    public static String getMonthName(int month) {
        String monthName;

        switch (month) {
            case  1: monthName = "January";  break;
            case  2: monthName = "February";  break;
            case  3: monthName = "March"; break;
            case  4: monthName = "April"; break;
            case  5: monthName = "May"; break;
            case  6: monthName = "June"; break;
            case  7: monthName = "July"; break;
            case  8: monthName = "August"; break;
            case  9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
            default: monthName = "unkown";
        }

        return monthName;
    }
}