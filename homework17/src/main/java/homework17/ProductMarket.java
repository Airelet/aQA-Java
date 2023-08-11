package homework17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMarket {
    private ArrayList<Product> products = new ArrayList<>();

    public ProductMarket(List<Product> products) {
        this.products.addAll(products);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<String> getNames() {
        List<String> names = new ArrayList<>();
        for (Product p : products) {
            names.add(p.getName());
        }
        return names;
    }

    public List<String> getNamesInAlphabeticalOrder() {
        List<String> namesSorted = getNames();
        Collections.sort(namesSorted);
        return namesSorted;
    }

    public List<Double> getPricesHigherThan10() {
        List<Double> pricesHigherThan10 = new ArrayList<>();
        for (Product p : products) {
            if (p.getPrice() > 10) {
                pricesHigherThan10.add(p.getPrice());
            }
        }
        return pricesHigherThan10;
    }

    public List<Double> getPricesLowerThan5() {
        List<Double> pricesLowerThan5 = new ArrayList<>();
        for (Product p : products) {
            if (p.getPrice() < 5) {
                pricesLowerThan5.add(p.getPrice());
            }
        }
        return pricesLowerThan5;
    }

    public String printPrices() {
        return String.join(", ", getStringPrices());
    }

    public String printPricesAsc() {
        return String.join(", ", getStringPricesAsc());
    }

    private List<String> getStringPrices() {
        List<String> prices = new ArrayList<>();
        for (Product p : products) {
            prices.add(String.valueOf(p.getPrice()));
        }
        return prices;
    }

    private List<String> getStringPricesAsc() {
        List<String> prices = new ArrayList<>();
        Collections.sort(products);
        for (Product p : products) {
            prices.add(String.valueOf(p.getPrice()));
        }
        return prices;
    }
}
