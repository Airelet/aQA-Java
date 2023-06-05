package homework4;

import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {
        //task 1
        final double oneInchInCm = 2.54;
        double cm = 10;
        double inch = 25;
        double lengthUS = cm / oneInchInCm;
        double lengthROW = inch * oneInchInCm;
        System.out.printf("1. %.2f cm in inches: %.2f\n", cm, lengthUS);
        System.out.printf("%.2f inches to cm %.2f\n", inch, lengthROW);

        //task 2
        double oneEurInUah = 28.00;
        double salary = 5_000;
        double yearlySalary = 12 * salary;
        double parentsMoney = 5_000;
        double vacationMoney = yearlySalary + parentsMoney;
        double vacationMoneyEuro = vacationMoney / oneEurInUah;
        System.out.printf("2. Total: %.2fEUR\n", vacationMoneyEuro);

        //task 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("3. Введите двузначное число:");
        int x = scanner.nextInt();
        if (x >= 10 && x < 100) {
            int ones = x % 10;
            int tens = (x - ones) / 10;
            System.out.println(ones + " " + tens);
        } else {
            System.out.println("Вы ввели не двузначное число");
        }


        //task 4
        System.out.println("4. Введите двузначное число:");
        x = scanner.nextInt();
        if (x >= 10 && x < 100) {
            int ones = x % 10;
            int tens = x - ones;
            System.out.println(tens + "+" + ones);
        } else {
            System.out.println("Вы ввели не двузначное число");
        }

        //task 5
        System.out.println("5. Введите двузначное число:");
        x = scanner.nextInt();
        if (x >= 10 && x < 100) {
            int ones = x % 10;
            int tens = (x - ones) / 10;
            int weight = ones + tens;
            System.out.println(weight);
        } else {
            System.out.println("Вы ввели не двузначное число");
        }

        //task 6
        System.out.println("6. Введите число:");
        double x2 = scanner.nextDouble();
        if (x2 > 0) {
            System.out.println("Положительное");
        } else if (x2 < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Ноль");
        }

        //task 7
        System.out.println("7. Введите целое число:");
        x = scanner.nextInt();
        if (x >= 100) {
            System.out.println(--x);
        }

        //task 8
        System.out.println("8. Введите двузначное число:");
        x = scanner.nextInt();
        if (x >= 10 && x < 100) {
            int ones = x % 10;
            int tens = (x - ones) / 10;
            int mul = ones * tens;
            if (x > mul) {
                System.out.printf("%d больше, чем произведение его цифр(%d)\n", x, mul);
            } else if (x < mul) {
                System.out.printf("%d меньше, чем произведение его цифр(%d)\n", x, mul);
            } else {
                System.out.printf("Число равно произведению его цифр %d\n", x);
            }
        } else {
            System.out.println("Вы ввели не двузначное число");
        }

        scanner.close();
    }
}