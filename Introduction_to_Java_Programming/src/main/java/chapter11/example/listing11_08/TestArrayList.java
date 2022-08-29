/*
 * Listing 11.8
 * 11.11 The ArrayList Class
 */
package chapter11.example.listing11_08;

import chapter11.example.examples.Circle;
import java.util.ArrayList;

/**
 * Test the ArrayList class
 * @author emaph
 */
public class TestArrayList {
    public static void main(String[] args) {
        // Create a list to store some cities
        ArrayList<String> cityList = new ArrayList<>();

        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Tokyo");
        // Contains [London, Denver, Paris, Miami, Seoul, Tokyo]
        System.out.println(cityList);

        System.out.println("List size? " + cityList.size());
        System.out.println("Is Miami in the list? " +
            cityList.contains("Miami"));
        System.out.println("The location of Denver in the list? "
            + cityList.indexOf("Denver"));
        System.out.println("Is the list empty? " +
            cityList.isEmpty()); // Print false

        // Insert a new city at index 2
        cityList.add(2, "Xian");
        // Contains [London, Denver, Xian, Paris, Miami, Seoul, Tokyo]
        System.out.println(cityList);

        // Remove a city from the list
        cityList.remove("Miami");
        // Contains [London, Denver, Xian, Paris, Seoul, Tokyo]
        System.out.println(cityList);

        // Remove a city at index 1
        cityList.remove(1);
        // Contains [London, Xian, Paris, Seoul, Tokyo]
        System.out.println(cityList);

        // Display the contents in the list in reverse order
        for (int i = cityList.size() - 1; i >= 0; i--)
            System.out.print(cityList.get(i) + " ");
        System.out.println();

        // Create a list to store two circles
        ArrayList<Circle> list = new ArrayList<>();

        // Add two circles
        list.add(new Circle(2));
        list.add(new Circle(3));

        // Display the area of the firs circle in the list
        System.out.println("The area of the circle? " +
                list.get(0).getArea());
    }
}
