/*
 * Check Point 2.16
 */
package chapter02.check_point;

/**
 *
 * @author emaph
 */
public class CheckPoint02_16 {
    // 2.16.1 Can different types of numeric values be used together in a computation?
    // Yes.

    // 2.16.2 What does an explicit casting from a double to an int do with the fractional part
    //            of the double value? Does casting change the variable being cast?
    // Fractionl part is ignored
    // Casting doesn't change the original vavlirable
    // 2.16.3 Show the following output:
    static void output() {
        float f = 12.5F;
        int i = (int) f;
        System.out.println("f is " + f);
        System.out.println("i is " + i);
    }

    // 2.16.4 If you change (int)(tax * 100) / 100.0 to (int)(tax * 100) / 100 in line
    //           11 in Listing 2.8, what will be the output for the input purchase amount of 197.556?
    static void tax() {
        double tax = 197.55;

        double oldTax = (int) (tax * 100) / 100.0;
        System.out.println("old: " + oldTax);

        double newTax = (int) (tax * 100) / 100;
        System.out.println("new: " + newTax);
    }

    // 2.16.5 Show the output of the following code:
    static void output2() {
        double amount = 5;
        System.out.println(amount / 2);
        System.out.println(5 / 2);
    }

    // 2.16.6  Write an expression that rounds up a double value in variable d to an integer.
    //   (int) (num + 0.5)

    public static void main(String[] args) {
        //output();
        //tax();
        output2();
    }

}
