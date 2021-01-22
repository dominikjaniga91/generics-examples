package cannot;

class Primitives<T> {

    /**
     * No, you can’t use primitive type as type argument. The reason is type erasure.
     * After type erasure, the Pair<Double> has fields of type Object.
     *
     */
    public static void main(String[] args) {
//        Primitives<int> primitives = new Primitives<int>();
    }
//    List<int> primitive = new ArrayList<>();
}
