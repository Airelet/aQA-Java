package homework20;

public class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero. Zero returned.");
            return 0;
        }
    }
}
