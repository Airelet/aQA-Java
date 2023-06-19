package homework8;

public class Flower {
    String flowersColor;
    String fruitsColor;

    public Flower(String flowersColor) {
        this.flowersColor = flowersColor;
    }

    public Flower(String flowersColor, String fruitsColor) {
        this.flowersColor = flowersColor;
        this.fruitsColor = fruitsColor;
    }

    public boolean hasFruits() {
        return this.fruitsColor != null;
    }

    public void printFlower() {
        System.out.println("Also it has " + flowersColor + " flowers.\uD83C\uDF38");
    }

    public void printFruit() {
        System.out.println("Which turn into " + fruitsColor + " fruits.\uD83C\uDF36\uFE0F");
    }
}
