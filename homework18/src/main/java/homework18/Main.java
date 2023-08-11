package homework18;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductMarket market = new ProductMarket(
                List.of(
                        new Product("Vanilla Ice Cream", 12.89),
                        new Product("Nuts Mix", 2.89),
                        new Product("Baguette: Hawaii", 2.25),
                        new Product("Lays KFC Chicken", 10.00),
                        new Product("Lays Subway Teriyaki", 1.19),
                        new Product("Bell Peppers", 1.75),
                        new Product("Yellow Onion", 5.00),
                        new Product("Persil Gel", 21.69)
                )
        );
        System.out.println(market.getNames());
        System.out.println(market.getNamesInAlphabeticalOrder());
        System.out.println(market.getPricesHigherThan10());
        System.out.println(market.getPricesLowerThan5());
        System.out.println(market.printPrices());

        //homework 17
        System.out.println(market.printPricesAsc());
    }
}