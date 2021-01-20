package generic.methods;

import java.util.Arrays;
import java.util.stream.Stream;

public class Arguments {

    static <T extends Comparable<T>> T max(T t1, T t2, T t3) {
        return Stream.of(t1, t2, t3).max(T::compareTo).orElseThrow();
    }

    @SafeVarargs
    static <T extends Comparable<T>> T max(T... elements) {
        return Arrays.stream(elements).max(T::compareTo).orElseThrow();
    }
}
