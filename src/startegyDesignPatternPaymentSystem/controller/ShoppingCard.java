package startegyDesignPatternPaymentSystem.controller;

import startegyDesignPatternPaymentSystem.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCard {

    List<Product> productList;

    public ShoppingCard() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Product product : productList) {
            sum += product.getPrice();
        }
        return sum;
    }

    public void pay() {
        int amount = calculateTotal();
    }
}
