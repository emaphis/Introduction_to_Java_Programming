/*
 * Exercise 6.24
 *  (Display current date and time) Listing 2.7, ShowCurrentTime.java, displays the
 *  current time. Revise this example to display the current date and time. The calen-
 *  dar example in Listing 6.12, PrintCalendar.java, should give you some ideas on
 *  how to find the year, month, and day.
 */
package chapter06.exercise.exercise06_24;

/**
 * Display current date and time
 * @author emaph
 */
public class DisplayCurrentDateAndTime {
    public static void main(String[] args) {
        // Ignore timezones
        System.out.println("GMT: " + getDate() + " - " + getTime());
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

        // Compute the current hour
        long currentHour = totalHours % 24;

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


        return getDayName(startDayNo) + ": " + month + "/" +  day + "/" + year;
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
     * Convert from day number to day name *
     * from Exercise 3.21
     */
    static String getDayName(int day) {
        String dayName = "";
        switch (day) {
            case  0: dayName = "Saturday"; break;
            case  1: dayName = "Sunday"; break;
            case  2: dayName = "Monday"; break;
            case  3: dayName = "Tuesday"; break;
            case  4: dayName = "Wednesday"; break;
            case  5: dayName = "Thursday"; break;
            case  6: dayName = "Friday";
        }

        return dayName;
    }
}
