package homework7;

public class Calculator {
    public static int calc(int num1, int num2, char operation) {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                System.out.println("Calculation error");
                return 0;
        }
    }
}
