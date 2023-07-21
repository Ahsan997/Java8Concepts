/**
 * This is a functional interface in which Addition, Subtraction, Multiplication and Division operations of Integer and Double values can be performed.
 * @param <T> The type (Integer / Double) of which the operation to be performed.
 */
public interface Calculation<T> {
    /**
     * This method is a generic method for any operation to be performed and its implementation is in main method via lambda expression.
     * @param x First operand.
     * @param y Second operand.
     * @return Result of the operation.
     */
    T calculate(T x,T y);

    /**
     * Interfaces can have concrete methods when written with a default keyword.
     * @param result Parameter to be printed out.
     */
    default void printResult(T result){
        System.out.println("The result of the operation is: "+result);
    }
    /**
     * Interfaces can also have static methods which are then used in method referencing.
     */
    static void printHelloWorld(){
        System.out.println("Hello World !");
    }
}