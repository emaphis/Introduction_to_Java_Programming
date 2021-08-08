/*
 * Listing 5.12
 * 5.12 Keywords break and continue
 */
package chapter05.example.listing05_12;

/**
 * @author emaph
 */
public class TestBreak {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
            sum += number;
            if (sum >= 100)
                break;
        }

        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
    }
}
