/*
 * Check Point 12.2.6 A
 * What does this print.
 */
package chapter12.example.examples;


public class Test12_2_6B {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            try {
                System.out.print(i + " ");
                System.out.print(1 / 0);  // never prints
            } catch (Exception ex) {
            }
            System.out.println("Continue after catch block");
        }
    }
}
/*  the same as A
0 Continue after catch block
1 Continue after catch block
*/