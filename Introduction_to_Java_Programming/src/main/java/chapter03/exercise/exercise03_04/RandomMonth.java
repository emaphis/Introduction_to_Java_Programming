/*
 * Exercise 3.4
 * (Random month) Write a program that randomly generates an integer between 1
 * and 12 and displays the English month names January, February, . . . , December
 * for the numbers 1, 2, . . . , 12, accordingly.
 */
package chapter03.exercise.exercise03_04;

/**
 *
 * @author emaph
 */
public class RandomMonth {
    public static void main(String[] args) {
        // Generate a random integer between 1 12
        int month = (int) (Math.random() * 12) + 1;
        String name = "";

        switch (month) {
            case 1:  name = "January"; break;
            case 2:  name = "February"; break;
            case 3:  name = "March"; break;
            case 4:  name = "April"; break;
            case 5:  name = "May"; break;
            case 6:  name = "June"; break;
            case 7:  name = "July"; break;
            case 8:  name = "August"; break;
            case 9:  name = "Sepember"; break;
            case 10: name = "October"; break;
            case 11: name = "November"; break;
            case 12: name = "December";
        }

        System.out.println("Month: " + name);
    }
}
