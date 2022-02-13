/*
 * Listing 9.11
 * Array of Objects
 */
package chapter09.example.listing09_11;

import chapter09.example.listing09_08.Circle;

/**
 *
 * @author emaph
 */
public class TotalArea {
    /** Main method */
    public static void main(String[] args) {
        // Declare circleArray
        Circle[] circleArray;

        // Create circle Attay
        circleArray = createCircleArray();

        // Print circleArray and total areas of the circles
        printCircleArray(circleArray);
    }

    /** Create an array of Circle objects */
    public static Circle[] createCircleArray() {
        Circle[] circleArray = new Circle[5];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new Circle(Math.random() * 100);
        }

        return circleArray;
    }

    /** Print an array of circle and their total area */
    public static void printCircleArray(Circle[] circleArray) {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (int q = 0; q < circleArray.length; q++) {
            Circle c = circleArray[q];
            System.out.printf("%-30f%-15f\n", c.getRadius(), c.getArea());
        }
        System.out.println("____________________________________________");
        System.out.printf("%-30s%-15f\n", "The total area of circles is",
                sum(circleArray));
    }

    /** Add circle areas */
    public static double sum(Circle[] circleArray) {
        double sum = 0;

        // Add areas to dum
        for (int i = 0; i < circleArray.length; i++)
            sum += circleArray[i].getArea();

        return sum;
    }
}

/*
Radius                        Area
73.294495                     16876.896543
32.781990                     3376.140440
77.469024                     18854.110006
50.625628                     8051.758080
5.360685                      90.279787
____________________________________________
The total area of circles is  47249.184855 
*/
