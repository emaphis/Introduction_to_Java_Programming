/*
 * Listing 12.7
 * 12.4 Declaring, Throwing, and Catching Exceptions
 * Catching exceptions thrown by Clases.
 */
package chapter12.example.listing12_07;

/**
 *
 * @author emaph
 */
public class TestCircleWithException {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        try {
            CircleWithException c1 = new CircleWithException(8);
            CircleWithException c2 = new CircleWithException(-5);
            CircleWithException c3 = new CircleWithException(0);
        }
        catch (IllegalArgumentException ex) {
            System.err.println(ex);
        }
        
        System.out.println("Number of objects created " + CircleWithException.getNumberOfObjects());
    }
}
/*
java.lang.IllegalArgumentException: Radius cannot be negative
Number of objects created 1
*/
