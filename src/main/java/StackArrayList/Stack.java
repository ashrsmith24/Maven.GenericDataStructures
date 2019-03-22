package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */

// implement Stack<E> to use an ArrayList as a stack
public class Stack<E> extends java.util.Stack<E> {
    private ArrayList<E> elements;
    public Stack(){
        elements = new ArrayList<>();
    }
    // make the push function
    public E push(E nextElement) {
        elements.add(nextElement);
        return nextElement;
    }
    // make the pop function
    public E pop() {
        if (isEmpty()) { throw new IndexOutOfBoundsException("Stack is empty"); }
        return elements.remove(elements.size() - 1);
    }
    // make the isEmpty function
    public boolean isEmpty() {
        return elements.size() == 0;
    }

    public E peek() {
        if (!isEmpty()) {
            return elements.get(elements.size() - 1);
        }
        return null;
    }
}
