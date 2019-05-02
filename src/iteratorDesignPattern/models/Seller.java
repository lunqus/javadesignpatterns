package iteratorDesignPattern.models;

import iteratorDesignPattern.DevStoreCatalog;
import iteratorDesignPattern.GeekyStoreCatalog;
import iteratorDesignPattern.Product;

public class Seller {
    GeekyStoreCatalog geekyStoreCatalog;
    DevStoreCatalog devStoreCatalog;

    public Seller(GeekyStoreCatalog geekyStoreCatalog, DevStoreCatalog devStoreCatalog) {
        this.geekyStoreCatalog = geekyStoreCatalog;
        this.devStoreCatalog = devStoreCatalog;
    }

    public void printCatalog() {
        GeekyStoreIterator geekyStoreIterator = geekyStoreCatalog.createIterator();
        System.out.println("Printing Geeky Catalog: ");
        printCatalog(geekyStoreIterator);

        DevStoreIterator devStoreIterator = devStoreCatalog.createIterator();
        System.out.println("Printing Dev Catalog: ");
        printCatalog(devStoreIterator);
    }

    public void printCatalog(GeekyStoreIterator iterator) {
        while (iterator.hasNext()) {
            Product product = (Product) iterator.next();
            System.out.print(product.getName() + ", ");
            System.out.print(product.getDescription() + " ");
            System.out.println(product.getPrice());
        }
    }

    public void printCatalog(DevStoreIterator iterator) {
        while (iterator.hasNext()) {
            Product product = (Product) iterator.next();
            System.out.print(product.getName() + ", ");
            System.out.print(product.getDescription() + " ");
            System.out.println(product.getPrice());
        }
    }
}
