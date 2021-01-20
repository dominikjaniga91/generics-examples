package generify;

class Pair<T> {

    private T first;
    private T second;

    void set(T o1, T o2) {
        this.first = o1;
        this.second = o2;
    }

    T getFirst() {
        return first;
    }

    T getSecond() {
        return second;
    }

}