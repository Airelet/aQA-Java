package homework6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //task 1
        System.out.println("Задача 1:");
        int[] arrayEven = new int[10];
        for (int i = 0; i < arrayEven.length; i++) {
            arrayEven[i] = i * 2 + 2;
        }
        for (int i : arrayEven) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : arrayEven) {
            System.out.println(i);
        }

        //task 2
        System.out.println("Задача 2:");
        int[] arrayOdds = new int[50];
        for (int i = 0; i < arrayOdds.length; i++) {
            arrayOdds[i] = i * 2 + 1;
        }
        for (int i : arrayOdds) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = arrayOdds.length - 1; i >= 0; i--) {
            System.out.print(arrayOdds[i] + " ");
        }

        //task 3
        System.out.println("\nЗадача 3:");
        int[] arrayRandom1 = new int[5];
        int[] arrayRandom2 = new int[5];
        int upperBound = 6;
        int sumArr1 = 0;
        int sumArr2 = 0;
        Random random = new Random();
        for (int i = 0; i < arrayRandom1.length; i++) {
            arrayRandom1[i] = random.nextInt(upperBound);
            arrayRandom2[i] = random.nextInt(upperBound);
        }
        for (int i : arrayRandom1) {
            System.out.print(i + " ");
            sumArr1 += i;
        }
        System.out.println();
        for (int i : arrayRandom2) {
            System.out.print(i + " ");
            sumArr2 += i;
        }
        double avgArr1 = (double) sumArr1 / arrayRandom1.length;
        double avgArr2 = (double) sumArr2 / arrayRandom2.length;
        System.out.println();
        if (avgArr1 > avgArr2) {
            System.out.printf("Среднее арифметическое первого массива(%.1f) больше, чем второго(%.1f)",
                    avgArr1, avgArr2);
        } else if (avgArr1 < avgArr2) {
            System.out.printf("Среднее арифметическое второго массива(%.1f) больше, чем первого(%.1f)",
                    avgArr2, avgArr1);
        } else {
            System.out.printf("Среднее арифметическое первого и второго массива равны(%.1f)", avgArr1);
        }
    }
}
