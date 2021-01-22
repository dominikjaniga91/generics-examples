package cannot;

class InstanceOf{

    /**
     * Only reifiable types are permitted.
     * It is a compile-time error if the reference type mentioned after
     * the instanceof operator does not denote a reifiable type.
     * In other words, concrete and bounded wildcard parameterized types
     * are NOT permitted in an instanceof expression.
     *
     * The reason for disallowing non-reifiable types in instanceof expression
     * is that these parameterized types do not have an exact runtime type representation.
     */

    public <T> void instanceOfMethod(T t) {
        Integer value = 0;
//        if (value instanceof T) { }
    }
}
