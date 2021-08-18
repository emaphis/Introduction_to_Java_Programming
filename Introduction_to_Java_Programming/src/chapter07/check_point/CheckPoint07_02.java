/*
 * Check Point 7.2
 * Array Basics
 */
package chapter07.check_point;

/**
 * @author emaph
 */
public class CheckPoint07_02 {

    // 7.2.1 How do you declare an array reference variable and how do you create an array?
    // a.  Declasre =  type[] myList
    //     Define  =    myList = new type[10];
    // all togeter:  type[] myListnew type[10];


    // 7.2.2 When is the memory allocated for an array?
    // a.  when the 'new' expression is executed.


    // 7.2.3 Indicate true or false for the following statements:
    // a. Every element in an array has the same type.
    // - True
    // b. The array size is fixed after an array reference variable is declared.
    // - False
    // c. The array size is fixed after it is created.
    // - True
    // d. The elements in an array must be of a primitive data type.
    // - False


    // 7.2.4 What is the output of the following code?
    // a. x is 60
    //    The size of numbers is 30

    public static void array4() {
        int x = 30;
        int[] numbers = new int[x];
        x = 60;
        System.out.println("x is " + x);
        System.out.println("The size of numbers is " + numbers.length);
    }


    // 7.2.5 How do you access elements in an array?
    // a.  using brackets and index -   myArray[3]


    // 7.2.6 What is the array index type? What is the lowest index? What is the representation
    //       of the third element in an array named a?
    // a. integer  b. Lowest index 0   c. array[2]


    // .2.7 Which of the following statements are valid?
    public static void array7() {
        // a. invalid
        // int i = new int(30);

        // b. valid
        double d[] = new double[30];

        // c. invalid
        // char[] r = new char(1..30);

        // d. invalid
        // int i[] = (3, 4, 3, 2);

        // e. valid
        float f[] = {2.3f, 4.5f, 6.6f};

        // f. invalid
        // char[] c = new char();
    }


    // 7.2.8 Write statements to do the following:
    public static void array8() {
        // a. Create an array to hold 10 double values.
        double[] d = new double[10];

        // add values
        for (int i = 0; i < d.length ; i++) {
            d[i] = i + 1;
        }

        // b. Assign the value 5.5 to the last element in the array.
        d[d.length - 1] = 5.5;

        // print values
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();

        // c. Display the sum of the first two elements.
        System.out.println(d[0] + d[1]);  // soult be 0.0

        // d. Write a loop that computes the sum of all elements in the array.
        double sum = 0;
        for (double e : d) {
            sum += e;
        }
        System.out.println("sum " + sum);

        // e. Write a loop that finds the minimum element in the array.
        double min = d[0];
        for (int i = 1; i < d.length; i++) {
            if (d[i] < min) min = d[i];
        }
        System.out.println("min " + min);

        // f. Randomly generate an index and display the element of this index in the array.
        int index = (int) (Math.random() * d.length);
        double rand = d[index];
        System.out.println("rand " + rand);

        //g. Use an array initializer to create another array with the initial values 3.5, 5.5,
        //    4.52, and 5.6.
        double[] another = {3.5, 5.5, 4.52, 5.6};

        // print
        for (double e : another) {
            System.out.print(e + " ");
        }
        System.out.println();

        //double f = another[100];
    }


    // 7.2.9 What happens when your program attempts to access an array element with an
    //       invalid index?
    // a.  java.lang.ArrayIndexOutOfBoundsException


    // 7.2.10 Identify and fix the errors in the following code:
    public static void array10() {
        // double[100] r;   // fix definition and initialization
        double[] r = new double[100];

        //for (int i = 0; i < r.length(); i++);    // lenght is a property, not a method, remove ecces ;
         //   r(i) = Math.random * 100;            // random is a method, use [] to acces r
        for (int i = 0; i < r.length; i++)
            r[i] = Math.random() * 100;
    }


    // .2.11 What is the output of the following code?
    // a. 1 1 1 1 1 1
    public static void array11() {
        int list[] = {1, 2, 3, 4, 5, 6};

        for (int i = 1; i < list.length; i++)
            list[i] = list[i - 1];

        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }


    public static void main(String[] args) {
        array11();
    }
}
