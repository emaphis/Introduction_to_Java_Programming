/*
 * Exercise 11.10
 * Implement MyStack using inheritance)
 */
package chapter11.exercise.exercise11_10;

import java.util.ArrayList;

/**
 * A Stack Class
 * @author emaph
 */
public class MyStack extends ArrayList<Object> {

    public int getSize() {
        return super.size();
    }


    public Object peek() {
        return get(getSize() - 1);
    }

    public Object pop() {
        Object obj = remove(getSize() - 1);
        return obj;
    }

    public Object push(Object obj) {
        this.add(obj);
        return obj;
    }

    @Override
    public String toString() {
        return "stack{" + super.toString() + "}";
    }
}
