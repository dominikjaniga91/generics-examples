package pair;

import java.util.Objects;

class Pair<L extends Comparable<L>, R extends Comparable<R>> implements Comparable<Pair<L, R>> {

    private final L left;
    private final R right;

    public Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }


    L getLeft() {
        return left;
    }

    R getRight() {
        return right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(left, pair.left) &&
                Objects.equals(right, pair.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }

    @Override
    public String toString() {
        return String.format("Pair: %s %s", left, right);
    }

    @Override
    public int compareTo(Pair<L, R> other) {
        int left = this.left.compareTo(other.left);
        int right = this.right.compareTo(other.right);
        int result = left + right;
        return Integer.compare(result, 0);
    }
}
