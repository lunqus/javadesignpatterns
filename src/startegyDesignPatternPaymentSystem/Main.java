package startegyDesignPatternPaymentSystem;

import startegyDesignPatternPaymentSystem.controller.CreditCardAlgorithm;
import startegyDesignPatternPaymentSystem.controller.PayPalAlgorithm;
import startegyDesignPatternPaymentSystem.controller.ShoppingCart;
import startegyDesignPatternPaymentSystem.model.Product;

public class Main {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Product pants = new Product("234", 25);
        Product shirt = new Product("987", 15);

        cart.addProduct(pants);
        cart.addProduct(shirt);

        // Payment decision
        cart.pay(new PayPalAlgorithm("p@p.com", "qwerty"));

        cart.pay(new CreditCardAlgorithm("Paolo", "9896943"));
    }
}
