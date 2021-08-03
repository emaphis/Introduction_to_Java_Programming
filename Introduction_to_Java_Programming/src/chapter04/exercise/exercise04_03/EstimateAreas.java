/*
 * Exercise 4.3
 *  (Geography: estimate areas) Use the GPS locations for Atlanta, Georgia;
 *  Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina in the fig-
 *  ure in Section 4.1 to compute the estimated area enclosed by these four cities.
 *  (Hint: Use the formula in Programming Exercise 4.2 to compute the distance
 *  between two cities. Divide the polygon into two triangles and use the formula in
 *  Programming Exercise 2.19 to compute the area of a triangle.)
 */
package chapter04.exercise.exercise04_03;

/*
  Data and scheme:
    1 Charlotte (35.2270869, -80.8431267)
    2 Savannah  (32.0835407, -81.0998342)
    3 Orlando   (28.5383355, -81.3792365)
    4 Atlanta   (33.7489954, -84.3879824)

        C1    two       1 cs-sa-ac   sa segment is common
     A4   S2  triangles 2 so-oa-sa
        O3

Answer:  Area of rectangle: 97913.73028602492
                       1106060642.3027
*/

/**
 * @author emaph
 */
public class EstimateAreas {
    public static void main(String[] args) {

        // 1 Charlot
        double x1 = Math.toRadians(35.2270869);
        double y1 = Math.toRadians(-80.8431267);

        // 2 Savanna
        double x2 = Math.toRadians(32.0835407);
        double y2 = Math.toRadians(-81.0998342);

        // 3 Orlanda
        double x3 = Math.toRadians(28.5383355);
        double y3 = Math.toRadians(-81.3792365);

        // 4 Atlanta
        double x4 = Math.toRadians(33.7489954);
        double y4 = Math.toRadians(-84.3879824);

        final double RADIUS = 6371.01;


        // Calculate distances

        // triangle1 -- Charlotte - Savanna  - Atlanta
        // Charlotte to Savannah 1-2
        double distanceCS = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2)
                 + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        // Savanna to Atlanta 2-4
        double distanceSA = RADIUS * Math.acos(Math.sin(x2) * Math.sin(x4)
                 + Math.cos(x2) * Math.cos(x4) * Math.cos(y2 - y4));

        // Atlanta to Charlotte  4-1
        double distanceAC = RADIUS * Math.acos(Math.sin(x4) * Math.sin(x1)
                 + Math.cos(x4) * Math.cos(x1) * Math.cos(y4 - y1));

        // Calcuate area of triangle1
        double s1 = (distanceCS + distanceSA + distanceAC) / 2;
        double area1 = Math.sqrt(s1 * (s1 - distanceCS) * (s1 - distanceSA) * (s1 - distanceAC));



        // triangle2 -- Savana2 - Orlanda3 - Atlanta4
        // Savana to Orlando  2-3
        double distanceSO = RADIUS * Math.acos(Math.sin(x2) * Math.sin(x3)
                 + Math.cos(x2) * Math.cos(x3) * Math.cos(y2 - y3));

        // Orlando to Atlanta 3-4
        double distanceOA = RADIUS * Math.acos(Math.sin(x3) * Math.sin(x4)
                 + Math.cos(x3) * Math.cos(x4) * Math.cos(y3 - y4));

        // Savana to Atlanta  -- distanceSA

        // Calcuate area of triangle1
        double s2 = (distanceSO + distanceOA + distanceSA) / 2;
        double area2 = Math.sqrt(s2 * (s1 - distanceSO) * (s2 - distanceOA) * (s2 - distanceSA));

        // Area of rectangle is sum of two triangles
        System.out.println("Area of rectangle: " + (area1 + area2));
    }
}
