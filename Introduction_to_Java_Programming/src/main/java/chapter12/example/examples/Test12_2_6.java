/*
 * Check Point 12.2.6 A
 * What does this print.
 */
package chapter12.example.examples;


public class Test12_2_6 {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.print(i + " ");
            try {
                //System.out.print(1 / 0);  // never prints
            } catch (Exception ex) {
            }
            System.out.println("Continue after catch block");
        }
    }
}
/*
0 Continue after catch block
1 Continue after catch block
*/