/*
 * Check Point 12.11
 * 12.11 File Input and Output
 */
package chapter12.check_point;

import java.util.Scanner;

public class CheckPoint12_11 {
    // 12.11.1 How do you create a PrintWriter to write data to a file? What is the
    //         reason to declare throws Exception in the main method in Listing 12.13,
    //         WriteData.java? What would happen if the close() method were not invoked
    //         in Listing 12.13?
    // a- Passing the path of a file of a File object to PrinterWriters constuctor
    //    Declare throws Exception because the PrinterWriter cah throw exceptions
    //    You would leak the file recource and data may not be saved.


    // 12.11.2 Show the contents of the file temp.txt after the following program
    //         is executed:
    // a-
    /*
    amount is 32.320000 3.232000e+01
    amount is 32.3200 3.2320e+01
     false
      Java
    */
    static void test02() throws Exception {
        java.io.PrintWriter output =
                new java.io.PrintWriter("resource/txt/temp.txt");
        output.printf("amount is %f %e\r\n", 32.32, 32.32);
        output.printf("amount is %5.4f %5.4e\r\n", 32.32, 32.32);
        output.printf("%6b\r\n", (1 > 2));
        output.printf("%6s\r\n", "Java");
        output.close();
    }


    // 12.11.3 Rewrite the code in the preceding question using a try-with-resources syntax.
    static void test03() throws Exception {
        try (java.io.PrintWriter output =
                new java.io.PrintWriter("resource/txt/temp.txt")) {
            output.printf("amount is %f %e\r\n", 32.32, 32.32);
            output.printf("amount is %5.4f %5.4e\r\n", 32.32, 32.32);
            output.printf("%6b\r\n", (1 > 2));
            output.printf("%6s\r\n", "Java");
        }
    }


    // 12.11.4 How do you create a Scanner to read data from a file? What is the reason to define
    //         throws Exception in the main method in Listing 12.15, ReadData.java? What
    //         would happen if the close() method were not invoked in Listing 12.15?
    // a- Passing the path of a file of a File object to Scanner constuctor
    //    Declare throws Exception because the Scanner can throw exceptions on failed opperations
    //    You would leak the file recource.


    // 12.11.5 What will happen if you attempt to create a Scanner for a nonexistent file?
    //         What will happen if you attempt to create a PrintWriter for an existing file?
    // a-  Both will throw IOExceptions


    // 12.11.6 Is the line separator the same on all platforms? What is the line separator on
    //         Windows?
    // a- No.  It's \r\n on windows while it's \n on everything else


    // 12.11.7 Suppose you enter 45 57.8 789, then press the Enter key.
    //         Show the contents of the variables after the following code is executed:
    // a- 45  57.8  "789"
    static void test07() {
        Scanner input = new Scanner(System.in);
        int intValue = input.nextInt();
        double doubleValue = input.nextDouble();
        String line = input.nextLine();
        input.close();
        System.out.println(intValue + " " + doubleValue + " " + line);
    }


    // 12.11.8 Suppose you enter 45, press the Enter key, enter 57.8, press the
    //         Enter key, and enter 789, press the Enter key. Show the contents
    //         of the variables after the following code is executed:
    // a-  45 57.8
    static void test08() {
        Scanner input = new Scanner(System.in);
        int intValue = input.nextInt();
        double doubleValue = input.nextDouble();
        String line = input.nextLine();
        input.close();
        System.out.println(intValue + " " + doubleValue + " " + line);
    }

    public static void main(String[] args) throws Exception {
        test08();
    }
}
