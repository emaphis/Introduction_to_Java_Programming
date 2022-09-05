/*
 * Listing 12.8
 * 12.4 Declaring, Throwing, and Catching Exceptions
 */
package chapter12.example.listing12_07;


/**
 * Exercise the Circle class
 * @author emaph
 */
public class TestCircleWithException {
    /** Main method */
    public static void main(String[] args) {
        try {
            CircleWithException c1 = new CircleWithException(5);
            CircleWithException c2 = new CircleWithException(-5);
            CircleWithException c3 = new CircleWithException(0);
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }

        System.out.println("The number of objects created is "
             + CircleWithException.getNumberOfObjects());
    }
}

/*
Java.lang.IllegalArgumentException: Radius cannot be negative
The number of objects created is 1
*/
