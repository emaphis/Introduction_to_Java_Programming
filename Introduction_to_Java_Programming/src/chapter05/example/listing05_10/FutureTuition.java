/*
 * Listing 5.10
 * 5.11.2 Case Study: Predicting the Future Tuition
 */
package chapter05.example.listing05_10;

public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 10000;  // Year 0
        int year = 0;
        while (tuition < 20000) {
            tuition = tuition * 1.07;
            year++;
        }

        System.out.println("Tuition will be double in " + year + " years");
        System.out.printf("Tuition will be %.2f in %d years\n", tuition, year);
    }
}
