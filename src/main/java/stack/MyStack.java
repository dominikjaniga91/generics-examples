package stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack<E> {

    private E[] elements;
    private static final int INITIAL_CAPACITY = 20;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public MyStack() {
        this.elements = (E[]) new Object[INITIAL_CAPACITY];
    }

    public boolean isEmpty() {
        return size == 0 && elements[size] == null;
    }

    public int size() {
        return size;
    }

    public E push(E stackElement) {
        System.out.println(" size " + size + " length " + elements.length);
        if (size == elements.length) {
            increaseCapacity();
        }
        elements[size++] = stackElement;
        return stackElement;
    }

    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        E element = elements[--size];
        elements[size] = null;
        return element;
    }

    public E peek() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return elements[size - 1];
    }

    private void increaseCapacity() {
        elements = Arrays.copyOf(elements, size + size/2);
    }
}
