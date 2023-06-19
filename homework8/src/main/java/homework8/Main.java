package homework8;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Flower flower = new Flower("white", "green");
        Plant plant = new Plant("Capsicum", 25, "green", flower);
        plant.printPlant(1);

        Plant plant2 = new Plant("Alocasia sanderiana", 35, "dark green, with light green veins");
        plant2.printPlant(2);

        Flower flower3 = new Flower("pink and white");
        Plant plant3 = new Plant("Dianthus caryophyllus", 16, "green", flower3);
        plant3.printPlant(3);

        Scanner scanner = new Scanner(System.in);

        plant.printUpdates(scanner);
        plant2.printUpdates(scanner);
        plant3.printUpdates(scanner);

        scanner.close();
    }

}