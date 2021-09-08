/*
 * Exercise 8.33
 *  (Geometry: polygon subareas) A convex four-vertex polygon is divided into four
 *  triangles, as shown in Figure 8.9.
 *
 *  Write a program that prompts the user to enter the coordinates of four vertices and
 *  displays the areas of the four triangles in increasing order.
 */
package chapter08.exercise.exercise08_33;

import java.util.Scanner;

/**
 * Polygon subareas
 * @author emaph
 */
public class PolygonSubareas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter x1, y1, x2, y2, x3, y3: ");
        double[][] points = get4Veticies(input);
        double[] areas = getTriangleAreas(points);
        selectionSort(areas);
        printAreas(areas);
    }

    public static double[] getTriangleAreas(double[][] verticies) {
        double[] areas = new double[4];
        double crossed[][] =  {verticies[0], verticies[2], verticies[1], verticies[3]};
        double[] center = getIntersectingPoint(crossed);
        // 0,1,2  1,2,3  2,3,0
        areas[0] = getTriangleArea(verticies[0], verticies[1], center);
        areas[1] = getTriangleArea(verticies[1], verticies[2], center);
        areas[2] = getTriangleArea(verticies[2], verticies[3], center);
        areas[3] = getTriangleArea(verticies[3], verticies[0], center);
        return areas;
    }


    public static double getTriangleArea(double[] point0, double[] point1, double[] point2) {
        if (sameLine(point0, point1, point2))
            return 0;

        double side1 = getSide(point1, point0);
        double side2 = getSide(point2, point1);
        double side3 = getSide(point0, point2);

        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

    public static double getSide(double[] point1, double[] point2) {
        int x = 0, y = 1;
        return Math.sqrt(Math.pow(point2[x] - point1[x], 2) +
                         Math.pow(point2[y] - point1[y], 2));
    }

    public static boolean sameLine(double[] point0, double[] point1, double point2[]) {
	int x = 0, y = 1;
        double ret = (point1[x] - point0[x]) * (point2[y] - point0[y]) -
	             (point2[x] - point0[x]) * (point1[y] - point0[y]);
        return ret == 0.0;
    }

    public static void selectionSort(double[] list) {

        for (int i = 0; i < list.length - 1; i++) {
          // Find the minimum in the list[i..list.length-1]
          double currentMin = list[i];
          int currentMinIndex = i;

          for (int j = i + 1; j < list.length; j++) {
            if (currentMin > list[j]) {
              currentMin = list[j];
              currentMinIndex = j;
            }
          }

          // Swap list[i] with list[currentMinIndex] if necessary;
          if (currentMinIndex != i) {
            list[currentMinIndex] = list[i];
            list[i] = currentMin;
          }
        }
    }


    public static double[] getIntersectingPoint(double[][] points) {
        int x = 0, y = 1;
        double a = points[0][y] - points[1][y];
        double b = points[0][x] - points[1][x];
        double c = points[2][y] - points[3][y];
        double d = points[2][x] - points[3][x];
        double e = (a * points[0][x]) - (b * points[0][y]);
        double f = (c * points[2][x]) - (d * points[2][y]);
        double deter = (a * d) - (b * c);

        if (deter == 0.0) return null;
        else {
            double[] point = new double[2];
            point[0] = (e * d - b * f) / deter;
            point[1] = -((a * f) - (e * c)) / deter;
            return point;
        }
    }


    public static double[][] get4Veticies(Scanner input) {
        int x = 0, y = 1;
        double[][] points = new double[4][2];  // three pairs.

        for (int i = 0; i < 4; i++) {
            points[i][x] = input.nextDouble();
            points[i][y] = input.nextDouble();
        }
        return points;
    }


    private static void printAreas(double[] areas) {
        System.out.print("The areas are ");
        for (double area : areas) {
            System.out.printf("%.2f, ", area);
        }
        System.out.println("");
    }

}

// -2.5 2 4 4 3 -2 -2 -3.5
// areas:  6.17 7.96 8.08 10.42