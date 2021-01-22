package stack;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Represent a last-in-first-out (LIFO) stack of objects.
 *
 * @author Dominik Janiga
 * @version 0.1
 */
class MyStack<E> {

    private E[] elements;
    private static final int INITIAL_CAPACITY = 20;
    private int size = 0;

    /**
     * Creates an empty MyStack with initial capacity.
     * For example:
     *
     * <pre>
     *     {@code MyStack<Integer> stack = new MyStack<>();}
     * </pre>
     */
    @SuppressWarnings("unchecked")
    MyStack() {
        this.elements = (E[]) new Object[INITIAL_CAPACITY];
    }

    /**
     * Tests if this stack is empty.
     *
     * @return  {@code true} if internal array has no elements and size is equals to zero,
     *          otherwise return {@code false}
     */
    boolean isEmpty() {
        return size == 0 && elements[size] == null;
    }

    /**
     * @return current size of an array
     */
    int size() {
        return size;
    }

    /**
     * Pushes an element onto the top of this stack. Invoke the {@link #increaseCapacity()} method
     * when the current size of the internal array is equals to length of this array.
     *
     * @param   stackElement   the element to be pushed onto this stack.
     * @return  the {@code stackElement} argument.
     */
    E push(E stackElement) {
        if (size == elements.length) {
            increaseCapacity();
        }
        elements[size++] = stackElement;
        return stackElement;
    }

    /**
     * Removes the element at the top of this stack and returns that
     * element as the value of this function.
     *
     * @return  The element at the top of this stack (the last item).
     * @throws  EmptyStackException  if this stack is empty.
     */
    E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        E element = elements[--size];
        elements[size] = null;
        return element;
    }

    /**
     * Return the last element without removing it from the stack.
     *
     * @return  the last element of this stack
     * @throws  EmptyStackException  if this stack is empty.
     */
    E peek() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return elements[size - 1];
    }

    /**
     * Make a copy of current array with new size using {@code copyOf} from {@code Arrays}.
     * Increase the size by the half of the current size.
     *
     * @see java.util.Arrays#copyOf(Object[], int)
     */
    private void increaseCapacity() {
        elements = Arrays.copyOf(elements, size + size/2);
    }
}
