package homework7;

import java.util.Scanner;

import static homework7.Calculator.calc;
import static homework7.InputHandler.getInt;
import static homework7.InputHandler.getOperation;

public class Homework7 {
    public static void man(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = getInt(scanner);
        char operator = getOperation(scanner);
        int num2 = getInt(scanner);
        System.out.println("=");
        System.out.println(calc(num1, num2, operator));
        scanner.close();
    }
}
