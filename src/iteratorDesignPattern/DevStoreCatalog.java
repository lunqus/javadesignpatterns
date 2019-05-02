package iteratorDesignPattern;

import iteratorDesignPattern.models.DevStoreIterator;

public class DevStoreCatalog {
    private static final int MAX_ITEMS = 4;
    private int numberOfProducts = 0;
    Product[] catalog;

    public DevStoreCatalog() {
        catalog = new Product[MAX_ITEMS];

        addItem("C++ is not dead. Yet!", "T-Shirt", 39.99);
        addItem("Java Rocks. Yes", "Silky mouse-pad", 19.99);
        addItem("Java Design Patterns", "Book - A must!", 139.99);
        addItem("Web development Cookbook", "The best Web Development cookbook - 2018", 39.99);

    }

    private void addItem(String name, String description, double price) {
        Product product = new Product(name, description, price);

        if (numberOfProducts >= MAX_ITEMS) {
            System.out.println("Catalog is Full - can't add products.");
        } else {
            catalog[numberOfProducts] = product;
            numberOfProducts = numberOfProducts + 1;
        }
    }

//    public Product[] getCatalog() {
//        return catalog;
//    }

    public DevStoreIterator createIterator() {
        return new DevStoreIterator(catalog);
    }
}
