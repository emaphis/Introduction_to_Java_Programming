/*
 * Listing 10.8
 * 10.6 Case Study: Designing a Class for Stacks
 */
package chapter10.example.listing10_07;

/**
 *
 * @author emaph
 */
public class StackOfIntegers {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    /** Construct a stack with the default capacity 16 */
    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }

    /** Construct a stack with the specified capacity */
    public StackOfIntegers(int capacity) {
        this.elements = new int[capacity];
        this.size = 0;
    }


    /** Push a new integer to the top of the stack */
    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        elements[size++] = value;
    }

    /** Return and remove the top element from the stack */
    public int pop() {
        return elements[--size];
    }

    /** Return the top element from the stack */
    public int peek() {
        return elements[size - 1];
    }

    /** Test whether the stack is empty */
    public boolean empty() {
        return size == 0;
    }

    /** Return the number of elements in the stack */
    public int  getSize() {
        return size;
    }
}
