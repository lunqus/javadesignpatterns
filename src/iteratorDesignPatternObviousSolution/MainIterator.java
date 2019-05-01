package iteratorDesignPatternObviousSolution;

import java.util.ArrayList;

public class MainIterator {

    public static void main(String[] args) {

        DevStoreCatalog devStoreCatalog = new DevStoreCatalog();
        Product[] devCatalog = devStoreCatalog.getCatalog();

        GeekyStoreCatalog geekyStoreCatalog = new GeekyStoreCatalog();
        ArrayList geekyCatalog = geekyStoreCatalog.getCatalog();

        // Loop through dev Catalog - Array
        for (int i = 0; i < devCatalog.length; i++) {
            Product product = devCatalog[i];
            System.out.print(product.getName() + " ");
            System.out.print(product.getDescription() + " ");
            System.out.println(product.getPrice());
        }

        System.out.println("===========");

        // Loop through geeky Catalog - ArrayList
        for (int i = 0; i < geekyCatalog.size(); i++) {
            Product product = (Product) geekyCatalog.get(i);
            System.out.print(product.getName() + " ");
            System.out.print(product.getDescription() + " ");
            System.out.println(product.getPrice());
        }

    }
}
