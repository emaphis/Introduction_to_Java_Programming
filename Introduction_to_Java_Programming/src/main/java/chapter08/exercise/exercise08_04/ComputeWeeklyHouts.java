/*
 * Exercise 8.4
 *  Compute the weekly hours for each employee) Suppose the weekly hours for all
 *  employees are stored in a two-dimensional array. Each row records an employ-
 *  ee’s seven-day work hours with seven columns. For example, the following array
 *  stores the work hours for eight employees. Write a program that displays employ-
 *  ees and their total hours in decreasing order of the total hours.
 */
package chapter08.exercise.exercise08_04;

/**
 *
 * @author emaph
 */
public class ComputeWeeklyHouts {
    public static void main(String[] args) {
        int[][] employeeHours = getEmployeeData();
        int[][] summary = summEmployeeData(employeeHours);

        sortEmployeeData(summary);

        printEmployeeData(summary);
    }


    private static int[][] summEmployeeData(int[][] employeeHours) {
        int summary[][] = new int[employeeHours.length][2];
        for (int empIdx = 0; empIdx < employeeHours.length; empIdx++) {
            int sum = 0;
            for (int hrsIdx = 0; hrsIdx < employeeHours[empIdx].length; hrsIdx++) {
                sum += employeeHours[empIdx][hrsIdx];
            }
            summary[empIdx][0] = empIdx;
            summary[empIdx][1] = sum;
        }
        return summary;
    }

    private static void sortEmployeeData(int[][] summary) {
        for (int i = 0; i < summary.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            int minIdx = i;

            for (int j = i + 1; j < summary.length; j++) {
                if (summary[minIdx][1] > summary[j][1]) {
                    minIdx = j;
                }
            }

            // Swap scores[i][i] with list[minIdx] if necessary;
            if (minIdx != i) {
                int temp = summary[i][0];
                summary[i][0] = summary[minIdx][0];
                summary[minIdx][0] = temp;

                temp = summary[i][1];
                summary[i][1] = summary[minIdx][1];
                summary[minIdx][1] = temp;
            }

        }
    }


    public static int[][]  getEmployeeData() {
        int[][] employeeHours =
                {{2, 4, 3, 4, 5, 8, 8},
                 {7, 3, 4, 3, 3, 4, 4},
                 {3, 3, 4, 3, 3, 2, 2},
                 {9, 3, 4, 7, 3, 4, 1},
                 {3, 5, 4, 3, 6, 3, 8},
                 {3, 4, 4, 6, 3, 4, 4},
                 {3, 7, 4, 8, 3, 8, 4},
                 {6, 3, 5, 9, 2, 7, 9}};

        return employeeHours;
    }

    private static void printEmployeeData(int[][] summary) {
        for (int i = 0; i < summary.length; i++) {
            System.out.println(summary[i][0] + " " + summary[i][1]);
        }
    }

}

