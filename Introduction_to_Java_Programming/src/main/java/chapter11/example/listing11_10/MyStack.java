/*
 * Listing 11.10
 * 11.13 Case Study: A Custom Stack Class
 */
package chapter11.example.listing11_10;

import java.util.ArrayList;

/**
 * A Stack Class
 * @author emaph
 */
public class MyStack {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}
