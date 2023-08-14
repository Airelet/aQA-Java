package homework18;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMarket {
    private final ArrayList<Product> products = new ArrayList<>();

    public ProductMarket(List<Product> products) {
        this.products.addAll(products);
    }

    public List<String> getNames() {
        return products.stream()
                .map(Product::getName)
                .collect(Collectors.toList());
    }

    public List<String> getNamesInAlphabeticalOrder() {
        return products.stream()
                .map(Product::getName)
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Double> getPricesHigherThan10() {
        return products.stream()
                .map(Product::getPrice)
                .filter(price -> price > 10)
                .collect(Collectors.toList());
    }

    public List<Double> getPricesLowerThan5() {
        return products.stream()
                .map(Product::getPrice)
                .filter(price -> price < 5)
                .collect(Collectors.toList());
    }

    public String printPrices() {
        return products.stream()
                .map(Product::getPrice)
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }

    public String printPricesAsc() {
        return products.stream()
                .map(Product::getPrice)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }
}
