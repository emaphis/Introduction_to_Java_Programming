/*
 * Check Point 11.13
 * 11.13 Case Study: A Custom Stack Class
 */
package chapter11.check_point;

import chapter11.example.listing11_10.MyStack;

public class CheckPoint11_13 {
    public static void main(String[] args) {
    // 11.13.1 Write statements that create a MyStack and add number 11 to the stack.
        MyStack stack = new MyStack();
        stack.push(11);  // autoboxed.

        int num = (int)stack.pop();
        System.out.println("number: " + num);
    }
}
