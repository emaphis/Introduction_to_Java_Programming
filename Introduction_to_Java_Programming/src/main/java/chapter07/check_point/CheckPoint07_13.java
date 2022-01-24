/*
 * Check Point 7.13
 * 7.13 Command-Line Arguments
 */
package chapter07.check_point;

/**
 *
 * @author emaph
 */
public class CheckPoint07_13 {

    // 7.13.1 This book declares the main method as
    // Can it be replaced by one of the following lines?

    // a. public static void main(String args[])
    // a. yes
    // b. public static void main(String[] x)
    // b. yes
    // c. public static void main(String x[])
    // c. yes
    // d. static void main(String x[])
    // c. no


    // 7.13.2 Show the output of the following program when invoked using

    // 1. Java Test I have a dream

    // Number of strings is 4
    // I
    // have
    // a
    // dream

    //  2. java Test “1 2 3”

    // Number of strings is 1
    // 1 2 3

    // 3. java Test

    // Number of strings is 0


    public static void main(String[] args) {
        System.out.println("Number of strings is " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

    }
}
