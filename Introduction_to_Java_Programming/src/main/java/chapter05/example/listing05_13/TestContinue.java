/*
 * Listing 5.12
 * 5.12 Keywords break and continue
 */
package chapter05.example.listing05_13;

/**
 * @author emaph
 */
public class TestContinue {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
            if (number == 10 || number == 11)
                continue;
            sum += number;
        }

        System.out.println("The sum is " + sum);
    }
}
