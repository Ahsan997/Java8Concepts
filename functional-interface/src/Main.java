public class Main {
    public static void main(String[] args) {
        Calculation<Integer> calculation = (x, y) -> x + y;
        calculation.printResult(calculation.calculate(5,4));

        calculation = (x, y) -> x - y;
        calculation.printResult(calculation.calculate(5,4));

        calculation = (x, y) -> x * y;
        calculation.printResult(calculation.calculate(5,4));

        calculation = (x, y) -> x / y;
        calculation.printResult(calculation.calculate(5,4));

        Calculation<Double> doubleCalculation = (x, y) -> x + y;
        doubleCalculation.printResult(doubleCalculation.calculate(5.00,4.00));

        doubleCalculation = (x, y) -> x - y;
        doubleCalculation.printResult(doubleCalculation.calculate(5.00,4.00));

        doubleCalculation = (x, y) -> x * y;
        doubleCalculation.printResult(doubleCalculation.calculate(5.00,4.00));

        doubleCalculation = (x, y) -> x / y;
        doubleCalculation.printResult(doubleCalculation.calculate(5.00,4.00));

        Calculation.printHelloWorld();
    }
}