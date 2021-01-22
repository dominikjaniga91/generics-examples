package cannot;

class ExceptionTest {


    /*
    <T, E> void methodThrows(T t) throws E {
        System.out.println(" You cannot throws type parameters");
    }
    */
    // 1 Yes, Using a type parameter in a throws  clause is permitted, but only if type parameter
    // is restricted to Throwable or subtype of Throwable

    <T, E extends Exception> void methodThrowsThrowable(T t) throws E {
        System.out.println(" You cannot throws type parameter unless you add Throwable as bound");
    }



    //3. Using a type parameter in a catch clause is nonsensical because of the translation by type erasure.
    /*
    <T, E extends Throwable> void methodCatch(T t) {
        try {
            System.out.println("You cannot catch or throw type parameter even if its bounded with Throwable");
        } catch (E e) {
            throw new E();
        }
    }

     */

}

//  class IllegalArgumentException<T> extends Exception {   // illegal
//      private T info;
//      public IllegalArgumentException(T arg) { info = arg; }
//      public T getInfo() { return info; }
//  }