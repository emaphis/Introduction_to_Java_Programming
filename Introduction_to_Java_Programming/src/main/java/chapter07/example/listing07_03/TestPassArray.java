/*
 * Listing 7.3
 * Passing Arrays as Parameters
 */
package chapter07.example.listing07_03;

/**
 * @author emaph
 */
public class TestPassArray {
    public static void main(String[] args) {
        int[] a = {1, 2};

        // Sap elements using the swap method
        System.out.println("Befor invoking swap");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swap(a[0], a[1]);
        System.out.println("After invoking swap.");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");

        // Swap elements using the SwapFirstTwoInArray
        System.out.println("Before invoking swapFirstTwoInArray");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swapFirstTwoInArray(a);
        System.out.println("After invoking swapFirstTwoInArray");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
    }

    /** Swap two variables */
    private static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    /** Swap the fist two elements in the array */
    public static void swapFirstTwoInArray(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}
