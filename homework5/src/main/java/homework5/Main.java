package homework5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //task 1
        System.out.println("Задача 1:");
        for (int i = 1_000; i < 10_000; i += 3) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        //task 2
        System.out.println("Задача 2:");
        for (int i = 10; i > -10; i -= 4) {
            if (i < 0) {
                continue;
            }
            System.out.printf("%d ", i);
        }
        System.out.println();

        //task 3
        System.out.println("Задача 3:");
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        long factorial = 1;
        while (n <= 0) {
            System.out.println("Введите позитивное натуральное число");
            n = scanner.nextInt();
        }
        for (int i = n; i > 1; i--) {
            factorial *= i;
        }
        System.out.printf("Факториал числа равен %d\n", factorial);

        //task 4
        System.out.println("Задача 4:");
        n = 0;
        while (n <= 0) {
            System.out.println("Введите позитивное натуральное число");
            n = scanner.nextInt();
        }
        int sum = 0;
        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }
        System.out.printf("Сумма цифр числа равна %d", sum);
    }
}