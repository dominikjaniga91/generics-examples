package generic.methods;

import java.util.List;

class Printer {

    /**
     * {@code List<E> vs List<?> }
     *
     * {@code List<E>} is more powerful, for instance we can add element to that list.
     * We can't do that in case of wildcard. However this method is responsible only for
     * printing the elements of the list so unbounded wildcard is enough.
     *
     * @param elements the list of unknown type.
     */
    static void printMe(List<?> elements) {
        elements.forEach(System.out::println);
    }
}
