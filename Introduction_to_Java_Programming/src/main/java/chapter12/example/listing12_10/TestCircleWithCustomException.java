/*
 * Listing 12.11
 * 12.9 Defining Custom Exception Classes
 */
package chapter12.example.listing12_10;



/**
 * Exercise the Circle class
 * @author emaph
 */
public class TestCircleWithCustomException {
    /** Main method */
    public static void main(String[] args) {
        try {
            CircleWithCustomException c1 = new CircleWithCustomException(5);
            CircleWithCustomException c2 = new CircleWithCustomException(-5);
            CircleWithCustomException c3 = new CircleWithCustomException(0);
        }
        catch (InvalidRadiusException ex) {
            System.out.println(ex);
        }

        System.out.println("The number of objects created is "
             + CircleWithCustomException.getNumberOfObjects());
    }
}

/*
chapter12.example.listing12_10.InvalidRadiusException: Invalid radius-5.0
The number of objects created is 1
*/
