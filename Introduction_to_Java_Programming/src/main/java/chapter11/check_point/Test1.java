/*
 * Check Point 11.8.4
 */
package chapter11.check_point;


public class Test1 {
    public static void main(String[] args) {
        Integer[] list1 = {12, 24, 55, 1};
        Double[] list2 = {12.4, 24.0, 55.2, 1.0};
        //int[] list3 = {1, 2, 3};

        printArray(list1);
        printArray(list2);
        //printArray(list3);
    }

    private static void printArray(Object[] list) {
        for (Object object : list) {
            System.out.print(object + " ");
        }
        System.out.println();
    }
}
