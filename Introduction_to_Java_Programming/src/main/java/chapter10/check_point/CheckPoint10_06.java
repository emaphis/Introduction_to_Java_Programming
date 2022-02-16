/*
 * Check Point 10.2
 * 10.6 Case Study: Designing a Class for Stacks
 */
package chapter10.check_point;

import chapter10.example.listing10_07.StackOfIntegers;

// 10.6.1 What happens when invoking the pop() method on a stack while size is 0?
// a.  Out od Bounds exception.


/**
 * @author emaph
 */
public class CheckPoint10_06 {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        System.out.println("Stack of size " + stack.getSize());
        try {
            int result = stack.pop();  // error //chapter10.example.listing10_07
            System.out.println("We souldn't get here = " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Opps, that was a mistake");
        }
    }
}
