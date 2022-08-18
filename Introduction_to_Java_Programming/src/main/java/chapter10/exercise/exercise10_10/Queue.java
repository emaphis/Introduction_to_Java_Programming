/*
 * Exercise 10.10
 * The Queue class
 */
package chapter10.exercise.exercise10_10;

/**
 * The Queue class
 * @author emaph
 */
public class Queue {
  private final int STARTING_SIZE = 8;
  private int[] elements;
  private int size;

  /** Construct a queue with the default capacity 8 */
  public Queue() {
    this.elements = new int[STARTING_SIZE];
    this.size = 0;
  }

  /** Add a new integer into the queue */
  public void enqueue(int v) {
    if (size >= elements.length) {
      int[] temp = new int[elements.length * 2];
      System.arraycopy(elements, 0, temp, 0, elements.length);
      elements = temp;
    }

    elements[size++] = v;
  }

  /** Remove and return an element from the queue */
  public int dequeue() {
    int v = elements[0];

    // Shift all elements in the array left
    for (int i = 0; i < size - 1; i++) {
      elements[i] = elements[i + 1];
    }
    size--;

    return v;
  }

  /** Test whether the queue is empty */
  public boolean empty() {
    return size == 0;
  }

  /** Return the number of elements in the queue */
  public int getSize() {
    return size;
  }

}
