package stack;

public class MyStack<E> {

    private E[] elements;
    private static final int INITIAL_CAPACITY = 20;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public MyStack() {
        this.elements = (E[]) new Object[INITIAL_CAPACITY];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
