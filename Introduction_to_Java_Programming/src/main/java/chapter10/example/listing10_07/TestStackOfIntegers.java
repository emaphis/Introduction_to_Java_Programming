/*
 * Listing 10.7
 * 10.6 Case Study: Designing a Class for Stacks
 */
package chapter10.example.listing10_07;

/**
 * Exercise the StackOfIntegers class
 * @author emaph
 */
public class TestStackOfIntegers {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 0; i < 10; i++)
            stack.push(i);

        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }
}

// 9 8 7 6 5 4 3 2 1 0
