package iteratorDesignPattern.models;

import iteratorDesignPattern.Product;

public class DevStoreIterator implements Iterator {

    Product[] catalog;
    int index = 0;

    public DevStoreIterator(Product[] catalog) {
        this.catalog = catalog;
    }

    @Override
    public boolean hasNext() {
        if (index >= catalog.length || catalog[index] == null)
            return false;
        else return true;
    }

    @Override
    public Object next() {
        Product product = catalog[index];
        index = index + 1;
        return product;
    }
}
