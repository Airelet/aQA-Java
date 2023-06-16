package homework8;

import java.util.Scanner;

public class Plant {
    String name;
    int size;
    String color;
    Flower flower;

    public Plant(String name, int size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    public Plant(String name, int size, String color, Flower flower) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.flower = flower;
    }

    public void compareSize(int size) {
        if (this.size < size) {
            System.out.println(this.name + " has grown by " + (size - this.size) + "cm.");
            this.size = size;
        } else {
            System.out.println("Keep going, it will grow soon.");
        }
    }

    public void printPlant(int id) {
        System.out.println(id + ". " + this.name + " is " + this.size + "cm high plant, with " + this.color + " leafs.\uD83C\uDF40");
        if (hasFlowers()) {
            flower.printFlower();

            if (this.flower.hasFruits()) {
                flower.printFruit();
            }
        }
    }

    boolean hasFlowers() {
        return flower != null;
    }

    public void printUpdates(Scanner scanner) {
        System.out.println("What's the height of your " + this.name + " today?");
        int newSize = scanner.nextInt();
        this.compareSize(newSize);
    }


}
