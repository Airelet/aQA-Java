package homework18;

public class Product implements Comparable<Product> {

    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product anotherProduct) {
        return Double.compare(getPrice(), anotherProduct.getPrice());
    }
}
